package dd.设计模式.责任链模式;

/**
 * @program: test
 * @description: 父类
 * @author: 胡凯铭
 * @create: 2020-04-22 15:34
 **/

public class FatherHandlr extends Handlr {


    @Override
    public int getType() {
        return Handlr.FATHER_INT;
    }

    @Override
    public void response(String name) {
        System.out.println(name + "父亲同意了");
    }
}

