package com.cpucode.spring.formework.beans.support;

import com.cpucode.spring.formework.beans.config.CPBeanDefinition;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 用对配置文件进行查找， 读取、 解析
 *
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 16:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPBeanDefinitionReader {
    private List<String> registyBeanClasses = new ArrayList<String>();
    private Properties config = new Properties();

    /**
     * 固定配置文件中的 key， 相对于 xml 的规范
     */
    private final String SCAN_PACKAGE = "scanPackage";

    public CPBeanDefinitionReader(String... locations){
        //通过 URL 定位找到其所对应的文件， 然后转换为文件流
        InputStream is = this.getClass()
                            .getClassLoader()
                            .getResourceAsStream(locations[0].replace("classpath:",""));

        try {
            config.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null != is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        doScanner(config.getProperty(SCAN_PACKAGE));
    }


    private void doScanner(String scanPackage){
        //转换为文件路径， 实际上就是把.替换为/就 OK 了
        URL url = this.getClass().getResource("/" + scanPackage.replaceAll("\\.","/"));

        File classPath = new File(url.getFile());

        for (File file : classPath.listFiles()) {
            if(file.isDirectory()){
                doScanner(scanPackage + "." + file.getName());
            }else {
                if(!file.getName().endsWith(".class")){
                    continue;
                }

                String className = (scanPackage + "." +
                        file.getName().replace(".class",""));

                registyBeanClasses.add(className);
            }
        }

    }

    public Properties getConfig(){
        return this.config;
    }

    /**
     * 把配置文件中扫描到的所有的配置信息转换为 GPBeanDefinition 对象， 以便于之后 IOC 操作方便
     * @return
     */
    public List<CPBeanDefinition> loadBeanDefinitions(){
        List<CPBeanDefinition> result = new ArrayList<CPBeanDefinition>();

        try {
            for (String className : registyBeanClasses) {
                Class<?> beanClass = Class.forName(className);

                //如果是一个接口，是不能实例化的
                //用它实现类来实例化
                if(beanClass.isInterface()) {
                    continue;
                }

                /**
                 * beanName有三种情况:
                 *   1、默认是类名首字母小写
                 *   2、自定义名字
                 *   3、接口注入
                 */
                result.add(doCreateBeanDefinition(toLowerFirstCase(beanClass.getSimpleName()),
                        beanClass.getName()));

                // 查询该方法的实现接口
                Class<?> [] interfaces = beanClass.getInterfaces();
                for (Class<?> i : interfaces) {
                    /**
                     * 如果是多个实现类，只能覆盖
                     * 可以自定义名字
                     */
                    result.add(doCreateBeanDefinition(i.getName(), beanClass.getName()));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 把每一个配信息解析成一个 BeanDefinition
     * @param factoryBeanName
     * @param beanClassName
     * @return
     */
    private CPBeanDefinition doCreateBeanDefinition(String factoryBeanName, String beanClassName){
        CPBeanDefinition cpBeanDefinition = new CPBeanDefinition();
        cpBeanDefinition.setFactoryBeanName(factoryBeanName);
        cpBeanDefinition.setBeanClassName(beanClassName);

        return cpBeanDefinition;
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
