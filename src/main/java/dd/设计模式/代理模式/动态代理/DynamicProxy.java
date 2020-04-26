package dd.设计模式.代理模式.动态代理;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: test
 * @description: 动态代理类
 * @author: 胡凯铭
 * @create: 2020-04-18 18:08
 **/

public class DynamicProxy<T> {

    public static <T>T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
        return (T)Proxy.newProxyInstance(loader,interfaces,h);
     }

}

