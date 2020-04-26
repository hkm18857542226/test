package dd.设计模式.享元模式;

/**
 * @program: test
 * @description: 具体的享元角色
 * @author: 胡凯铭
 * @create: 2020-04-09 15:25
 **/

public class ConcreteFlyweight1 extends Flyweight {
    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //具体的业务逻辑比如调用dao 层的方法
    }
}

