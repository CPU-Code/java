package formework.beans.config;

/**
 * @author : cpucode
 * @date : 2021/8/4
 * @time : 10:51
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPBeanPostProcessor {
    /**
     * 为在 Bean 的初始化前提供回调入口
     * @param bean
     * @param beanName
     * @return
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName)  throws Exception{
        return bean;
    }

    /**
     * 为在 Bean 的初始化之后提供回调入口
     * @param bean
     * @param beanName
     * @return
     * @throws Exception
     */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
        return bean;
    }
}
