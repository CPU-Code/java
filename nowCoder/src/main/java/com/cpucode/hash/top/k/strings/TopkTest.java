package com.cpucode.hash.top.k.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * 字符串出现次数的TopK问题
 *
 * 描述
 * 给定一个字符串数组，再给定整数k，请返回出现次数前k名的字符串和对应的次数。
 * 返回的答案应该按字符串出现频率由高到低排序。如果不同的字符串有相同出现频率，按字典序排序。
 * 对于两个字符串，大小关系取决于两个字符串从左到右第一个不同字符的 ASCII 值的大小关系。
 * 比如"ah1x"小于"ahb"，"231"<”32“
 * 字符仅包含数字和字母
 *
 * [要求]
 * 如果字符串数组长度为N，时间复杂度请达到O(N \log K)O(NlogK)
 *
 * 示例1
 * 输入： ["a","b","c","b"],2
 * 返回值： [["b","2"],["a","1"]]
 * 说明： "b"出现了2次，记["b","2"]，"a"与"c"各出现1次，
 * 但是a字典序在c前面，记["a","1"]，最后返回[["b","2"],["a","1"]]
 *
 * 示例2
 * 输入： ["123","123","231","32"],2
 * 返回值： [["123","2"],["231","1"]]
 * 说明："123"出现了2次，记["123","2"]，"231"与"32"各出现1次，
 * 但是"231"字典序在"32"前面，记["231","1"]，最后返回[["123","2"],["231","1"]]
 *
 * 示例3
 * 输入： ["abcd","abcd","abcd","pwb2","abcd","pwb2","p12"],3
 * 返回值： [["abcd","4"],["pwb2","2"],["p12","1"]]
 * 备注： 1≤N≤10
 *
 * @author : cpucode
 * @date : 2021/6/20
 * @time : 17:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TopkTest {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "b"};
        TopkTest topkTest = new TopkTest();
        String[][] strings1 = topkTest.topKstrings(strings, 2);

        for (String[] strings2 : strings1) {
            for (String s : strings2) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    /**
     * return topK string
     * @param strings string字符串一维数组 strings
     * @param k int整型 the k
     * @return string字符串二维数组
     */
    public String[][] topKstrings (String[] strings, int k) {
        if (k == 0){
            return new String[][] {};
        }

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String str : strings) {
            if (map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            }else {
                map.put(str, 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());

        // 先比较值是否相同，相同按键升序进行比较，不相同按值降序比较
        Collections.sort(list, (o1, o2) ->(
                o1.getValue().compareTo(o2.getValue()) == 0 ?
                    o1.getKey().compareTo(o2.getKey()) :
                    o2.getValue().compareTo(o1.getValue())
                ));

        String[][] res = new String[k][2];

        for (int i = 0; i < k; i++) {
            res[i][0] = list.get(i).getKey();
            res[i][1] = String.valueOf(list.get(i).getValue());
        }

        return res;
    }
}
