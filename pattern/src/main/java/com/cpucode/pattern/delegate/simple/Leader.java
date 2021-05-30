package com.cpucode.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目经理
 *
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 21:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Leader implements IEmployee {
    private Map<String, IEmployee> targets = new HashMap<String, IEmployee>();

    public Leader() {
        targets.put("加密", new EmployeeA());
        targets.put("登录", new EmployeeB());
    }

    /**
     * 项目经理自己不干活
     * @param command
     */
    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
