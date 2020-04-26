package dd.设计模式.抽象工厂模式;

/**
 * @program: test
 * @description: 人种的接口
 * @author: 胡凯铭
 * @create: 2020-04-13 15:30
 **/

public interface Human {
    /**
     *  每个人种都有相应的颜色
     */
    public void getColor();

    /**
     * 人类会说话
     */
    public void talk();

    /**
     * 人类有性别
     */
    public void getSex();
}

