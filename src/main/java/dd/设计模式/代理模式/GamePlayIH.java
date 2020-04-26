package dd.设计模式.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: test
 * @description: 动态代理类
 * @author: 胡凯铭
 * @create: 2020-04-18 17:05
 **/

public class GamePlayIH implements InvocationHandler {

    //代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("使用了方法名为" + method.getName());
        return method.invoke(this.obj,args);
    }
}

