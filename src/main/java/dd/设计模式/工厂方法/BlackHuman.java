package dd.设计模式.工厂方法;

/**
 * @program: test
 * @description: 黑色人zhong
 * @author: 胡凯铭
 * @create: 2020-04-11 15:18
 **/

public class BlackHuman implements Human {
    /**
     * 人类的颜色
     */
    @Override
    public void getColor() {
        System.out.println("俺的皮肤是黑色的");
    }

    /**
     * 人类说话
     */
    @Override
    public void talk() {
        System.out.println("黑皮肤的人说话一般人听不懂");
    }
}

