package formework.annotation;

import java.lang.annotation.*;

/**
 * 业务逻辑,注入接口
 *
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 13:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CPService {
    String value() default "";
}
