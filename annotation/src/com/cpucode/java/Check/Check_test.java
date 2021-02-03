package Check;

import java.io.*;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 *
 * 当主方法执行后，会自动自行被检测的所有方法(加了Check注解的方法)，判断方法是否有异常，记录到文件中
 */

public class Check_test {
    public static void main(String[] args) throws IOException {
        //1.创建计算器对象
        Calculator calculator = new Calculator();
        //2.获取字节码文件对象
        Class aClass = calculator.getClass();
        //3.获取所有方法
        Method[] methods = aClass.getMethods();

        //出现异常的次数
        int number = 0;
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("annotation/src/Check/bug.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter (new OutputStreamWriter(new FileOutputStream("annotation/src/Check/bug.txt"),"utf-8"));

        for (Method method : methods){
            if (method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(calculator);
                } catch (Exception e){
                    number++;

                    bufferedWriter.write(method.getName() + "方法出异常了");
                    bufferedWriter.newLine();

                    bufferedWriter.write("异的名字 :" + e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();

                    bufferedWriter.write("异常的原因: " + e.getCause().getMessage());
                    bufferedWriter.newLine();

                    bufferedWriter.write("--------------");
                    bufferedWriter.newLine();
                }
            }
        }

        bufferedWriter.write("本次测试一共出现 " + number + " 次异常");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
