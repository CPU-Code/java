package com.cpucode.pattern.behavior.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author : cpucode
 * @date : 2021/7/12
 * @time : 22:18
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        GuavaEvent guavaEvent = new GuavaEvent();

        eventBus.register(guavaEvent);
        eventBus.post("cpucode");
    }
}
