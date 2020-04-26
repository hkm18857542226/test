package dd.设计模式.代理模式.动态代理;

/**
 * @program: test
 * @description: 真实主题
 * @author: 胡凯铭
 * @create: 2020-04-18 17:50
 **/

public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}

