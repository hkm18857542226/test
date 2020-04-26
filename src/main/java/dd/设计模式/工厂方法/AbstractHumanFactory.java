package dd.设计模式.工厂方法;

/**
 * @program: test
 * @description: 抽象人类创建工厂
 * @author: 胡凯铭
 * @create: 2020-04-11 15:23
 **/

public abstract class AbstractHumanFactory {
    /**
     *
     * @param c
     * @param <T> 2个限制 输入的类型必须是继承 Human的而且要是class 类型
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> c);
}

