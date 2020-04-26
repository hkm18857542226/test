package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description: 服装公司
 * @author: 胡凯铭
 * @create: 2020-04-10 15:07
 **/

public class ClothesCorp extends Corp {

    public ClothesCorp(Product product) {
        super(product);
    }



    public void makeMondy() {
        super.makeMoney();
        System.out.println("服装公司赚小钱");
    }
}

