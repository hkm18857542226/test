package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-10 15:42
 **/

public class IPod extends Product{

    @Override
    public void beProducted() {
        System.out.println("生产出的ipod 是这样的");
    }


    @Override
    public void beSelled() {
        System.out.println("生产出的ipod卖出去了。。。");
    }
}

