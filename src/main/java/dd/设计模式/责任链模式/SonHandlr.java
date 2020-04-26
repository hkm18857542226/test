package dd.设计模式.责任链模式;

/**
 * @program: test
 * @description: 儿子类
 * @author: 胡凯铭
 * @create: 2020-04-22 15:35
 **/

public class SonHandlr extends Handlr{
    @Override
    public int getType() {
        return Handlr.SON_ID;
    }

    @Override
    public void response(String name) {
        System.out.println("业务" + name + "儿子同意了");
    }
}

