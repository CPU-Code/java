package com.cpucode.pattern.template.jdbc;

import com.cpucode.pattern.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * 模板模式
 * 优点：
 *  1、利用模板方法将相同处理逻辑的代码放到抽象父类中，可以提高代码的复用性。
 *  2、将不同的代码不同的子类中，通过对子类的扩展增加新的行为，提高代码的扩展性。
 *  3、把不变的行为写在父类上，去除子类的重复代码，提供了一个很好的代码复用平台，符合开闭原则。
 *
 * 缺点：
 *  1、类数目的增加，每一个抽象类都需要一个子类来实现，这样导致类的个数增加。
 *  2、类数量的增加，间接地增加了系统实现的复杂度。
 *  3、继承关系自身缺点，如果父类添加新的抽象方法，所有子类都要改一遍。
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 15:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);

        List<?> result = memberDao.selectAll();

        System.out.println(result);
    }
}
