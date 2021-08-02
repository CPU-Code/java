package formework.annotation;

import java.lang.annotation.*;

/**
 * 页面交互
 *
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 13:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CPController {
    String value() default "";
}
