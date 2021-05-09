
/**
 * @author : cpucode
 * @date : 2021/5/9
 * @time : 8:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class OverrideReturn {
    public static void main(String[] args) {
        Hero hero = new Hero();

        String name = hero.name();
        System.out.println("Hero : " + name);

        SuperMan superMan = new SuperMan();
        String name1 = superMan.name();
        Hero hero1 = superMan.hero();

        System.out.println("SuperMan : " + name1);
        System.out.println("SuperMan.hero() : " + hero1.name());

        SuperSuperMan superSuperMan = new SuperSuperMan();

        String name2 = superSuperMan.name();
        SuperMan hero2 = superSuperMan.hero();
        String name3 = hero2.name();

        System.out.println("superSuperMan : " + name2);
        System.out.println("superSuperMan.hero : " + name3);
    }
}

class Hero {
    public String name() {
        return "超级英雄";
    }
}
class SuperMan extends Hero{
    @Override
    public String name() {
        return "超人";
    }
    public Hero hero() {
        return new Hero();
    }
}

class SuperSuperMan extends SuperMan {
    @Override
    public String name() {
        return "超级超级英雄";
    }

    @Override
    public SuperMan hero() {
        return new SuperMan();
    }
}


