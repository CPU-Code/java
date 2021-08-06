package com.cpucode.spring.formework.webmvc.servlet;

import java.io.File;
import java.util.Locale;

/**
 * 设计这个类的主要目的是：
 *      讲一个静态文件变为一个动态文件
 *      根据用户传送参数不同， 产生不同的结果
 *      最终输出字符串， 交给 Response 输出
 * @author : cpucode
 * @date : 2021/8/4
 * @time : 14:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPViewResolver {
    private final String DEFAULT_TEMPLATE_SUFFIX = ".html";
    private File templateRootDir;
    private String viewName;

    public CPViewResolver(String templateRoot) {
        String templateRootPath = this.getClass().getClassLoader().getResource(templateRoot).getFile();
        this.templateRootDir = new File(templateRootPath);
    }

    public CPView resolveViewName(String viewName, Locale locale) throws Exception {
        this.viewName = viewName;

        if(null == viewName || "".equals(viewName.trim())){
            return null;
        }

        // 选择html后缀
        viewName = viewName.endsWith(DEFAULT_TEMPLATE_SUFFIX) ? viewName : (viewName + DEFAULT_TEMPLATE_SUFFIX);

        File templateFile = new File((templateRootDir.getPath() +
                "/" + viewName).replaceAll("/+", "/"));

        return new CPView(templateFile);
    }

    public String getViewName() {
        return viewName;
    }

}
