package dd.设计模式.工厂方法;

/**
 * @program: test
 * @description: 白色人种
 * @author: 胡凯铭
 * @create: 2020-04-11 15:21
 **/

public class WhiteHuman implements Human {
    /**
     * 人类的颜色
     */
    @Override
    public void getColor() {
        System.out.println("老子颜色是白色");
    }

    /**
     * 人类说话
     */
    @Override
    public void talk() {
        System.out.println("自由美利坚，枪战每一天");
    }
}

