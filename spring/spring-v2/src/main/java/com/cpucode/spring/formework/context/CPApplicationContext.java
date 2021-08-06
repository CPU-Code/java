package com.cpucode.spring.formework.context;

import com.cpucode.spring.formework.annotation.CPAutowired;
import com.cpucode.spring.formework.annotation.CPController;
import com.cpucode.spring.formework.annotation.CPService;
import com.cpucode.spring.formework.beans.CPBeanWrapper;
import com.cpucode.spring.formework.beans.config.CPBeanDefinition;
import com.cpucode.spring.formework.beans.config.CPBeanPostProcessor;
import com.cpucode.spring.formework.beans.support.CPBeanDefinitionReader;
import com.cpucode.spring.formework.beans.support.CPDefaultListableBeanFactory;
import com.cpucode.spring.formework.core.CPBeanFactory;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 按源码分析的套路: IOC、 DI、 MVC、 AOP
 *
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 16:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPApplicationContext extends CPDefaultListableBeanFactory implements CPBeanFactory {

    private String [] configLoactions;
    private CPBeanDefinitionReader reader;

    /**
     * 单例的 IOC 容器缓存
     */
    private Map<String,Object> singletonObjects = new ConcurrentHashMap<String, Object>();

    /**
     * 通用的 IOC 容器
     */
    private Map<String, CPBeanWrapper> factoryBeanInstanceCache = new ConcurrentHashMap<String, CPBeanWrapper>();

    public CPApplicationContext(String... configLoactions){
        this.configLoactions = configLoactions;

        try {
            refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void refresh() throws Exception{
        //1、 定位， 定位配置文件
        reader = new CPBeanDefinitionReader(this.configLoactions);
        //2、 加载配置文件， 扫描相关的类， 把它们封装成 BeanDefinition
        List<CPBeanDefinition> beanDefinitions = reader.loadBeanDefinitions();
        //3、 注册， 把配置信息放到容器里面(伪 IOC 容器)
        doRegisterBeanDefinition(beanDefinitions);
        //4、 把不是延时加载的类， 有提前初始化
        doAutowrited();
    }

    /**
     * 只处理非延时加载的情况
     */
    private void doAutowrited() {
        for (Map.Entry<String, CPBeanDefinition> beanDefinitionEntry : super.beanDefinitionMap.entrySet()) {
            String beanName = beanDefinitionEntry.getKey();

            if(!beanDefinitionEntry.getValue().isLazyInit()) {
                try {
                    // 依赖注入的入口
                    getBean(beanName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 注册 bean
     * @param beanDefinitions
     * @throws Exception
     */
    private void doRegisterBeanDefinition(List<CPBeanDefinition> beanDefinitions) throws Exception{
        for (CPBeanDefinition beanDefinition: beanDefinitions) {
            if(super.beanDefinitionMap.containsKey(beanDefinition.getFactoryBeanName())){
                throw new Exception("The “" + beanDefinition.getFactoryBeanName() + "” is exists!!");
            }

            super.beanDefinitionMap.put(beanDefinition.getFactoryBeanName(), beanDefinition);
        }

        //到这里为止， 容器初始化完毕
    }

    @Override
    public Object getBean(Class<?> beanClass) throws Exception {
        //return getBean(toLowerFirstCase(beanClass.getSimpleName()));
        return getBean(beanClass.getName());
    }

    /**
     *  依赖注入， 从这里开始， 通过读取 BeanDefinition 中的信息
     *  通过反射机制创建一个实例并返回
     * Spring 做法是， 不会把最原始的对象放出去， 会用一个 BeanWrapper 来进行一次包装
     *
     * 装饰器模式：
     *   1、 保留原来的 OOP 关系
     *   2、 我需要对它进行扩展， 增强（为了以后 AOP 打基础）
     *
     */
    @Override
    public Object getBean(String beanName) {
        CPBeanDefinition beanDefinition = this.beanDefinitionMap.get(beanName);
        Object instance = null;

        try{
            //生成通知事件
            CPBeanPostProcessor beanPostProcessor = new CPBeanPostProcessor();
            //在实例初始化以前调用一次
            //beanPostProcessor.postProcessBeforeInitialization(instance, beanName);

            instance = instantiateBean(beanName, beanDefinition);

            if(null == instance){
                return null;
            }

            //把这个对象封装到BeanWrapper中
            CPBeanWrapper beanWrapper = new CPBeanWrapper(instance);

            /**
             * 把 BeanWrapper存到 IOC容器里面
             *  初始化
             *  class A{ B b;}
             *  class B{ A a;}
             */

            // 拿到 BeanWraoper 之后，把BeanWrapper保存到IOC容器中去
            this.factoryBeanInstanceCache.put(beanName, beanWrapper);

            //在实例初始化以后调用一次
            beanPostProcessor.postProcessAfterInitialization(instance, beanName);

            // 注入
            populateBean(beanName, new CPBeanDefinition(), beanWrapper);

            //通过这样一调用， 相当于给我们自己留有了可操作的空间
            return this.factoryBeanInstanceCache.get(beanName).getWrappedInstance();

        }catch (Exception e){
            // e.printStackTrace();
            return null;
        }
    }

    /**
     * 传一个 BeanDefinition， 就返回一个实例 Bean
     * @param beanDefinition
     * @return
     */
    private Object instantiateBean(String beanName, CPBeanDefinition beanDefinition) {
        // 反射实例化，得到一个对象
        Object instance = null;
        // 拿到要实例化的对象的类名
        String className = beanDefinition.getBeanClassName();

        try{
            //因为根据 Class 才能确定一个类是否有实例
            if(this.singletonObjects.containsKey(className)){
                instance = this.singletonObjects.get(className);
            }else {
                Class<?> clazz = Class.forName(className);
                instance = clazz.newInstance();

                this.singletonObjects.put(className, instance);
                this.singletonObjects.put(beanDefinition.getFactoryBeanName(), instance);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return instance;
    }

    private void populateBean(String beanName, CPBeanDefinition gpBeanDefinition, CPBeanWrapper gpBeanWrapper) {
        Object instance = gpBeanWrapper.getWrappedInstance();
        Class<?> clazz = gpBeanWrapper.getWrappedClass();

        //判断只有加了注解的类，才执行依赖注入
        if(!(clazz.isAnnotationPresent(CPController.class) ||
                clazz.isAnnotationPresent(CPService.class))){
            return;
        }

        //获得所有的fields
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (!field.isAnnotationPresent(CPAutowired.class)){
                continue;
            }

            CPAutowired autowired = field.getAnnotation(CPAutowired.class);
            String autowiredBeanName = autowired.value().trim();
            if("".equals(autowiredBeanName)){
                autowiredBeanName = field.getType().getName();
            }

            field.setAccessible(true);
            try {
                //为什么会为NULL，先留个坑
                if(this.factoryBeanInstanceCache.get(autowiredBeanName) == null){
                    continue;
                }

                field.set(instance,
                        this.factoryBeanInstanceCache.get(autowiredBeanName).getWrappedInstance());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public String[] getBeanDefinitionNames() {
        return this.beanDefinitionMap.keySet().toArray(new String[this.beanDefinitionMap.size()]);
    }

    public int getBeanDefinitionCount(){
        return this.beanDefinitionMap.size();
    }

    public Properties getConfig(){
        return this.reader.getConfig();
    }

    /**
     * 类名本身是小写字母， 确实会出问题
     * 类也都遵循了驼峰命名法
     *
     * @param simpleName
     * @return
     */
    private String toLowerFirstCase(String simpleName) {
        char[] chars = simpleName.toCharArray();
        // 小写字母的ASCII码相差32
        chars[0] += 32;

        return String.valueOf(chars);
    }
}
