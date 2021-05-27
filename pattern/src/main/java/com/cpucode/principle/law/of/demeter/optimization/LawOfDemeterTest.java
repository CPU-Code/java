package com.cpucode.principle.law.of.demeter.optimization;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LawOfDemeterTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();

        boss.commandCheckNumber(teamLeader);
    }
}
