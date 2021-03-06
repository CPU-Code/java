
# [设计模式](../README.md)

## 文件目录

### [七大原则](#七大原则)

### [创建型模式](#创建型模式)

- [工厂模式](#工厂模式)
- [单例模式](#单例模式)
- [原型模式](#原型模式)

### [结构型模式](#行为性模式)

- [代理模式](#代理模式)
- [适配器模式](#适配器模式)
- [装饰器模式](#装饰器模式)


### [行为性模式](#行为性模式)

- [委派模式](#委派模式)
- [策略模式](#策略模式)
- [模板模式](#模板模式)
- [观察者模式](#观察者模式)

---------------------

# 七大原则

- [x] [开闭原则](src/main/java/com/cpucode/principle/open/closed)

- [x] [依赖倒置原则](src/main/java/com/cpucode/principle/dependence/inversion/simple)
- [x] [依赖倒置原则优化](src/main/java/com/cpucode/principle/dependence/inversion/optimization)

- [x] [单一职责原则](src/main/java/com/cpucode/principle/simple/responsibility/simple)
- [x] [单一职责原则优化](src/main/java/com/cpucode/principle/simple/responsibility/optimization)

- [x] [接口隔离原则](src/main/java/com/cpucode/principle/inter/face/segregation/simple)
- [x] [接口隔离原则优化](src/main/java/com/cpucode/principle/inter/face/segregation/optimization)

- [x] [迪米特法则](src/main/java/com/cpucode/principle/law/of/demeter/simple)
- [x] [迪米特法则优化](src/main/java/com/cpucode/principle/law/of/demeter/optimization)

- [x] [里氏替换原则](src/main/java/com/cpucode/principle/liskov/substitution/simple)
- [x] [里氏替换原则优化](src/main/java/com/cpucode/principle/liskov/substitution/optimization)

- [x] [合成复用原则](src/main/java/com/cpucode/principle/composite/reuse/simple)
- [x] [合成复用原则优化](src/main/java/com/cpucode/principle/composite/reuse/optimization)

----------------------------------

# 创建型模式

## [工厂模式](src/main/java/com/cpucode/pattern/create/factory)

- [x] [简单工厂模式__SimpleFactoryTest](src/main/java/com/cpucode/pattern/create/factory/simplefactory/SimpleFactoryTest.java)
- [x] [工厂方法模式__FactoryMethodTest](src/main/java/com/cpucode/pattern/create/factory/factorymethod/FactoryMethodTest.java)
- [x] [抽象工厂模式__AbstractFactoryTest](src/main/java/com/cpucode/pattern/create/factory/abstractfactory/AbstractFactoryTest.java)
- [ ] [JDBC操作案例](src/main/java/com/cpucode/pattern/create/factory/sqlhelper/org/jdbc/sqlhelper)

## [单例模式](src/main/java/com/cpucode/pattern/create/singleton)

- [x] [饿汉式单例__HungrySingleton](src/main/java/com/cpucode/pattern/create/singleton/hungry/HungrySingleton.java)
- [x] [饿汉式静态块单例__HungryStaticSingleton](src/main/java/com/cpucode/pattern/create/singleton/hungry/HungryStaticSingleton.java)
- [x] [懒汉式单例__LazySimpleSingletonTest](src/main/java/com/cpucode/pattern/create/singleton/lazy/simple/LazySimpleSingletonTest.java)
- [x] [双重检查锁的单例模式__LazyDoubleCheckSingleton](src/main/java/com/cpucode/pattern/create/singleton/lazy/dou/ble/check/LazyDoubleCheckSingleton.java)
- [x] [静态内部类__LazyInnerClassSingletonTest](src/main/java/com/cpucode/pattern/create/singleton/lazy/innerClass/LazyInnerClassSingletonTest.java)
- [x] [序列化破坏单例__SeriableSingletonTest](src/main/java/com/cpucode/pattern/create/singleton/seriable/SeriableSingletonTest.java)
- [x] [注册式单例枚举登记__EnumSingletonTest](src/main/java/com/cpucode/pattern/create/singleton/register/en/um/EnumSingletonTest.java)
- [x] [注册式单例容器缓存__ContainerSingletonTest](src/main/java/com/cpucode/pattern/create/singleton/register/container/ContainerSingletonTest.java)
- [x] [ThreadLocal线程单例__ThreadLocalSingletonTest](src/main/java/com/cpucode/pattern/create/singleton/thread/local/ThreadLocalSingletonTest.java)

## [原型模式](src/main/java/com/cpucode/pattern/create/prototype)

- [x] [简单克隆__PrototypeTest](src/main/java/com/cpucode/pattern/create/prototype/simple/PrototypeTest.java)
- [x] [深度克隆__DeepCloneTest](src/main/java/com/cpucode/pattern/create/prototype/deep/DeepCloneTest.java)

---------------------

# 结构型模式

## [代理模式](src/main/java/com/cpucode/pattern/structure/proxy)

- [x] [静态代理__StaticProxyTest](src/main/java/com/cpucode/pattern/structure/proxy/staticproxy/StaticProxyTest.java)
- [x] [静态代理__Client](src/main/java/com/cpucode/pattern/structure/proxy/simpleproxy/Client.java)
- [x] [静态代理__DbRouteProxyTest](src/main/java/com/cpucode/pattern/structure/proxy/db/route/proxy/staticdb/DbRouteProxyTest.java)
- [x] [动态代理__DbRouteProxyTest](src/main/java/com/cpucode/pattern/structure/proxy/db/route/proxy/dynamic/DbRouteProxyTest.java)
- [x] [JDK动态代理__JDKProxyTest](src/main/java/com/cpucode/pattern/structure/proxy/dynamicproxy/jdkproxy/JDKProxyTest.java)
- [x] [JDK手写实现__GPProxyTest](src/main/java/com/cpucode/pattern/structure/proxy/dynamicproxy/gpproxy/GPProxyTest.java)
- [x] [CGLib动态代理__CglibTest](src/main/java/com/cpucode/pattern/structure/proxy/dynamicproxy/cglibproxy/CglibTest.java)


## [适配器模式](src/main/java/com/cpucode/pattern/structure/adapter)

- [x] [电压适配器](src/main/java/com/cpucode/pattern/structure/adapter/power/adapter/ObjectAdapterTest.java)
- [x] [登录适配器](src/main/java/com/cpucode/pattern/structure/adapter/login/adapter/v1/service/SigninForThirdServiceTest.java)
- [x] [各登录适配器](src/main/java/com/cpucode/pattern/structure/adapter/login/adapter/v2/PassportTest.java)

## [装饰器模式](src/main/java/com/cpucode/pattern/structure/decorator)

- [x] [煎饼装饰](src/main/java/com/cpucode/pattern/structure/decorator/batter/cake/v1/BatterCakeTest.java)
- [x] [煎饼装饰v2](src/main/java/com/cpucode/pattern/structure/decorator/batter/cake/v2/BattercakeTest.java)
- [x] [登录装饰型](src/main/java/com/cpucode/pattern/structure/decorator/passport/DecoratorTest.java)

----------------

# 行为性模式

## [委派模式](src/main/java/com/cpucode/pattern/behavior/delegate)

- [x] [委派模式__DelegateTest](src/main/java/com/cpucode/pattern/behavior/delegate/simple/DelegateTest.java)
- [x] [MVC委派模式__DispatcherServlet](src/main/java/com/cpucode/pattern/behavior/delegate/mvc/DispatcherServlet.java)
- [x] [MVC委派模式优化__DispatcherServlet2](src/main/java/com/cpucode/pattern/behavior/delegate/mvc/DispatcherServlet2.java)

## [策略模式](src/main/java/com/cpucode/pattern/behavior/strategy)

- [x] [策略模式](src/main/java/com/cpucode/pattern/behavior/strategy/promotion/PromotionActivityTest.java)
- [x] [策略模式](src/main/java/com/cpucode/pattern/behavior/strategy/promotion/PromotionActivityTest2.java)
- [x] [策略模式](src/main/java/com/cpucode/pattern/behavior/strategy/promotion/PromotionActivityTest3.java)
- [x] [策略模式](src/main/java/com/cpucode/pattern/behavior/strategy/pay/PayStrategyTest.java)

## [模板模式](src/main/java/com/cpucode/pattern/behavior/template)

- [x] [课程模板模式](src/main/java/com/cpucode/pattern/behavior/template/course/NetworkCourseTest.java)
- [x] [Jdbc模板模式](src/main/java/com/cpucode/pattern/behavior/template/jdbc/MemberDaoTest.java)

## [观察者模式](src/main/java/com/cpucode/pattern/behavior/observer)

- [x] [课程提问](src/main/java/com/cpucode/pattern/behavior/observer/course/advice/ObserverTest.java)
- [x] [鼠标操作](src/main/java/com/cpucode/pattern/behavior/observer/events/MouseEventTest.java)
- [x] [Guava实现观察者](src/main/java/com/cpucode/pattern/behavior/observer/guava/GuavaEventTest.java)

---------------

- [返回顶层](../README.md)