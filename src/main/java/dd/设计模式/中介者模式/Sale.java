package dd.设计模式.中介者模式;

/**
 * @program: test
 * @description: 销售管理
 * @author: 胡凯铭
 * @create: 2020-04-20 16:20
 **/

public class Sale {

//    销售IBM 电脑
    public void sellIBMComputer(int number){
        Stock stock = new Stock();

        Purchase purchase  = new Purchase();

        if(stock.getStockNumber() < number){
            purchase.buyIBMcomputer(number);
        }
    }
}

