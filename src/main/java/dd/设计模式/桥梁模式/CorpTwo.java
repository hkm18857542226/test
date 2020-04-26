package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description: 第二版抽象公司
 * @author: 胡凯铭
 * @create: 2020-04-10 15:44
 **/

public abstract class CorpTwo {

    private Product product;

    public CorpTwo(Product product) {
        this.product = product;
    }
//    赚钱
    public void makeMoney(){
        this.product.beProducted();

        this.product.beSelled();
    }
}

