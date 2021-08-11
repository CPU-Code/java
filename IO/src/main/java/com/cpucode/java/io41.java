/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 20:03:13
 * @LastEditTime: 2020-09-20 16:56:39
 * @FilePath: \java\IO\io41.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.*;
import java.util.HashMap;

public class io41 {
    public static void main(String[] args) throws IOException {
        // 创建map集合,保存文本数据,键为序号,值为文字
        HashMap<String, String> lineMap = new HashMap<>();
        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("cpucode.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("cpu.txt"));
        // 读取数据
        String line = null;

        while ((line = br.readLine()) != null) {
            // 解析文本
            String[] split = line.split("\\.");
            // 保存到集合
            lineMap.put(split[0], split[1]);
        }
        // 释放资源
        br.close();

        for (int i = 1; i <= lineMap.size(); i++) {
            String key = String.valueOf(i);
            // 获取map中文本
            String value = lineMap.get(key);
            // 写出拼接文本
            bw.write(key + "." + value);
            // 写出换行
            bw.newLine();
        }

        // 释放资源
        bw.close();
    }
}

/*
1.cpu
2.hello
3.cpucode
4.java最流弊
*/