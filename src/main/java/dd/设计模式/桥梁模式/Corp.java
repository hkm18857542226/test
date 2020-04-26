package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description: 抽象公司
 * @author: 胡凯铭
 * @create: 2020-04-10 14:56
 **/

public abstract class Corp {

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }
    //    赚钱
    public void makeMoney(){
        this.product.beProducted();

        this.product.beSelled();
    }

}

