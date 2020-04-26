package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description: iPod山寨公司
 * @author: 胡凯铭
 * @create: 2020-04-10 15:19
 **/

public class IpodCorp extends Corp{


    public IpodCorp(Product product) {
        super(product);
    }




    public void makeMondy() {
        super.makeMoney();
        System.out.println("我赚钱吖");
    }
}

