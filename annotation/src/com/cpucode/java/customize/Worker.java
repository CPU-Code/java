package customize;

//如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可。
//数组赋值时，值使用{}包裹。如果数组中只有一个值，则{}可以省略
@Customize(value = 11,per = Person.p2,customize2 = @Customize2,strs = {"cpu", "code"})
public class Worker {

}
