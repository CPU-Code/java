package com.cpucode.java.spring.orm.framework;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.logging.Logger;

/**
 * BaseDao 扩展类,主要功能是支持自动拼装 sql 语句， 必须继承方可使用
 *  需要重写和实现以下三个方法
 *    设定主键列
 *      private String getPKColumn() {return "id";}
 *
 * @author : cpucode
 * @date : 2021/8/9
 * @time : 14:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BaseDaoSupport<T> {
    private Logger log = Logger.getLogger(BaseDaoSupport.class);
    private String tableName = "";
    private JdbcTemplate jdbcTemplateWrite;
    private JdbcTemplate jdbcTemplateReadOnly;
    private DataSource dataSourceReadOnly;
    private DataSource dataSourceWrite;
    private EntityOperation<T> op;



}
