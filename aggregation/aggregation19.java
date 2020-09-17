/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-17 17:56:43
 * @LastEditTime: 2020-09-17 18:07:34
 * @FilePath: \java\aggregation\aggregation19.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package aggregation;

public class aggregation19 {
    public static void main(String[] args) {
        //1,创建Hashmap集合对象
        Map<Student, String> map = new HashMap<Student, String>();

        // 添加元素到集合
        map.put(new Student("cpucode", 1), "4");
        map.put(new Student("cpu", 2), "5");
        map.put(new Student("hello", 3), "6");

        //3,取出元素。键找值方式
        Set<Student> keySet = map.keySet();

        // 遍历得到每一个keySet对象
        for (Student key : keySet){
            // 解析
            String value = map.get(key);

            System.out.println(key.toString() + "值是 :" + value);
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(o == null || getClass() != o.getClass()){
            return false;
        }

        Student student = (Student) o;

        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

/*
com.company.Student@1e1c5acd值是 :4
com.company.Student@2eb71b值是 :5
com.company.Student@b73a0532值是 :6
*/