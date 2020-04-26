package dd.设计模式.代理模式;

import dd.设计模式.代理模式.动态代理.DynamicProxy;
import dd.设计模式.代理模式.动态代理.MyInvocationHandler;
import dd.设计模式.代理模式.动态代理.RealSubject;
import dd.设计模式.代理模式.动态代理.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: test
 * @description: 场景类
 * @author: 胡凯铭
 * @create: 2020-04-15 16:39
 **/

public class Client {

    public static void main(String[] args) throws Exception {
        Subject subject = new RealSubject();

        InvocationHandler handler = new MyInvocationHandler(subject);

        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),new Class[]{Subject.class},handler);
        proxy.doSomething("sdf");

    }
}

