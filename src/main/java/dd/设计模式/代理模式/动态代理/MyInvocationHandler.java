package dd.设计模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: test
 * @description: 动态代理的Handler类
 * @author: 胡凯铭
 * @create: 2020-04-18 17:51
 **/

public class MyInvocationHandler implements InvocationHandler {
    private Object obj = null;

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(this.obj,args);
    }
}

