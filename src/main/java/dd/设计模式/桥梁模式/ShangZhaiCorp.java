package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description: 山寨公司
 * @author: 胡凯铭
 * @create: 2020-04-10 15:57
 **/

public class ShangZhaiCorp extends Corp {

    public ShangZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱吖");
    }
}

