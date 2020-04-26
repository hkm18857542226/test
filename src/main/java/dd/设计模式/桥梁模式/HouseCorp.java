package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description: 房地产公司
 * @author: 胡凯铭
 * @create: 2020-04-10 15:04
 **/

public class HouseCorp extends Corp{

    public HouseCorp(Product product) {
        super(product);
    }


    public void makeMondy() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了。。。");
    }
}

