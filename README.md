<!--
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-07-12 12:03:11
 * @LastEditTime: 2020-10-08 15:06:23
 * @FilePath: \java\README.md
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
-->

# java

## 介绍

个人java语言的学习路线 , 希望自己的code可以给你带来点灵感

java编程基础 面向对象 javaAPI 集合 IO GUI JD8C 多线程 网络编程

根据尚硅谷宋老师的 `JVM` 课程的代码

根据牛客网的`编程初学者入门训练`按从入门到困难分类写的代码

根据牛客网的`剑指Offer`按从入门到困难分类写的代码

下面代码我会用√的方法表示代码是否完善, 如果没有√ ,说明代码可能我没有运行成功, 或者一些错误, 我无法排除, 供我日后方便排查 

都是自己亲手敲出来代码, 难免有些错误, 也希望大家可以指点

---------------

## 文件目录

- [基础](#基础)
- [面对对象](#面对对象)
- [javaAPI](#javaAPI)
- [异常处理](#异常处理)
- [泛型](#泛型)
- [集合](#集合)
- [IO](#IO)
- [GUI](#GUI)
- [JDBC](#JDBC)
- [多线程](#多线程)
- [Lambda表达式](#Lambda表达式)
- [网络编程](#网络编程)
- [JDK8](#JDK8)
- [单元测试](#单元测试)
- [反射](#反射)
- [注解](#注解)
- [JVM](#JVM)
- [编程初学者入门训练](#编程初学者入门训练)
- [剑指Offer](#剑指Offer)


----------

## [基础](basics)

- [x] [First__hello](basics/src/variable/First.java)
- [x] [FirstSample__发消息到控制台](basics/src/variable/FirstSample.java)
- [x] [Print_var__输出数](basics/src/variable/Print_var.java)
- [x] [Variable__变量使用](basics/src/variable/Variable.java)
- [x] [All_variable__所有变量](basics/src/variable/All_variable.java)
- [x] [Constant__常量](basics/src/variable/Constant.java)
- [x] [Type_conver__强制类型转换](basics/src/variable/Type_conver.java)
- [x] [Accuracy__byte数据精度丢失](basics/src/variable/Accuracy.java)
- [x] [Byte_assign__byte加法](basics/src/variable/Byte_assign.java)
- [x] [Scope__作用域](basics/src/variable/Scope.java)
- [x] [Type_auto__自动类型转换](basics/src/variable/Type_auto.java)
- [x] [Assignment__赋值运算符](basics/src/operator/Assignment.java)
- [x] [And_use__&_&&使用](basics/src/operator/And_use.java)
- [x] [If_add__if判断](basics/src/judgment/If_add.java)
- [x] [If_else__ifelse判断](basics/src/judgment/If_else.java)
- [x] [Else_if__elseif判断](basics/src/judgment/Else_if.java)
- [x] [Switch__Switch使用](basics/src/judgment/Switch.java)
- [x] [Case__Case使用](basics/src/judgment/Case.java)
- [x] [While__While循环](basics/src/cycle/While.java)
- [x] [Do_while__do_while循环](basics/src/cycle/Do_while.java)
- [x] [For__for循环](basics/src/cycle/For.java)
- [x] [For_for__双for循环](basics/src/cycle/For_for.java)
- [x] [Break__跳出循环](basics/src/cycle/Break.java)
- [x] [Break_out__跳出外循环](basics/src/cycle/Break_out.java)
- [x] [Continue__跳过本循环](basics/src/cycle/Continue.java)
- [x] [Rectangle__打印矩形](basics/src/cycle/Rectangle.java)
- [x] [Print_rectangle__打印矩形](basics/src/cycle/Print_rectangle.java)
- [x] [Area__矩形面积](basics/src/call/Area.java)
- [x] [Add__调用加法](basics/src/call/Add.java)
- [x] [Array__数组](basics/src/array/Array.java)
- [x] [Array_assign__数组赋值](basics/src/array/Array_assign.java)
- [x] [Array_init__数组初始化](basics/src/array/Array_init.java)
- [x] [Array_excep__数组越界异常](basics/src/array/Array_excep.java)
- [x] [Point_excep__空指针异常](basics/src/array/Point_excep.java)
- [x] [For_array__for循环遍历数组](basics/src/array/For_array.java)
- [x] [For_array2__for循环遍历数组2](basics/src/array/For_array2.java)
- [x] [For_array2__倒序](basics/src/array/For_array2.java)
- [x] [For_each__for_each循环](basics/src/array/For_each.java)
- [x] [toString_array__快速打印数组内容](basics/src/array/toString_array.java)
- [x] [Array_max__查找数组中最大的](basics/src/array/Array_max.java)
- [x] [Bubble_sort__冒泡排序](basics/src/array/Bubble_sort.java)
- [x] [two_dimen_array__二维数组的使用](basics/src/array/Two_dimen_array.java)
- [x] [Checklist__商城库存清单程序](basics/Checklist.java)
- [x] [guess_num__猜数](basics/guess_num.java)
- [x] [call_name__点名](basics/call_name.java)


- [返回目录](#文件目录)

-----------------

## [面对对象](object)

- [x] [member__访问成员](object/member.java)
- [ ] [enpty_object__空对象](object/enpty_object.java)
- [x] [Private_field__私有成员变量](object/Private_field.java)
- [ ] [object_mem__访问对象成员](object/object_mem.java)
- [x] [wrong_access__错误访问](object/wrong_access.java)
- [x] [call_method__调用接口](object/call_method.java)
- [x] [call_private__调用private接口](object/call_private.java)
- [x] [parameter_binding__参数绑定](object/parameter_binding.java)
- [x] [quote_paramater__引用参数](object/quote_paramater.java)
- [x] [quote_paramater2__引用参数](object/quote_paramater2.java)
- [x] [construction_method__构造方法](object/construction_method.java)
- [x] [error_construction__错误构造方法](object/error_construction.java)
- [x] [multiple_construction__多种构造方法](object/multiple_construction.java)

- [返回object](#面对对象)


### [Extends__继承](object/Extends)

- [x] [Extend1__测试继承](object/Extends/Extend_test.java)
- [x] [extend1__继承成员变量不重名](object/Extends/extend1.java)
- [x] [extend2__继承成员变量重名](object/Extends/extend2.java)
- [x] [extend3__继承成员变量重名真确写法](object/Extends/extend3.java)
- [x] [extend4__继承成员方法不重名](object/Extends/extend4.java)
- [x] [extend5__继承成员方法重名重写](object/Extends/extend5.java)
- [x] [extend6__重写的应用](object/Extends/extend6.java)
- [x] [extend7__继承构造方法](object/Extends/extend7.java)
- [x] [extend8__继承调用子父类](object/Extends/extend8.java)

- [返回object](#面对对象)


### [abstract__抽象类](object/abstract)

- [x] [abstract1__抽象类](object/abstract/abstract1.java)
- [ ] [abstract2__继承的综合案例](object/abstract/abstract2)

- [返回object](#面对对象)


### [Interface__接口](object/Interface)

- [x] [InterfaceDemo__抽象方法的使用](object/Interface/InterfaceDemo.java)
- [x] [InterfaceDemo2__继承默认方法](object/Interface/InterfaceDemo2.java)
- [x] [InterfaceDemo3__重写默认方法](object/Interface/InterfaceDemo3.java)
- [x] [InterfaceDemo4__静态方法的使用](object/Interface/InterfaceDemo4.java)
- [x] [InterfaceDemo5__多接口抽象方法](object/Interface/InterfaceDemo5.java)
- [x] [InterfaceDemo6__多接口默认方法](object/Interface/InterfaceDemo6.java)
- [x] [InterfaceDemo7__多接口静态方法](object/Interface/InterfaceDemo7.java)
- [x] [InterfaceDemo8__接口的多继承](object/Interface/InterfaceDemo8.java)

- [返回object](#面对对象)


### [polymorphic__多态](object/polymorphic)

- [x] [polymorphic1__多态调用方法](object/polymorphic/polymorphic1.java)
- [x] [polymorphic2__多态](object/polymorphic/polymorphic2.java)
- [x] [polymorphic3__多态转型](object/polymorphic/polymorphic3.java)
- [x] [polymorphic4__多态转型异常](object/polymorphic/polymorphic4.java)
- [x] [polymorphic5__多态转型异常判断](object/polymorphic/polymorphic5.java)
- [x] [polymorphic6__接口多态的综合案例](object/polymorphic/polymorphic6)

- [返回object](#面对对象)


### [Final__关键字](object/Final)

- [x] [Final1__局部变量的基本类型](object/Final/Final1.java)
- [x] [Final2__局部变量的引用类型](object/Final/Final2.java)

- [返回object](#面对对象)


### [Inner_class__内部类](object/Inner_class)

- [ ] [Inner_class1__成员内部类](object/Inner_class/Inner_class1.java)
- [x] [Inner_class2__匿名内部类](object/Inner_class/Inner_class2.java)
- [x] [Inner_class3__匿名内部类作为参数传递](object/Inner_class/Inner_class3.java)
- [ ] [Inner_class4__简化匿名内部类作为参数传递](object/Inner_class/Inner_class4.java)

- [返回object](#面对对象)


### [__引用类型](object/)

- [ ] [Inner_class4__简化匿名内部类作为参数传递](object/Inner_class/class_.java)

- [返回object](#面对对象)


### [Inner_class__综合案例——发红包](object/Inner_class)

- [返回object](#面对对象)


------------------------

## [javaAPI](javaAPI)

- [x] [string_capital__string转换为大写](javaAPI/string_capital.java)
- [x] [error_string_compare__错误string比较](javaAPI/error_string_compare.java)
- [x] [string_compare__string比较](javaAPI/string_compare.java)
- [ ] [format__替换占位符](javaAPI/format.java)
- [x] [conversion_char__转化为char](javaAPI/conversion_char.java)

- [返回目录](#文件目录)


### [Scanner](javaAPI/Scanner)

- [x] [scanner_nextint__输入数据](javaAPI/Scanner/scanner_nextint.java)
- [x] [nextInt_int__输入整数](javaAPI/Scanner/nextInt_int.java)
- [x] [nextInt_sum__和](javaAPI/Scanner/nextInt_sum.java)
- [x] [nextInt_max__最大值](javaAPI/Scanner/nextInt_max.java)
- [ ] [anonymous1__匿名对象参数](javaAPI/Scanner/anonymous1.java)
- [ ] [anonymous2__匿名对象返回值](javaAPI/Scanner/anonymous2.java)
- [ ] [anonymous3__匿名对象](javaAPI/Scanner/anonymous3.java)
- [ ] [anonymous4__匿名对象](javaAPI/Scanner/anonymous4.java)

- [返回javaAPI](#javaAPI)


### [Random](javaAPI/Random)

- [x] [print_random__随机数](javaAPI/Random/print_random.java)
- [x] [for_print_random__随机数](javaAPI/Random/for_print_random.java)
- [x] [guess_random__猜随机数](javaAPI/Random/guess_random.java)

- [返回javaAPI](#javaAPI)


### [ArrayList](javaAPI/ArrayList)

- [x] [object_array__对象数组](javaAPI/ArrayList/object_array.java)
- [x] [ArrayListMethod__集合对象](javaAPI/ArrayList/ArrayListMethod.java)
- [x] [Integer_array__Integer集合对象](javaAPI/ArrayList/Integer_array.java)
- [x] [ArrayList_number__数值添加到集合](javaAPI/ArrayList/ArrayList_number.java)
- [x] [ArrayList_object__对象添加到集合](javaAPI/ArrayList/ArrayList_object.java)
- [x] [print_ArrayList__打印集合](javaAPI/ArrayList/print_ArrayList.java)
- [x] [get_ArrayList__获取集合方法](javaAPI/ArrayList/get_ArrayList.java)

- [返回javaAPI](#javaAPI)


### [String](javaAPI/String)

- [x] [string_compare__字符串比较](javaAPI/String/string_compare.java)
- [x] [get_string__获取字符串功能](javaAPI/String/get_string.java)
- [x] [conversion_string__转换字符串功能](javaAPI/String/conversion_string.java)
- [x] [split_string__拆分字符串](javaAPI/String/split_string.java)
- [x] [concat_string__拼接字符串](javaAPI/String/concat_string.java)
- [x] [charAt_String__统计字符个数](javaAPI/String/charAt_String.java)

- [返回javaAPI](#javaAPI)


### [static](javaAPI/static)

- [x] [class_variable__类变量](javaAPI/static/class_variable.java)
- [x] [class_method__类方法](javaAPI/static/class_method.java)

- [返回javaAPI](#javaAPI)


### [Arrays](javaAPI/Arrays)

- [x] [tostring__数组转为字符串](javaAPI/Arrays/tostring.java)
- [x] [string_sort__数组升序排序](javaAPI/Arrays/string_sort.java)
- [x] [tochararray__字符串装数组升序排序](javaAPI/Arrays/tochararray_sort.java)

- [返回javaAPI](#javaAPI)


### [Math](javaAPI/Math)

- [x] [math_abs_ceil__绝对值整数](javaAPI/Math/math_abs_ceil.java)

- [返回javaAPI](#javaAPI)


### [日期时间](javaAPI/date)

- [x] [date1__Date类](javaAPI/date/date1.java)
- [x] [date2__SimpleDateFormat对象](javaAPI/date/date2.java)
- [x] [date3__format方法](javaAPI/date/date3.java)
- [x] [date4__parse方法](javaAPI/date/date4.java)
- [x] [date5__birthdayString显示](javaAPI/date/date5.java)
- [x] [date6__Calendar](javaAPI/date/date6.java)
- [x] [date7__Calendar_get](javaAPI/date/date7.java)
- [x] [date8__Calendar_set](javaAPI/date/date8.java)
- [x] [date9__Calendar_add](javaAPI/date/date9.java)
- [x] [date10__Calendar_getTime](javaAPI/date/date10.java)

- [返回javaAPI](#javaAPI)


### [System类](javaAPI/system)

- [x] [system1__currentTimeMillis](javaAPI/system/system1.java)
- [x] [system2__currentTimeMillis使用的时间](javaAPI/system/system2.java)
- [x] [system3__arraycopy](javaAPI/system/system3.java)

- [返回javaAPI](#javaAPI)


### [StringBuilder类](javaAPI/stringBuilder)

- [x] [stringBuilder1__字符串拼接](javaAPI/stringBuilder/stringBuilder1.java)
- [x] [stringBuilder2__构造方法](javaAPI/stringBuilder/stringBuilder2.java)
- [x] [stringBuilder3__append](javaAPI/stringBuilder/stringBuilder3.java)
- [x] [stringBuilder4__ toString](javaAPI/stringBuilder/stringBuilder4.java)

- [返回javaAPI](#javaAPI)


### [包装类](javaAPI/WrapperParse)

- [x] [WrapperParse1__parseInt](javaAPI/WrapperParse/WrapperParse1.java)

- [返回javaAPI](#javaAPI)


-----------------------

## [异常处理](Exception)

- [x] [Exception1__捕获异常](Exception/Exception1.java)
- [x] [Exception2__错误捕获异常](Exception/Exception2.java)
- [x] [Exception3__错误捕获异常](Exception/Exception3.java)
- [x] [Exception4__捕获异常并处理](Exception/Exception4.java)
- [x] [Exception5__捕获异常并处理](Exception/Exception5.java)
- [x] [Exception6__捕获异常](Exception/Exception6.java)
- [x] [Exception7__异常的传播](Exception/Exception7.java)
- [x] [Exception8__抛出异常](Exception/Exception8.java)
- [x] [Exception9__追踪到完整的异常栈](Exception/Exception9.java)
- [x] [Exception10__异常的产生过程](Exception/Exception10.java)
- [x] [Exception11__抛出异常throw](Exception/Exception11.java)
- [x] [Exception12__声明异常throws](Exception/Exception12.java)
- [x] [Exception13__异常类的声明](Exception/Exception13.java)
- [x] [Exception14__捕获异常try_catch](Exception/Exception14.java)
- [x] [Exception15__finally](Exception/Exception15.java)
- [ ] [Exception16__自定义异常](Exception/Exception16.java)

- [返回目录](#文件目录)


------------

## [泛型](Generic)

- [x] [Generic1__错误类型转换异常](Generic/Generic1.java)
- [x] [Generic2__泛型的引入](Generic/Generic2.java)
- [x] [Generic3__定义和使用含有泛型的类](Generic/Generic3.java)
- [x] [Generic4__泛型的方法](Generic/Generic4.java)
- [x] [Generic5__泛型的接口](Generic/Generic5.java)
- [x] [Generic6__泛型通配符](Generic/Generic6.java)
- [x] [Generic7__受限泛型](Generic/Generic7.java)

- [返回目录](#文件目录)


-----------------

## [集合](aggregation)

- [x] [aggregation1__Collection](aggregation/aggregation1.java)
- [x] [aggregation2__Iterator迭代器](aggregation/aggregation2.java)
- [x] [aggregation3__遍历数组](aggregation/aggregation3.java)
- [x] [aggregation4__遍历集合](aggregation/aggregation4.java)
- [x] [aggregation5__集合综合案例](aggregation/aggregation5.java)
- [x] [aggregation6__List接口](aggregation/aggregation6.java)
- [x] [aggregation7__LinkedList集合](aggregation/aggregation7.java)
- [x] [aggregation8__HashSet集合](aggregation/aggregation8.java)
- [ ] [aggregation9__自定义类型元素](aggregation/aggregation9.java)
- [x] [aggregation10__LinkedHashSet](aggregation/aggregation10.java)
- [x] [aggregation11__可变参数](aggregation/aggregation11.java)
- [x] [aggregation12__Collections](aggregation/aggregation12.java)
- [x] [aggregation13__Comparator比较器](aggregation/aggregation13.java)
- [x] [aggregation14__compare](aggregation/aggregation14.java)
- [x] [aggregation15__Comparable接口](aggregation/aggregation15.java)
- [x] [aggregation16__Map接口的方法](aggregation/aggregation16.java)
- [x] [aggregation17__Map集合遍历键找值](aggregation/aggregation17.java)
- [x] [aggregation18__Map集合遍历键值对](aggregation/aggregation18.java)
- [x] [aggregation19__HashMap存储自定义类型](aggregation/aggregation19.java)
- [x] [aggregation20__LinkedHashMap](aggregation/aggregation20.java)
- [x] [aggregation21__Map集合练习一个字符串中每个字符出现次数](aggregation/aggregation21.java)
- [x] [aggregation22__数字与纸牌的映射_案例需求分析](aggregation/aggregation22.java)

- [返回目录](#文件目录)


---------------

## [IO](IO)

- [x] [io1__File类获取功能的方法](IO/io1.java)
- [x] [io2__File类绝对路径和相对路径](IO/io2.java)
- [x] [io3__File类判断功能](IO/io3.java)
- [x] [io4__File类创建删除功能](IO/io4.java)
- [x] [io5__File类目录的遍历](IO/io5.java)
- [x] [io6__递归](IO/io6.java)
- [x] [io7__递归累加求和](IO/io7.java)
- [x] [io8__递归求阶乘](IO/io8.java)
- [x] [io9__递归打印多级目录](IO/io9.java)
- [x] [io10__文件搜索](IO/io10.java)
- [x] [io11__文件过滤器优化](IO/io11.java)
- [x] [io12__Lambda优化](IO/io12.java)
- [x] [io13__写出字节](IO/io13.java)
- [x] [io14__写出字节数组](IO/io14.java)
- [x] [io15__写出指定长度字节数组](IO/io15.java)
- [x] [io16__数据追加续写](IO/io16.java)
- [x] [io17__写出换行](IO/io17.java)
- [x] [io18__读取字节](IO/io18.java)
- [x] [io19__循环改进读取](IO/io19.java)
- [x] [io20__字节数组读取](IO/io20.java)
- [x] [io21__字节数组获取有效的字节](IO/io21.java)
- [x] [io22__复制图片文件](IO/io22.java)
- [x] [io23__读取字符](IO/io23.java)
- [x] [io24__字符数组读取](IO/io24.java)
- [x] [io25__获取有效的字符改进](IO/io25.java)
- [x] [io26__写出字符](IO/io26.java)
- [x] [io27__关闭和刷新](IO/io27.java)
- [x] [io28__写出字符数组](IO/io28.java)
- [x] [io29__写出字符串](IO/io29.java)
- [x] [io30__续写和换行](IO/io30.java)
- [x] [io31__IO异常的处理JDK7前处理](IO/io31.java)
- [x] [io32__IO异常的处理JDK7的处理](IO/io32.java)
- [x] [io33__IO异常的处理JDK9的改进](IO/io33.java) 
- [x] [io34__Properties类](IO/io34.java)
- [x] [io35__与流相关的方法](IO/io35.java)
- [x] [io36__基本流](IO/io36.java)
- [x] [io37__缓冲流](IO/io37.java)
- [x] [io38__数组的方式](IO/io38.java)
- [x] [io39__字符缓冲流readLine方法](IO/io39.java)
- [x] [io40__字符缓冲流newLine方法](IO/io40.java)
- [x] [io41__文本排序](IO/io41.java)
- [x] [io42__编码引出的问题](IO/io42.java)
- [x] [io43__指定编码读取](IO/io43.java)
- [x] [io44__指定编码写出](IO/io44.java)
- [x] [io45__转换文件编码](IO/io45.java)
- [x] [io46__序列化写出对象](IO/io46.java)
- [x] [io47__反序列化操作](IO/io47.java)
- [x] [io48__序列化集合](IO/io48.java)
- [x] [io49__改变打印流向](IO/io49.java)

- [返回目录](#文件目录)


--------------

## [GUI](GUI)

- [x] []()

- [返回目录](#文件目录)


--------------

## [JDBC](JDBC)

- [x] [First_jdbc__第一jdbc](JDBC/src/jdbc/jdbc/First_jdbc.java)
- [x] [Insert__添加数据](JDBC/src/jdbc/jdbc/Insert.java)
- [x] [Update__修改数据](JDBC/src/jdbc/jdbc/Update.java)
- [x] [Delete__删除数据](JDBC/src/jdbc/jdbc/Delete.java)
- [x] [Create_table__创建表](JDBC/src/jdbc/jdbc/Create_table.java)
- [x] [Select__查询表数据](JDBC/src/jdbc/jdbc/Select.java)
- [x] [Select_simplify__简化查询表数据](JDBC/src/jdbc/jdbc/Select_simplify.java)
- [x] [List_select__list封装的查询表数据](JDBC/src/jdbc/jdbc/List_select.java)
- [x] [JDBC_utils__JDBC工具的查询表数据](JDBC/src/jdbc/jdbc/JDBC_utils.java)
- [x] [Login_case__登录案例](JDBC/src/jdbc/jdbc/Login_case.java)
- [x] [Login_pre_case__使用Prepared登录案例](JDBC/src/jdbc/jdbc/Login_pre_case.java)
- [x] [Affairs__事务操作](JDBC/src/jdbc/jdbc/Affairs.java)
- [x] [First_c3p0__第一个c3p0连接池](JDBC/src/template/datasource/c3p0/First_c3p0.java)
- [x] [C3p0_exceed__c3p0连接池超过](JDBC/src/template/datasource/c3p0/C3p0_exceed.java)
- [x] [C3p0_paramether__c3p0连接池指定参数](JDBC/src/template/datasource/c3p0/C3p0_paramether.java)
- [x] [First_druid__第一个druid](JDBC/src/template/datasource/druid/First_druid.java)
- [x] [Druid_data__druid添加数据](JDBC/src/template/datasource/druid/Druid_data.java)
- [x] [First_template__第一个jdbc模板](JDBC/src/template/template/First_template.java)
- [x] [Template_data__jdbc模板传参](JDBC/src/template/template/Template_data.java)
- [x] [Template_insert__jdbc模板插入数据](JDBC/src/template/template/Template_insert.java)
- [x] [Template_delete__jdbc模板删除数据](JDBC/src/template/template/Template_delete.java)
- [x] [Select_map__查询结果封装map](JDBC/src/template/template/Select_map.java)
- [x] [Select_list__查询结果封装list](JDBC/src/template/template/Select_list.java)
- [x] [Stu_list__查询结果封装为stud对象的list](JDBC/src/template/template/Stu_list.java)
- [x] [Stu_simplify__查询结果封装为stud对象的list的简化](JDBC/src/template/template/Stu_simplify.java)
- [x] [Select_sum__查询总记录数](JDBC/src/template/template/Select_sum.java)

- [返回目录](#文件目录)


----------------

## [多线程](thread)

- [x] [thread1__重写线程](thread/src/thread/thread1.java)
- [x] [thread2__自定义线程](thread/src/thread/thread2.java)
- [x] [thread3__Runnable重写线程](thread/src/thread/thread3.java)
- [x] [thread4__匿名内部类实现线程](thread/src/thread/thread4.java)
- [x] [thread5__线程安全](thread/src/thread/thread5.java)
- [x] [thread6__线程同步](thread/src/thread/thread6.java)
- [x] [thread7__同步方法](thread/src/thread/thread7.java)
- [x] [thread8__Lock锁](thread/src/thread/thread8.java)
- [x] [thread9__Timed_Waiting](thread/src/thread/thread9.java)
- [x] [thread10__Waiting](thread/src/thread/thread10.java)
- [x] [thread11__等待唤醒机制](thread/src/thread/thread11)
- [x] [thread12__线程池](thread/src/thread/thread12.java)

- [返回目录](#文件目录)


------------

## [Lambda表达式](Lambda)

- [x] [lambda1__冗余的Runnable代码](Lambda/lambda1.java)
- [x] [lambda2__Lambda优写](Lambda/lambda2.java)
- [x] [lambda3__使用实现类](Lambda/lambda3.java)
- [x] [lambda4__使用匿名内部类](Lambda/lambda4.java)
- [x] [lambda5__Lambda标准格式的无参无返回](Lambda/lambda5.java)
- [x] [lambda6__Lambda的参数和返回值](Lambda/lambda6.java)
- [x] [lambda7__Lambda写法](Lambda/lambda7.java)
- [x] [lambda8__Lambda标准格式的有参有返回](Lambda/lambda8.java)
- [x] [lambda9__Lambda省略格式](Lambda/lambda9.java)

- [返回目录](#文件目录)


-----------

## [网络编程](network)

- [x] [Clienttcp1__客户端向服务器发送数据_客户端实现](network/Clienttcp1.java)
- [x] [Servertcp1__客户端向服务器发送数据_服务端实现](network/Servertcp1.java)
- [x] [Clienttcp2__服务器向客户端回写数据_客户端实现](network/Clienttcp2.java)
- [x] [Servertcp2__服务器向客户端回写数据_服务端实现](network/Servertcp2.java)
- [x] [Clienttcp3__文件上传案例_客户端实现](network/Clienttcp3.java)
- [x] [Servertcp3__文件上传案例_服务端实现](network/Servertcp3.java)
- [x] [Clienttcp4__文件上传优化分析_客户端实现](network/Clienttcp4.java)
- [x] [Servertcp4__文件上传优化分析_服务端实现](network/Servertcp4.java)
- [x] [Clienttcp5__信息回写分析_客户端实现](network/Clienttcp5.java)
- [x] [Servertcp5__信息回写分析_服务端实现](network/Servertcp5.java)
- [x] [Servertcp6__模拟BS服务器_无法显示图片](network/Servertcp6.java)
- [ ] [Servertcp7__模拟BS服务器_线程显示图片](network/Servertcp7.java)

- [返回目录](#文件目录)


## [JDK8](jdk8)

- [x] [jdk81__自定义函数式接口](jdk8/jdk81.java)
- [x] [jdk82__性能浪费的日志案例](jdk8/jdk82.java)
- [x] [jdk83__Lambda的更优写法](jdk8/jdk83.java)
- [x] [jdk84__Lambda的延迟](jdk8/jdk84.java)
- [x] [jdk85__Lambda作为参数和返回值](jdk8/jdk85.java)
- [x] [jdk86__Lambda作为参数和返回值2](jdk8/jdk86.java)
- [x] [jdk87__Supplier接口](jdk8/jdk87.java)
- [x] [jdk88__求数组元素最大值](jdk8/jdk88.java)
- [x] [jdk89__Consumer接口_抽象方法accept](jdk8/jdk89.java)
- [x] [jdk810__Consumer接口_默认方法andThen](jdk8/jdk810.java)
- [x] [jdk811__格式化打印信息](jdk8/jdk811.java)
- [x] [jdk812__Predicate接口_抽象方法test](jdk8/jdk812.java)
- [x] [jdk813__Predicate接口_默认方法and](jdk8/jdk813.java)
- [x] [jdk814__Predicate接口_默认方法or](jdk8/jdk814.java)
- [x] [jdk815__Predicate接口_默认方法negat](jdk8/jdk815.java)
- [ ] [jdk816__集合信息筛选](jdk8/jdk816.java)
- [x] [jdk817__Function接口_抽象方法apply](jdk8/jdk817.java)
- [ ] [jdk818__Function接口_默认方法andThen](jdk8/jdk818.java)
- [ ] [jdk819__自定义函数模型拼接](jdk8/jdk819.java)
- [x] [jdk820__传统集合的多步遍历](jdk8/jdk820.java)
- [x] [jdk821__循环遍历的弊端](jdk8/jdk821.java)
- [x] [jdk822__Stream的更优写法](jdk8/jdk822.java)

- [返回目录](#文件目录)


------------

## [单元测试](junit_test)

- [x] [CalculatorTest__测试](junit_test/src/junit/CalculatorTest.java)
- [x] [CalculatorTest__单元测试](junit_test/src/test/CalculatorTest.java)

- [返回目录](#文件目录)


------------

## [反射](reflect)

- [x] [Get_class_object__获取class对象](reflect/src/reflect/Get_class_object.java)
- [x] [Get_class_methods__获取class方法](reflect/src/reflect/Get_class_methods.java)
- [x] [Get_structure__获取class构造方法](reflect/src/reflect/Get_structure.java)
- [x] [Get_methods__获取成员方法](reflect/src/reflect/Get_methods.java)
- [x] [Reflect_test__反射测试框架](reflect/src/reflect/Reflect_test.java)

- [返回目录](#文件目录)


------------

## [注解](annotation)

- [x] [Java_Doc__java文档](annotation/src/javaDoc/Java_Doc.java)
- [x] [Annotation__注解](annotation/src/annotation/Annotation.java)
- [x] [Worker__自定义注解](annotation/src/customize/Worker.java)
- [x] [Element__元注解](annotation/src/Element/Element.java)
- [x] [Reflect_analysis__注解解析](annotation/src/analysis/Reflect_analysis.java)
- [ ] [Check_test__注解检查错误](annotation/src/Check/Check_test.java)

- [返回目录](#文件目录)


------------

## [JVM](JVM)

- [x] [Add__加法反编译](JVM/src/com/cpucode/java/stack/structure/Add.java)

- [返回目录](#文件目录)

- [ ] [__](JVM/src/com/cpucode/java/class/loading/.java)

- [返回目录](#文件目录)

- [x] [OutOfMemory__查看内存溢出](JVM/src/com/cpucode/java/heap/OutOfMemory.java)
- [x] [EdenSurvivorTest__查看各区比例](JVM/src/com/cpucode/java/heap/EdenSurvivorTest.java)
- [x] [HeapInstanceTest__查看各区数据转换](JVM/src/com/cpucode/java/heap/HeapInstanceTest.java)
- [x] [GCTest__查看各个GC的触发](JVM/src/com/cpucode/java/heap/GcTest.java)
- [x] [YoungOldAreaTest__查看大对象直接存放在Old](JVM/src/com/cpucode/java/heap/YoungOldAreaTest.java)
- [x] [TLABArgsTest__查看TLAB是否开启](JVM/src/com/cpucode/java/heap/TlabArgsTest.java)
- [x] [HeapArgsTest__查看Heap的各个参数](JVM/src/com/cpucode/java/heap/HeapArgsTest.java)
- [x] [EscapeAnalysis__判断逃逸分析](JVM/src/com/cpucode/java/heap/EscapeAnalysis.java)
- [x] [StackAllocation__逃逸分析的分配位置](JVM/src/com/cpucode/java/heap/StackAllocation.java)
- [x] [SynchronizedTest__同步省略](JVM/src/com/cpucode/java/heap/SynchronizedTest.java)
- [x] [ScalarReplace__标量替换](JVM/src/com/cpucode/java/heap/ScalarReplace.java)

- [返回目录](#文件目录)

- [x] [MethodAreaSize__方法区大小](JVM/src/com/cpucode/java/method/area/MethodAreaSize.java)
- [x] [MethodAreaOOMTest__方法区内存异常](JVM/src/com/cpucode/java/method/area/MethodAreaOomTest.java)
- [x] [MethodInnerStrucTest__查看方法区的内部构成](JVM/src/com/cpucode/java/method/area/MethodInnerStrucTest.java)
- [x] [MethodAreaFinal__查看方法区的Final](JVM/src/com/cpucode/java/method/area/MethodAreaFinal.java)
- [x] [StaticFieldTest__查看静态变量存储位置](JVM/src/com/cpucode/java/method/area/StaticFieldTest.java)
- [ ] [StaticObjectTest__查看静态类存储位置](JVM/src/com/cpucode/java/method/area/StaticObjectTest.java)
 
 - [返回目录](#文件目录)
 
- [x] [ObjectTest__对象的创建的反编译](JVM/src/com/cpucode/java/object/ObjectTest.java)
- [x] [Customer__对象实例化的过程](JVM/src/com/cpucode/java/object/Customer.java)
- [x] [CustomerTest__对象实例化的内存分布](JVM/src/com/cpucode/java/object/CustomerTest.java)

- [返回目录](#文件目录)

- [x] [BufferTest__查看直接内存大小](JVM/src/com/cpucode/java/direct/memory/BufferTest.java)
- [x] [DirectMemoryOOM__直接内存异常](JVM/src/com/cpucode/java/direct/memory/DirectMemoryOom.java)
- [x] [MaxDirectMemorySizeTest__设置直接内存大小](JVM/src/com/cpucode/java/direct/memory/MaxDirectMemorySizeTest.java)

- [返回目录](#文件目录)

- [x] [JITTest__JIT编译器的使用](JVM/src/com/cpucode/java/execution/engine/JitTest.java)
- [x] [IntCompTest__各个编译器状态](JVM/src/com/cpucode/java/execution/engine/IntCompTest.java)

- [返回目录](#文件目录)

- [x] [StringOnly__String不变性](JVM/src/com/cpucode/java/string/table/StringOnly.java)
- [x] [StringExer__String不变性](JVM/src/com/cpucode/java/string/table/StringExer.java)
- [x] [StringTableSize__StringTable大小](JVM/src/com/cpucode/java/string/table/StringTableSize.java)
- [x] [GenerateString__生成随机文字txt](JVM/src/com/cpucode/java/string/table/GenerateString.java)
- [x] [StringTime__String运行时间](JVM/src/com/cpucode/java/string/table/StringTime.java)
- [x] [StringOOM__String报错](JVM/src/com/cpucode/java/string/table/StringOom.java)
- [x] [StringConstant__String的加载个数](JVM/src/com/cpucode/java/string/table/StringConstant.java)
- [x] [StringSort__String的分类](JVM/src/com/cpucode/java/string/table/StringSort.java)
- [x] [StringAppend__String拼接](JVM/src/com/cpucode/java/string/table/StringAppend.java)
- [x] [StringNewTest__String创建对象数量](JVM/src/com/cpucode/java/string/table/StringNewTest.java)
- [x] [StringIntern__String调用intern](JVM/src/com/cpucode/java/string/table/StringIntern.java)
- [x] [StringEfficiency__String空间效率](JVM/src/com/cpucode/java/string/table/StringEfficiency.java)
- [x] [StringGCTest__String回收](JVM/src/com/cpucode/java/string/table/StringGcTest.java)

- [返回目录](#文件目录)

- [x] [RefCountGC__判断是否引用回收](JVM/src/com/cpucode/java/garbage/collection/RefCountGc.java)
- [x] [CanReliveObj__回收复活对象](JVM/src/com/cpucode/java/garbage/collection/CanReliveObj.java)
- [ ] [GCRootsTest__Roots回收情况](JVM/src/com/cpucode/java/garbage/collection/GcRootsTest.java)
- [x] [HeapOOM__堆错误](JVM/src/com/cpucode/java/garbage/collection/HeapOom.java)
- [x] [SystemGCTest__GC的finalize被调用](JVM/src/com/cpucode/java/garbage/collection/SystemGcTest.java)
- [x] [LocalVarGC__各区的变量的GC情况](JVM/src/com/cpucode/java/garbage/collection/LocalVarGc.java)
- [x] [StopTheWorldTest__STW的停顿时间](JVM/src/com/cpucode/java/garbage/collection/StopTheWorldTest.java)
- [x] [StrongReferenceTest__强引用测试](JVM/src/com/cpucode/java/garbage/collection/StrongReferenceTest.java)
- [x] [SoftReferenceTest__软引用测试](JVM/src/com/cpucode/java/garbage/collection/SoftReferenceTest.java)
- [x] [WeakReferenceTest__弱引用测试](JVM/src/com/cpucode/java/garbage/collection/WeakReferenceTest.java)
- [x] [PhantomReferenceTest__虚引用测试](JVM/src/com/cpucode/java/garbage/collection/PhantomReferenceTest.java)
- [x] [GcUseTest__使用GC类型](JVM/src/com/cpucode/java/garbage/collection/GcUseTest.java)
- [x] [GcLogTest__使用GC日志信息](JVM/src/com/cpucode/java/garbage/collection/GcLogTest.java)
- [x] [GcLogHeapTest__使用GC堆的日志信息](JVM/src/com/cpucode/java/garbage/collection/GcLogHeapTest.java)

- [返回目录](#文件目录)

- [x] [IntegerTest__int类型的自动拆装箱](JVM/src/com/cpucode/java/bytecode/structure/IntegerTest.java)
- [x] [StringTest__String类型的创建反编译](JVM/src/com/cpucode/java/bytecode/structure/StringTest.java)
- [x] [SonTest__继承的创建反编译](JVM/src/com/cpucode/java/bytecode/structure/SonTest.java)

- [返回目录](#文件目录)


-----------------

## [编程初学者入门训练](gettingStarted)

- [x] [Bc1__实践出真知](gettingStarted/src/com/cpucode/java/getting/started/Bc1.java)
- [x] [Bc2__我是大V](gettingStarted/src/com/cpucode/java/getting/started/Bc2.java)
- [x] [Bc6__小飞机](gettingStarted/src/com/cpucode/java/getting/started/Bc6.java)
- [x] [Bc17__计算表达式的值](gettingStarted/src/com/cpucode/java/getting/started/Bc17.java)
- [x] [Bc18__计算带余除法](gettingStarted/src/com/cpucode/java/getting/started/Bc18.java)
- [x] [Bc21__浮点数的个位数字](gettingStarted/src/com/cpucode/java/getting/started/Bc21.java)
- [x] [Bc22__你能活多少秒](gettingStarted/src/com/cpucode/java/getting/started/Bc22.java)
- [x] [Bc23__时间转换](gettingStarted/src/com/cpucode/java/getting/started/Bc23.java)
- [x] [Bc24__总成绩和平均数计算](gettingStarted/src/com/cpucode/java/getting/started/Bc24.java)
- [x] [Bc31__发布信息](gettingStarted/src/com/cpucode/java/getting/started/Bc31.java)
- [x] [Bc32__输出学生信息](gettingStarted/src/com/cpucode/java/getting/started/Bc32.java)
- [x] [Bc41__你是天才吗](gettingStarted/src/com/cpucode/java/getting/started/Bc41.java)
- [x] [Bc42__完美成绩](gettingStarted/src/com/cpucode/java/getting/started/Bc42.java)
- [x] [Bc43__及格分数](gettingStarted/src/com/cpucode/java/getting/started/Bc43.java)
- [x] [Bc44__判断整数奇偶性](gettingStarted/src/com/cpucode/java/getting/started/Bc44.java)
- [x] [Bc46__判断是元音还是辅音](gettingStarted/src/com/cpucode/java/getting/started/Bc46.java)
- [x] [Bc49__判断俩个数的大小关系](gettingStarted/src/com/cpucode/java/getting/started/Bc49.java)
- [x] [Bc50__计算单位阶跃函数](gettingStarted/src/com/cpucode/java/getting/started/Bc50.java)
- [x] [Bc56__线段图案](gettingStarted/src/com/cpucode/java/getting/started/Bc56.java)
- [x] [Bc71__新年快乐](gettingStarted/src/com/cpucode/java/getting/started/Bc71.java)
- [x] [Bc72__平均身高](gettingStarted/src/com/cpucode/java/getting/started/Bc72.java)
- [x] [Bc81__学好c++](gettingStarted/src/com/cpucode/java/getting/started/Bc81.java)
- [x] [Bc82__计算问题](gettingStarted/src/com/cpucode/java/getting/started/Bc82.java)
- [x] [Bc83__被5整除问题](gettingStarted/src/com/cpucode/java/getting/started/Bc83.java)
- [x] [Bc86__奇偶统计](gettingStarted/src/com/cpucode/java/getting/started/Bc86.java)
- [x] [Bc87__统计成绩](gettingStarted/src/com/cpucode/java/getting/started/Bc87.java)
- [x] [Bc103__序列重组矩阵](gettingStarted/src/com/cpucode/java/getting/started/Bc103.java)
- [x] [Bc121__小乐乐学编程](gettingStarted/src/com/cpucode/java/getting/started/Bc121.java)
- [x] [Bc122__小乐乐算平均分](gettingStarted/src/com/cpucode/java/getting/started/Bc122.java)
- [x] [Bc123__小乐乐找最大数](gettingStarted/src/com/cpucode/java/getting/started/Bc123.java)
- [x] [Bc124__小乐乐是否被叫家长](gettingStarted/src/com/cpucode/java/getting/started/Bc124.java)
- [x] [Bc125__小乐乐转换成绩](gettingStarted/src/com/cpucode/java/getting/started/Bc125.java)
- [x] [Bc132__KiKi算期末成绩](gettingStarted/src/com/cpucode/java/getting/started/Bc132.java)
- [x] [Bc133__KiKi说祝福语](gettingStarted/src/com/cpucode/java/getting/started/Bc133.java)
- [x] [Bc134__KiKi的最高分](gettingStarted/src/com/cpucode/java/getting/started/Bc134.java)
- [x] [Bc139__KiKi定义电子日历类](gettingStarted/src/com/cpucode/java/getting/started/Bc139.java)

- [返回目录](#文件目录)

- [x] [Bc3__有容乃大](gettingStarted/src/com/cpucode/java/simple/Bc3.java)
- [x] [Bc7__缩短二进制](gettingStarted/src/com/cpucode/java/simple/Bc7.java)
- [x] [Bc8__十六进制转换为十进制](gettingStarted/src/com/cpucode/java/simple/Bc8.java)
- [x] [Bc9__printf的返回值](gettingStarted/src/com/cpucode/java/simple/Bc9.java)
- [x] [Bc10__成绩输入输出](gettingStarted/src/com/cpucode/java/simple/Bc10.java)
- [x] [Bc11__学生基本信息输入输出](gettingStarted/src/com/cpucode/java/simple/Bc11.java)
- [x] [Bc12__字符金字塔](gettingStarted/src/com/cpucode/java/simple/Bc12.java)
- [x] [Bc13__ASCII码](gettingStarted/src/com/cpucode/java/simple/Bc13.java)
- [x] [Bc14__出生日期输入输出](gettingStarted/src/com/cpucode/java/simple/Bc14.java)
- [x] [Bc15__按照格式输入并交换输出](gettingStarted/src/com/cpucode/java/simple/Bc15.java)
- [x] [Bc16__字符转ASCII码](gettingStarted/src/com/cpucode/java/simple/Bc16.java)
- [x] [Bc20__KiKi算数](gettingStarted/src/com/cpucode/java/simple/Bc20.java)
- [x] [Bc25__计算体重指标](gettingStarted/src/com/cpucode/java/simple/Bc25.java)
- [x] [Bc26__计算三角形的周长和面积](gettingStarted/src/com/cpucode/java/simple/Bc26.java)
- [x] [Bc27__计算球体的体积](gettingStarted/src/com/cpucode/java/simple/Bc27.java)
- [x] [Bc28__大小写转换](gettingStarted/src/com/cpucode/java/simple/Bc28.java)
- [x] [Bc29__2的n次方计算](gettingStarted/src/com/cpucode/java/simple/Bc29.java)
- [x] [Bc30__KiKi和酸奶](gettingStarted/src/com/cpucode/java/simple/Bc30.java)
- [x] [Bc33__计算平均成绩](gettingStarted/src/com/cpucode/java/simple/Bc33.java)
- [x] [Bc34__进制A+B](gettingStarted/src/com/cpucode/java/simple/Bc34.java)
- [x] [Bc35__判断字母](gettingStarted/src/com/cpucode/java/simple/Bc35.java)
- [x] [Bc36__健康评估](gettingStarted/src/com/cpucode/java/simple/Bc36.java)
- [x] [Bc37__网购](gettingStarted/src/com/cpucode/java/simple/Bc37.java)
- [x] [Bc38__变种水仙花](gettingStarted/src/com/cpucode/java/simple/Bc38.java)
- [ ] [Bc39__争夺前五名](gettingStarted/src/com/cpucode/java/simple/Bc39.java)
- [ ] [Bc40__竞选社长](gettingStarted/src/com/cpucode/java/simple/Bc40.java)
- [ ] [Bc45__最高分数](gettingStarted/src/com/cpucode/java/simple/Bc45.java)
- [ ] [Bc47__判断是不是字母](gettingStarted/src/com/cpucode/java/simple/Bc47.java)
- [ ] [Bc48__字母大小写转换](gettingStarted/src/com/cpucode/java/simple/Bc48.java)
- [ ] [Bc51__三角形判断](gettingStarted/src/com/cpucode/java/simple/Bc51.java)
- [ ] [Bc52__衡量人体胖瘦程度](gettingStarted/src/com/cpucode/java/simple/Bc52.java)
- [ ] [Bc53__计算一元二次方程](gettingStarted/src/com/cpucode/java/simple/Bc53.java)
- [ ] [Bc54__获得月份天数](gettingStarted/src/com/cpucode/java/simple/Bc54.java)
- [ ] [Bc55__简单计算器](gettingStarted/src/com/cpucode/java/simple/Bc55.java)
- [ ] [Bc57__正方形图案](gettingStarted/src/com/cpucode/java/simple/Bc57.java)
- [ ] [Bc58__直角三角形图案](gettingStarted/src/com/cpucode/java/simple/Bc58.java)
- [ ] [Bc59__翻转直角三角形图案](gettingStarted/src/com/cpucode/java/simple/Bc59.java)
- [ ] [Bc60__带空格直角三角形图案](gettingStarted/src/com/cpucode/java/simple/Bc60.java)
- [ ] [Bc61__金字塔图案](gettingStarted/src/com/cpucode/java/simple/Bc61.java)
- [ ] [Bc62__翻转金字塔图案](gettingStarted/src/com/cpucode/java/simple/Bc62.java)
- [ ] [Bc63__菱形图案](gettingStarted/src/com/cpucode/java/simple/Bc63.java)
- [ ] [Bc65__箭形图案](gettingStarted/src/com/cpucode/java/simple/Bc65.java)
- [ ] [Bc67__正斜线形图案](gettingStarted/src/com/cpucode/java/simple/Bc67.java)
- [ ] [Bc68__X形图案](gettingStarted/src/com/cpucode/java/simple/Bc68.java)
- [ ] [Bc69__空心正方形图案](gettingStarted/src/com/cpucode/java/simple/Bc69.java)
- [ ] [Bc73__挂科危险](gettingStarted/src/com/cpucode/java/simple/Bc73.java)
- [ ] [Bc74__HTTP状态码](gettingStarted/src/com/cpucode/java/simple/Bc74.java)
- [ ] [Bc75__数字三角形](gettingStarted/src/com/cpucode/java/simple/Bc75.java)
- [ ] [Bc76__公务员面试](gettingStarted/src/com/cpucode/java/simple/Bc76.java)
- [ ] [Bc77__有序序列插入一个数](gettingStarted/src/com/cpucode/java/simple/Bc77.java)
- [ ] [Bc78__筛选法求素数](gettingStarted/src/com/cpucode/java/simple/Bc78.java)
- [ ] [Bc79__图像相似度](gettingStarted/src/com/cpucode/java/simple/Bc79.java)
- [ ] [Bc80__登录验证](gettingStarted/src/com/cpucode/java/simple/Bc80.java)
- [ ] [Bc85__包含数字9的数](gettingStarted/src/com/cpucode/java/simple/Bc85.java)
- [ ] [Bc88__有序序列插入一个数](gettingStarted/src/com/cpucode/java/simple/Bc88.java)
- [ ] [Bc89__密码验证](gettingStarted/src/com/cpucode/java/simple/Bc89.java)
- [ ] [Bc90__矩阵计算](gettingStarted/src/com/cpucode/java/simple/Bc90.java)
- [ ] [Bc92__逆序输出](gettingStarted/src/com/cpucode/java/simple/Bc92.java)
- [ ] [Bc93__统计数据正负个数](gettingStarted/src/com/cpucode/java/simple/Bc93.java)
- [ ] [Bc94__N个数之和](gettingStarted/src/com/cpucode/java/simple/Bc94.java)
- [ ] [Bc95__最高分与最低分之差](gettingStarted/src/com/cpucode/java/simple/Bc95.java)
- [ ] [Bc96__有序序列判断](gettingStarted/src/com/cpucode/java/simple/Bc96.java)
- [ ] [Bc97__有序序列插入一个整数](gettingStarted/src/com/cpucode/java/simple/Bc97.java)
- [ ] [Bc98__序列中删除指定数字](gettingStarted/src/com/cpucode/java/simple/Bc98.java)
- [ ] [Bc99__序列中整数去重](gettingStarted/src/com/cpucode/java/simple/Bc99.java)
- [ ] [Bc100__有序序列合并](gettingStarted/src/com/cpucode/java/simple/Bc100.java)
- [ ] [Bc101__班级成绩输入输出](gettingStarted/src/com/cpucode/java/simple/Bc101.java)
- [ ] [Bc102__矩阵元素定位](gettingStarted/src/com/cpucode/java/simple/Bc102.java)
- [ ] [Bc104__最高身高](gettingStarted/src/com/cpucode/java/simple/Bc104.java)
- [ ] [Bc105__矩阵相等判定](gettingStarted/src/com/cpucode/java/simple/Bc105.java)
- [ ] [Bc106__上三角矩阵判定](gettingStarted/src/com/cpucode/java/simple/Bc106.java)
- [ ] [Bc107__矩阵转置](gettingStarted/src/com/cpucode/java/simple/Bc107.java)
- [ ] [Bc108__矩阵交换](gettingStarted/src/com/cpucode/java/simple/Bc108.java)
- [ ] [Bc109__杨辉三角](gettingStarted/src/com/cpucode/java/simple/Bc109.java)
- [ ] [Bc110__井字棋](gettingStarted/src/com/cpucode/java/simple/Bc110.java)
- [ ] [Bc111__小乐乐与进制转换](gettingStarted/src/com/cpucode/java/simple/Bc111.java)
- [ ] [Bc112__小乐乐求和](gettingStarted/src/com/cpucode/java/simple/Bc112.java)
- [ ] [Bc113__小乐乐定闹钟](gettingStarted/src/com/cpucode/java/simple/Bc113.java)
- [ ] [Bc114__小乐乐排电梯](gettingStarted/src/com/cpucode/java/simple/Bc114.java)
- [ ] [Bc117__小乐乐走台阶](gettingStarted/src/com/cpucode/java/simple/Bc117.java)
- [ ] [Bc118__小乐乐与序列](gettingStarted/src/com/cpucode/java/simple/Bc118.java)
- [ ] [Bc126__小乐乐算多少人被请家长](gettingStarted/src/com/cpucode/java/simple/Bc126.java)
- [ ] [Bc127__小乐乐算最高分](gettingStarted/src/com/cpucode/java/simple/Bc127.java)
- [ ] [Bc128__小乐乐计算求和](gettingStarted/src/com/cpucode/java/simple/Bc128.java)
- [ ] [Bc129__小乐乐计算函数](gettingStarted/src/com/cpucode/java/simple/Bc129.java)
- [ ] [Bc130__小乐乐查找数字](gettingStarted/src/com/cpucode/java/simple/Bc130.java)
- [ ] [Bc131__KiKi学程序设计基础](gettingStarted/src/com/cpucode/java/simple/Bc131.java)
- [ ] [Bc137__KiKi判断上三角矩阵](gettingStarted/src/com/cpucode/java/simple/Bc137.java)
- [ ] [Bc138__KiKi学结构体和指针](gettingStarted/src/com/cpucode/java/simple/Bc138.java)

- [返回目录](#文件目录)

- [ ] [Bc64__K形图案](gettingStarted/src/com/cpucode/java/medium/Bc64.java)
- [ ] [Bc66__反斜线形图案](gettingStarted/src/com/cpucode/java/medium/Bc66.java)
- [ ] [Bc70__空心三角形图案](gettingStarted/src/com/cpucode/java/medium/Bc70.java)
- [ ] [Bc84__计算y的值](gettingStarted/src/com/cpucode/java/medium/Bc84.java)
- [ ] [Bc115__小乐乐与欧几里得](gettingStarted/src/com/cpucode/java/medium/Bc115.java)
- [ ] [Bc116__小乐乐改数字](gettingStarted/src/com/cpucode/java/medium/Bc116.java)
- [ ] [Bc119__小乐乐与字符串](gettingStarted/src/com/cpucode/java/medium/Bc119.java)
- [ ] [Bc135__KiKi求质数个数](gettingStarted/src/com/cpucode/java/medium/Bc135.java)
- [ ] [Bc136__KiKi去重整数并排序](gettingStarted/src/com/cpucode/java/medium/Bc136.java)
- [ ] [Bc140__KiKi设计类继承](gettingStarted/src/com/cpucode/java/medium/Bc140.java)

- [返回目录](#文件目录)

- [ ] [Bc120__小乐乐与二段数](gettingStarted/src/com/cpucode/java/difficult/Bc120.java)

- [返回目录](#文件目录)

----------------

## [剑指Offer](Offer)

- [x] [Jz7__斐波那契数列](Offer/src/com/cpucode/java/getting/started/Jz7.java)
- [x] [Jz5__用两个栈实现队列](Offer/src/com/cpucode/java/getting/started/Jz5.java)
- [x] [Jz6__旋转数组的最小数字](Offer/src/com/cpucode/java/getting/started/Jz6.java)
- [x] [Jz9__变态跳台阶](Offer/src/com/cpucode/java/getting/started/Jz9.java)
- [x] [Jz16__合并两个排序的链表](Offer/src/com/cpucode/java/getting/started/Jz16.java)
- [x] [Jz18__二叉树的镜像](Offer/src/com/cpucode/java/getting/started/Jz18.java)
- [x] [Jz28__数组中出现次数超过一半的数字](Offer/src/com/cpucode/java/getting/started/Jz28.java)
- [ ] [Jz30__连续子数组的最大和](Offer/src/com/cpucode/java/getting/started/Jz30.java)
- [ ] [Jz34__第一个只出现一次的字符位置](Offer/src/com/cpucode/java/getting/started/Jz34.java)
- [ ] [Jz38__二叉树的深度](Offer/src/com/cpucode/java/getting/started/Jz38.java)
- [ ] [Jz39__平衡二叉树](Offer/src/com/cpucode/java/getting/started/Jz39.java)
- [ ] [Jz48__不用加减乘除做加法](Offer/src/com/cpucode/java/getting/started/Jz48.java)
- [ ] [Jz51__构建乘积数组](Offer/src/com/cpucode/java/getting/started/Jz51.java)
- [ ] [Jz62__二叉搜索树的第k个结点](Offer/src/com/cpucode/java/getting/started/Jz62.java)
 
- [返回目录](#文件目录)

- [ ] [Jz4__重建二叉树](Offer/src/com/cpucode/java/simple/Jz4.java)
- [ ] [Jz8__跳台阶](Offer/src/com/cpucode/java/simple/Jz8.java)
- [ ] [Jz10__矩形覆盖](Offer/src/com/cpucode/java/simple/Jz10.java)
- [ ] [Jz11__二进制中1的个数](Offer/src/com/cpucode/java/simple/Jz11.java)
- [ ] [Jz12__数值的整数次方](Offer/src/com/cpucode/java/simple/Jz12.java)
- [ ] [Jz15__反转链表](Offer/src/com/cpucode/java/simple/Jz15.java)
- [ ] [Jz21__栈的压入、弹出序列](Offer/src/com/cpucode/java/simple/Jz21.java)
- [ ] [Jz26__二叉搜索树与双向链表](Offer/src/com/cpucode/java/simple/Jz26.java)
- [ ] [Jz31__整数中1出现的次数](Offer/src/com/cpucode/java/simple/Jz31.java)
- [ ] [Jz36__两个链表的第一个公共结点](Offer/src/com/cpucode/java/simple/Jz36.java)
- [ ] [Jz37__数字在排序数组中出现的次数](Offer/src/com/cpucode/java/simple/Jz37.java)
- [ ] [Jz40__数组中只出现一次的数字](Offer/src/com/cpucode/java/simple/Jz40.java)
- [ ] [Jz41__和为S的连续正数序列](Offer/src/com/cpucode/java/simple/Jz41.java)
- [ ] [Jz42__和为S的两个数字](Offer/src/com/cpucode/java/simple/Jz42.java)
- [ ] [Jz43__左旋转字符串](Offer/src/com/cpucode/java/simple/Jz43.java)
- [ ] [Jz45__扑克牌顺子](Offer/src/com/cpucode/java/simple/Jz45.java)
- [ ] [Jz46__孩子们的游戏](Offer/src/com/cpucode/java/simple/Jz46.java)
- [ ] [Jz47__求1+2+3+...+n](Offer/src/com/cpucode/java/simple/Jz47.java)
- [ ] [Jz50__数组中重复的数字](Offer/src/com/cpucode/java/simple/Jz50.java)
- [ ] [Jz53__表示数值的字符串](Offer/src/com/cpucode/java/simple/Jz53.java)
- [ ] [Jz54__字符流中第一个不重复的字符](Offer/src/com/cpucode/java/simple/Jz54.java)
- [ ] [Jz55__链表中环的入口结点](Offer/src/com/cpucode/java/simple/Jz55.java)
- [ ] [Jz57__二叉树的下一个结点](Offer/src/com/cpucode/java/simple/Jz57.java)
- [ ] [Jz60__把二叉树打印成多行](Offer/src/com/cpucode/java/simple/Jz60.java)
- [ ] [Jz63__数据流中的中位数](Offer/src/com/cpucode/java/simple/Jz63.java)
- [ ] [Jz67__剪绳子](Offer/src/com/cpucode/java/simple/Jz67.java)

- [返回目录](#文件目录)

---------------------------------

由于自己的code水平有限 , 难免有些不足 , 希望大家可以谅解 , 并提出意见 , 我会虚心接受 , cpu_code在此 , 谢谢大家