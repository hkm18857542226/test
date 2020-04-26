package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description: 服装
 * @author: 胡凯铭
 * @create: 2020-04-10 16:05
 **/

public class Clothes extends Product {
    /**
     * 生产产品
     */
    @Override
    public void beProducted() {
        System.out.println("生产出来的衣服是这样的");
    }

    /**
     * 销售
     */
    @Override
    public void beSelled() {
        System.out.println("生产出来的衣服卖出去了。。");
    }
}

