package com.cpucode.pattern.factory.simplefactory;

import com.cpucode.pattern.factory.Course;
import com.cpucode.pattern.factory.JavaCourse;
import com.cpucode.pattern.factory.PythonCourse;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 21:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CourseFactory {
    public Course create(String name){
        if("java".equals(name)){
            JavaCourse javaCourse = new JavaCourse();
            javaCourse.record();

            return javaCourse;
        }else if("python".equals(name)){
            PythonCourse pythonCourse = new PythonCourse();
            pythonCourse.record();

            return pythonCourse;
        }else {
            return null;
        }
    }

    public Course create2(String className){
        try {
            if (!(null == className || "".equals(className))) {
                return (Course) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public Course create(Class<? extends Course> clazz){
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

}
