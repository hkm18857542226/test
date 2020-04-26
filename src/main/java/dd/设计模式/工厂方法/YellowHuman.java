package dd.设计模式.工厂方法;

/**
 * @program: test
 * @description: 黄色人种
 * @author: 胡凯铭
 * @create: 2020-04-11 15:20
 **/

public class YellowHuman implements Human{

    /**
     * 人类的颜色
     */
    @Override
    public void getColor() {
        System.out.println("俺的皮肤是黄色的");
    }

    /**
     * 人类说话
     */
    @Override
    public void talk() {
        System.out.println("老子说话双音节的");
    }
}

