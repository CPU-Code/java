
# [JVM](../../../../../README.md)

## 文件目录

- [栈结构](#栈结构)
- [堆空间](#堆空间)
- [方法区](#方法区)
- [对象](#对象)
- [直接内存](#直接内存)
- [执行引擎](#执行引擎)
- [字符串表](#字符串表)
- [垃圾回收](#垃圾回收)
- [字节码结构](#字节码结构)
- [指令分析](#指令分析)
- [加载过程](#加载过程)
- [加载器](#加载器)

----------------

## [栈结构](stack/structure)

- [x] [Add__加法反编译](stack/structure/Add.java)

- [返回目录](#文件目录)

--------------------------

## []()

- []()

- [返回目录](#文件目录)

--------------------------

## [堆空间](heap)

- [x] [OutOfMemory__查看内存溢出](heap/OutOfMemory.java)
- [x] [EdenSurvivorTest__查看各区比例](heap/EdenSurvivorTest.java)
- [x] [HeapInstanceTest__查看各区数据转换](heap/HeapInstanceTest.java)
- [x] [GCTest__查看各个GC的触发](heap/GcTest.java)
- [x] [YoungOldAreaTest__查看大对象直接存放在Old](heap/YoungOldAreaTest.java)
- [x] [TLABArgsTest__查看TLAB是否开启](heap/TlabArgsTest.java)
- [x] [HeapArgsTest__查看Heap的各个参数](heap/HeapArgsTest.java)
- [x] [EscapeAnalysis__判断逃逸分析](heap/EscapeAnalysis.java)
- [x] [StackAllocation__逃逸分析的分配位置](heap/StackAllocation.java)
- [x] [SynchronizedTest__同步省略](heap/SynchronizedTest.java)
- [x] [ScalarReplace__标量替换](heap/ScalarReplace.java)

- [返回目录](#文件目录)

--------------------------

## [方法区](method/area)

- [x] [MethodAreaSize__方法区大小](method/area/MethodAreaSize.java)
- [x] [MethodAreaOOMTest__方法区内存异常](method/area/MethodAreaOomTest.java)
- [x] [MethodInnerStrucTest__查看方法区的内部构成](method/area/MethodInnerStrucTest.java)
- [x] [MethodAreaFinal__查看方法区的Final](method/area/MethodAreaFinal.java)
- [x] [StaticFieldTest__查看静态变量存储位置](method/area/StaticFieldTest.java)
- [ ] [StaticObjectTest__查看静态类存储位置](method/area/StaticObjectTest.java)
 
 - [返回目录](#文件目录)
 
 --------------------------
 
 ## [对象](object)
 
- [x] [ObjectTest__对象的创建的反编译](object/ObjectTest.java)
- [x] [Customer__对象实例化的过程](object/Customer.java)
- [x] [CustomerTest__对象实例化的内存分布](object/CustomerTest.java)

- [返回目录](#文件目录)

--------------------------

## [直接内存](direct/memory)

- [x] [BufferTest__查看直接内存大小](direct/memory/BufferTest.java)
- [x] [DirectMemoryOOM__直接内存异常](direct/memory/DirectMemoryOom.java)
- [x] [MaxDirectMemorySizeTest__设置直接内存大小](direct/memory/MaxDirectMemorySizeTest.java)

- [返回目录](#文件目录)

--------------------------

## [执行引擎](execution/engine)

- [x] [JITTest__JIT编译器的使用](execution/engine/JitTest.java)
- [x] [IntCompTest__各个编译器状态](execution/engine/IntCompTest.java)

- [返回目录](#文件目录)

--------------------------

## [字符串表](string/table)

- [x] [StringOnly__String不变性](string/table/StringOnly.java)
- [x] [StringExer__String不变性](string/table/StringExer.java)
- [x] [StringTableSize__StringTable大小](string/table/StringTableSize.java)
- [x] [GenerateString__生成随机文字txt](string/table/GenerateString.java)
- [x] [StringTime__String运行时间](string/table/StringTime.java)
- [x] [StringOOM__String报错](string/table/StringOom.java)
- [x] [StringConstant__String的加载个数](string/table/StringConstant.java)
- [x] [StringSort__String的分类](string/table/StringSort.java)
- [x] [StringAppend__String拼接](string/table/StringAppend.java)
- [x] [StringNewTest__String创建对象数量](string/table/StringNewTest.java)
- [x] [StringIntern__String调用intern](string/table/StringIntern.java)
- [x] [StringEfficiency__String空间效率](string/table/StringEfficiency.java)
- [x] [StringGCTest__String回收](string/table/StringGcTest.java)

- [返回目录](#文件目录)

--------------------------

## [垃圾回收](garbage/collection)

- [x] [RefCountGC__判断是否引用回收](garbage/collection/RefCountGc.java)
- [x] [CanReliveObj__回收复活对象](garbage/collection/CanReliveObj.java)
- [ ] [GCRootsTest__Roots回收情况](garbage/collection/GcRootsTest.java)
- [x] [HeapOOM__堆错误](garbage/collection/HeapOom.java)
- [x] [SystemGCTest__GC的finalize被调用](garbage/collection/SystemGcTest.java)
- [x] [LocalVarGC__各区的变量的GC情况](garbage/collection/LocalVarGc.java)
- [x] [StopTheWorldTest__STW的停顿时间](garbage/collection/StopTheWorldTest.java)
- [x] [StrongReferenceTest__强引用测试](garbage/collection/StrongReferenceTest.java)
- [x] [SoftReferenceTest__软引用测试](garbage/collection/SoftReferenceTest.java)
- [x] [WeakReferenceTest__弱引用测试](garbage/collection/WeakReferenceTest.java)
- [x] [PhantomReferenceTest__虚引用测试](garbage/collection/PhantomReferenceTest.java)
- [x] [GcUseTest__使用GC类型](garbage/collection/GcUseTest.java)
- [x] [GcLogTest__使用GC日志信息](garbage/collection/GcLogTest.java)
- [x] [GcLogHeapTest__使用GC堆的日志信息](garbage/collection/GcLogHeapTest.java)

- [返回目录](#文件目录)

--------------------------

## [字节码结构](bytecode/structure)

- [x] [IntegerTest__int类型的自动拆装箱](bytecode/structure/IntegerTest.java)
- [x] [StringTest__String类型的创建反编译](bytecode/structure/StringTest.java)
- [x] [SonTest__继承的创建反编译](bytecode/structure/SonTest.java)
- [x] [ArrayTest__数组字节码表示](bytecode/structure/ArrayTest.java)
- [ ] [ClassAnalysis__字节码分析](bytecode/structure/ClassAnalysis.java)
- [ ] [SeniorClassAnalysis__加强版字节码分析](bytecode/structure/SeniorClassAnalysis.java)
- [x] [JavapTest__javap指令](bytecode/structure/JavapTest.java)

- [返回目录](#文件目录)

-----------------

## [指令分析](instruction/analysis)

- [x] [LoadAndStoreTest__分析加载压栈字节码](instruction/analysis/LoadAndStoreTest.java)
- [x] [ArithmeticTest__分析算术字节码](instruction/analysis/ArithmeticTest.java)
- [x] [ClassCastTest__分析类型转换字节码](instruction/analysis/ClassCastTest.java)
- [x] [NewTest__分析数组创建](instruction/analysis/NewTest.java)
- [x] [MethodInvokeReturnTest__调用和返回方法](instruction/analysis/MethodInvokeReturnTest.java)
- [x] [InterfaceMethodTest__分析接口方法](instruction/analysis/InterfaceMethodTest.java)
- [x] [StackOperateTest__分析操作栈](instruction/analysis/StackOperateTest.java)
- [x] [IfSwitchGotoTest__分析判断跳转字节码](instruction/analysis/IfSwitchGotoTest.java)
- [x] [ExceptionTest__分析异常字节码](instruction/analysis/ExceptionTest.java)
- [x] [SynchronizedTest__分析同步字节码](instruction/analysis/SynchronizedTest.java)

- [返回目录](#文件目录)

-----------------

## [加载过程](loading/process)

- [x] [CpuCode__抛出ClassFormatError](loading/process/CpuCode.java)
- [x] [LoadingTest__加载类并打印类方法](loading/process/LoadingTest.java)
- [x] [LinkingTest__链接类](loading/process/LinkingTest.java)
- [x] [SubInitialization__初始化类](loading/process/SubInitialization.java)
- [x] [Clinit__Clinit方法](loading/process/Clinit.java)
- [x] [Stage__各阶段赋值](loading/process/Stage.java)
- [x] [StaticDeadLockMain__死锁](loading/process/StaticDeadLockMain.java)
- [x] [ActiveUseTest__初始化主动使用](loading/process/ActiveUseTest.java)
- [x] [ActiveUse2Test__类和接口初始化](loading/process/ActiveUse2Test.java)
- [x] [ActiveUse3Test__初始化](loading/process/ActiveUse3Test.java)
- [x] [PassiveUseTest__被动使用初始化](loading/process/PassiveUseTest.java)
- [x] [PassiveUse2Test__被动使用初始化](loading/process/PassiveUse2Test.java)

- [返回目录](#文件目录)

-----------------

## [加载器](loader)

- [x] [UserTest__显隐加载](loader/UserTest.java)
- [x] [UserClassLoader__用户类加载](loader/UserClassLoader.java)
- [x] [ClassLoaderTest__启动扩展类加载](loader/ClassLoaderTest.java)
- [x] [GetClassLoader__获取各类加载器](loader/GetClassLoader.java)
- [x] [LoopRun__热运行](loader/LoopRun.java)
- [x] [OverrideClassLoaderTest__加载类的加载器](loader/OverrideClassLoaderTest.java)

- [返回目录](#文件目录)

-----------------

## [命令工具](command/tools)

- [x] [ScannerTest__jps测试](command/tools/jps/ScannerTest.java)
- [x] [ScannerTest__jstat测试](command/tools/jstat/ScannerTest.java)
- [x] [GcTest__jstat测试](command/tools/jstat/GcTest.java)
- [x] [ScannerTest__jinfo测试](command/tools/jinfo/ScannerTest.java)
- [x] [GcTest__jmap测试](command/tools/jmap/GcTest.java)
- [x] [ThreadDeadLock__死锁](command/tools/jstack/ThreadDeadLock.java)
- [x] [TreadSleepTest__Timed_waiting等待](command/tools/jstack/TreadSleepTest.java)
- [x] [ThreadSyncTest__同步](command/tools/jstack/ThreadSyncTest.java)
- [x] [AllStackTrace__栈信息](command/tools/jstack/AllStackTrace.java)

- [返回目录](#文件目录)


--------------

- [返回顶层](../../../../../README.md)