package dd.设计模式.工厂方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: test
 * @description: 单列工厂类
 * @author: 胡凯铭
 * @create: 2020-04-11 16:23
 **/

public class SingletoFacory {

    private static Singleton singleton;

    static{
        try{
            Class cl = Class.forName(Singleton.class.getName());

            Constructor constructor = cl.getDeclaredConstructor();

            constructor.setAccessible(true);

            singleton =(Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Singleton getSingleton(){
        return singleton;
    }

}

