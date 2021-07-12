package com.cpucode.pattern.behavior.observer.events.mouseevent;

/**
 * @author : cpucode
 * @date : 2021/7/12
 * @time : 22:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface MouseEventType {
    /**
     * 单击
     */
    String ON_CLICK = "click";

    /**
     * 双击
     */
    String ON_DOUBLE_CLICK = "doubleClick";

    /**
     * 弹起
     */
    String ON_UP = "up";

    /**
     * 按下
     */
    String ON_DOWN = "down";

    /**
     * 移动
     */
    String ON_MOVE = "move";

    /**
     * 滚动
     */
    String ON_WHEEL = "wheel";

    /**
     * 悬停
     */
    String ON_OVER = "over";

    /**
     * 失焦
     */
    String ON_BLUR = "blur";

    /**
     * 获焦
     */
    String ON_FOCUS = "focus";
}
