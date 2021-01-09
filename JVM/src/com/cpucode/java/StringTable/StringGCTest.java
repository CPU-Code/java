/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 17:22
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.StringTable;

/**
 * String的垃圾回收:
 * -Xms15m -Xmx15m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails
 */
public class StringGCTest {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    private static void test1(){
        for (int i = 0; i < 100000; i++) {
            String.valueOf(i);
        }
    }

    private static void test2(){
        for (int i = 0; i < 100000; i++) {
            String.valueOf(i).intern();
        }
    }
}

/*
[GC (Allocation Failure) [PSYoungGen: 4096K->480K(4608K)] 4096K->708K(15872K), 0.0010329 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
Heap
 PSYoungGen      total 4608K, used 3613K [0x00000000ffb00000, 0x0000000100000000, 0x0000000100000000)
  eden space 4096K, 76% used [0x00000000ffb00000,0x00000000ffe0f478,0x00000000fff00000)
  from space 512K, 93% used [0x00000000fff00000,0x00000000fff78030,0x00000000fff80000)
  to   space 512K, 0% used [0x00000000fff80000,0x00000000fff80000,0x0000000100000000)
 ParOldGen       total 11264K, used 228K [0x00000000ff000000, 0x00000000ffb00000, 0x00000000ffb00000)
  object space 11264K, 2% used [0x00000000ff000000,0x00000000ff039010,0x00000000ffb00000)
 Metaspace       used 3299K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 353K, capacity 388K, committed 512K, reserved 1048576K
SymbolTable statistics:
Number of buckets       :     20011 =    160088 bytes, avg   8.000
Number of entries       :     13632 =    327168 bytes, avg  24.000
Number of literals      :     13632 =    584408 bytes, avg  42.870
Total footprint         :           =   1071664 bytes
Average bucket size     :     0.681
Variance of bucket size :     0.682
Std. dev. of bucket size:     0.826
Maximum bucket size     :         6
StringTable statistics:
Number of buckets       :     60013 =    480104 bytes, avg   8.000
Number of entries       :      1739 =     41736 bytes, avg  24.000
Number of literals      :      1739 =    155744 bytes, avg  89.560
Total footprint         :           =    677584 bytes
Average bucket size     :     0.029
Variance of bucket size :     0.029
Std. dev. of bucket size:     0.171
Maximum bucket size     :         3


[GC (Allocation Failure) [PSYoungGen: 4096K->504K(4608K)] 4096K->700K(15872K), 0.0017889 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
Heap
 PSYoungGen      total 4608K, used 3547K [0x00000000ffb00000, 0x0000000100000000, 0x0000000100000000)
  eden space 4096K, 74% used [0x00000000ffb00000,0x00000000ffdf8cc8,0x00000000fff00000)
  from space 512K, 98% used [0x00000000fff00000,0x00000000fff7e030,0x00000000fff80000)
  to   space 512K, 0% used [0x00000000fff80000,0x00000000fff80000,0x0000000100000000)
 ParOldGen       total 11264K, used 196K [0x00000000ff000000, 0x00000000ffb00000, 0x00000000ffb00000)
  object space 11264K, 1% used [0x00000000ff000000,0x00000000ff031010,0x00000000ffb00000)
 Metaspace       used 3299K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 353K, capacity 388K, committed 512K, reserved 1048576K
SymbolTable statistics:
Number of buckets       :     20011 =    160088 bytes, avg   8.000
Number of entries       :     13632 =    327168 bytes, avg  24.000
Number of literals      :     13632 =    584408 bytes, avg  42.870
Total footprint         :           =   1071664 bytes
Average bucket size     :     0.681
Variance of bucket size :     0.682
Std. dev. of bucket size:     0.826
Maximum bucket size     :         6
StringTable statistics:
Number of buckets       :     60013 =    480104 bytes, avg   8.000
Number of entries       :     56349 =   1352376 bytes, avg  24.000
Number of literals      :     56349 =   3213904 bytes, avg  57.036
Total footprint         :           =   5046384 bytes
Average bucket size     :     0.939
Variance of bucket size :     0.743
Std. dev. of bucket size:     0.862
Maximum bucket size     :         5
* */