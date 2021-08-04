package formework.beans;

/**
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 16:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPBeanWrapper {
    private Object wrappedInstance;
    private Class<?> wrappedClass;

    public CPBeanWrapper(Object wrappedInstance){
        this.wrappedInstance = wrappedInstance;
    }

    public Object getWrappedInstance(){
        return this.wrappedInstance;
    }

    /**
     * 返回代理以后的 Class , 可能会是这个 $Proxy0
     * @return
     */
    public Class<?> getWrappedClass(){
        return this.wrappedInstance.getClass();
    }
}
