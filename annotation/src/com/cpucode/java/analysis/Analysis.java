package analysis;

import java.lang.annotation.*;

/**
 * 描述需要执行的类名，和方法名
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Analysis {
    String className();     //代表了一套规范
    String methodName();
}

/*

    public class AnalysisImpl implements Analysis{
        public String className(){
            return "analysis.Show_demo1";
        }
        public String methodName(){
            return "show";
        }

    }
*/