package com.cpucode.sort.merging.interval;

import java.util.ArrayList;

/**
 * 描述
 * 给出一组区间，请合并所有重叠的区间。
 * 请保证合并后的区间按区间起点升序排列。
 *
 * 示例1
 * 输入：
 * [[10,30],[20,60],[80,100],[150,180]]
 * 返回值：
 * [[10,60],[80,100],[150,180]]
 *
 * @author : cpucode
 * @date : 2021/5/26
 * @time : 20:32
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IntervalTest {
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();

        intervals.add(new Interval(10, 30));
        intervals.add(new Interval(20,60));
        intervals.add(new Interval(80,100));
        intervals.add(new Interval(150,180));

        ArrayList<Interval> merge = merge(intervals);

        for (Interval interval : merge) {
            System.out.print(interval.getStart() + " ");
            System.out.println(interval.getEnd());
        }

    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        intervals.sort((a, b) ->(a.getStart() - b.getStart()));

        ArrayList<Interval> res = new ArrayList<Interval>();

        int n = intervals.size();
        int i = 0;

        while (i < n){
            //用来存储当前区间的左端
            int l = intervals.get(i).getStart();
            //用来存储当前区间的右端
            int r = intervals.get(i).getEnd();

            //合并区间
            while (i < n - 1 && r > intervals.get(i + 1).getStart()){
                i++;

                r = Math.max(r, intervals.get(i).getEnd());
            }

            //将当前合并完的区间进行插入
            res.add(new Interval(l, r));
            i++;
        }

        return res;
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        this.start = 0;
        this.end = 0;
    }

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }

    public int getStart() {
        return this.start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return this.end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}