package dd.设计模式.享元模式;
import java.util.*;

/**
 * @program: test
 * @description: 第二版工厂
 * @author: 胡凯铭
 * @create: 2020-04-09 15:31
 **/

public class FiyweightFactiory {
    // 定义一个map 用来当作工厂对象
    private static Map<String,Flyweight> pool = new HashMap<String,Flyweight>();

    public static Flyweight getFlyweight(String Extrinsic){
        //需要返回的对象
        Flyweight flyweight = null;
        //在池中没有该对象
        if(pool.containsKey(Extrinsic)){
//            根据外部状态创建享元对象
            flyweight = pool.get(Extrinsic);

        }else{
            // 没有就根据 因变量创建对象 并加入到对象池中
            flyweight = new ConcreteFlyweight1(Extrinsic);
            //放置到池中
            pool.put(Extrinsic,flyweight);
        }

        return flyweight;

    }



}

