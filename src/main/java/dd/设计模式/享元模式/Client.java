package dd.设计模式.享元模式;

/**
 * @program: test
 * @description: 场景类
 * @author: 胡凯铭
 * @create: 2020-04-08 16:37
 **/

public class Client {
    public static void main(String[] args){
        ExtrinsicStart statel = new ExtrinsicStart();
        statel.setSubject("科目一");
        statel.setLocation("上海");
        SignInfoFactory.getSignInfo(statel);
        ExtrinsicStart start2 = new ExtrinsicStart();
        start2.setSubject("科目一");
        start2.setLocation("上海");

        Long currentTime = System.currentTimeMillis();
        for (int i = 0;i < 1000000;i++){
            SignInfoFactory.getSignInfo(start2);
        }
        Long curentTime2 = System.currentTimeMillis();
        System.out.println("执行的时间：" + (curentTime2 - currentTime));





    }
}

