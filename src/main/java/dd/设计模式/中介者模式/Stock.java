package dd.设计模式.中介者模式;

/**
 * @program: test
 * @description: 库存管理
 * @author: 胡凯铭
 * @create: 2020-04-20 15:55
 **/

public class Stock {

    private static int COMPUTER_NUBER = 100;

    /**
     *  库存增加
     * @param number
     */
    public void increase(int number){
        COMPUTER_NUBER = COMPUTER_NUBER + number;
        System.out.println("库存增加了数量为" + COMPUTER_NUBER);
    }

    public void decrease(int number){
        COMPUTER_NUBER = COMPUTER_NUBER - number;
        System.out.println("库存减少了数量为" + COMPUTER_NUBER);
    }

    /**
     *  获取库存的数量
     * @return
     */
    public int getStockNumber(){
        return COMPUTER_NUBER;
    }

    /**
     *   当存货压力大了的时候就通知采购的不要采购了 销售的赶紧销售
     */
    public void clearStock(){
        Purchase purchase = new Purchase();
        purchase.refuseBuyIBM();;

    }
}

