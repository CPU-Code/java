package com.cpucode.spring.formework.aop.config;

import lombok.Data;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 14:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class CPAopConfig {
    private String pointCut;
    private String aspectBefore;
    private String aspectAfter;
    private String aspectClass;
    private String aspectAfterThrow;
    private String aspectAfterThrowingName;
}
