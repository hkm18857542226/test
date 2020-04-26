package dd.设计模式.工厂方法;

import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @program: test
 * @description: 女娲类
 * @author: 胡凯铭
 * @create: 2020-04-11 15:36
 **/

public class NvWa {
    public static void main(String[] args) {
        //声明 造人   关键点再与 根据传进来的参数来判断要生产的是什么对象 一般传class
        AbstractHumanFactory yinyanglu = new HumanFactory();
        System.out.println("-- 造出的第一批人是白色人种");
        Human whiteHuman = yinyanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("-- 造出的第二批人是黑色人种");
        Human blackHuman = yinyanglu.createHuman(BlackHuman.class);
        blackHuman.talk();
        blackHuman.getColor();

        System.out.println("-- 黄色人种来了");
        Human yellowMan = yinyanglu.createHuman(YellowHuman.class);
        yellowMan.getColor();
        yellowMan.talk();
    }
}

