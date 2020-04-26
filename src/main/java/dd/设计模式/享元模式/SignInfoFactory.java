package dd.设计模式.享元模式;

import java.util.HashMap;

/**
 * @program: test
 * @description: 报考信息工厂
 * @author: 胡凯铭
 * @create: 2020-04-08 16:35
 **/

public class SignInfoFactory {

    //池容器
    private static HashMap<ExtrinsicStart,SignInfo> pool = new HashMap<ExtrinsicStart,SignInfo>();


@Deprecated
    public static SignInfo getSigInfo(){
        return new SignInfo();
    }

    //从池中获取对象
    public static SignInfo getSignInfo(ExtrinsicStart key){
        SignInfo result = null;

        if(!pool.containsKey(key)){
            System.out.println(key + "-----建立对象，并放置到池中间");
//            result = new SignInfo4Pool(key);
            result = new SignInfo();
            pool.put(key,result);
        }else{
            result = pool.get(key);
            System.out.println(key + "-----对象直接从对象池中获取");

        }

        return result;


    }


}


