package dd.设计模式.中介者模式;

/**
 * @program: test
 * @description: 采购管理
 * @author: 胡凯铭
 * @create: 2020-04-20 15:49
 **/

public class Purchase {

//    采购IBM 的电脑
    public void buyIBMcomputer(int number){
        Stock stock = new Stock();

    }

    /**
     * 不才狗IBM 的电脑
     */
    public void refuseBuyIBM(){
        System.out.println(" 不 再采购IBM的 电脑");
    }
}

