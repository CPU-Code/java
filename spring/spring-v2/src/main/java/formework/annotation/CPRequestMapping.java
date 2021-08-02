package formework.annotation;

import java.lang.annotation.*;

/**
 * 请求url
 *
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 13:27
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CPRequestMapping {
    String value() default "";
}
