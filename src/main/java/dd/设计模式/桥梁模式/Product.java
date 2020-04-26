package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description: 抽象产品类
 * @author: 胡凯铭
 * @create: 2020-04-10 15:25
 **/

public abstract class Product {
    /**
     * 生产产品
     */
    public abstract void beProducted();

    /**
     * 销售
     */
    public abstract void beSelled();
}

