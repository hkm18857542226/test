package dd.设计模式.责任链模式;

/**
 * @program: test
 * @description: 丈夫类
 * @author: 胡凯铭
 * @create: 2020-04-22 15:35
 **/

public class HusbandHandlr extends Handlr{
    @Override
    public int getType() {
        return Handlr.HUSBAND_ID;
    }

    @Override
    public void response(String name) {
        System.out.println("处理的业务为" + name + "丈夫同意类");
    }
}

