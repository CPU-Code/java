package com.cpucode.pattern.behavior.observer.events;

import com.cpucode.pattern.behavior.observer.events.mouseevent.Mouse;
import com.cpucode.pattern.behavior.observer.events.mouseevent.MouseEventCallback;
import com.cpucode.pattern.behavior.observer.events.mouseevent.MouseEventType;

/**
 * @author : cpucode
 * @date : 2021/7/12
 * @time : 22:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MouseEventTest {
    public static void main(String[] args) {
        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        mouse.addLisenter(MouseEventType.ON_CLICK, callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();
        mouse.focus();
    }
}
