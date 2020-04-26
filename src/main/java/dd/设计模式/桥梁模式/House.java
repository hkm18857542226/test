package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description: 房子
 * @author: 胡凯铭
 * @create: 2020-04-10 15:34
 **/

public class House extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产出来的房子是这样的");
    }

    @Override
    public void beSelled() {
        System.out.println("生产的房子卖出去了。。。");
    }


}

