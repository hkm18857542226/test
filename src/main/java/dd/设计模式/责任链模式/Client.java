package dd.设计模式.责任链模式;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-22 15:44
 **/

public class Client {
    public static void main(String[] args) {
        Handlr handlr = new FatherHandlr();
        Handlr husband = new HusbandHandlr();
        Handlr son = new SonHandlr();
        handlr.setNext(husband);
        husband.setNext(son);
        System.out.println(handlr.getType());
        handlr.hankderMessage("张三",2);

    }
}

