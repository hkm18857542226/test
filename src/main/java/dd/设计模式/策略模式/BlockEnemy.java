package dd.设计模式.策略模式;

/**
 * @program: test
 * @description: 孙夫人断后
 * @author: 胡凯铭
 * @create: 2020-04-24 15:22
 **/

public class BlockEnemy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("找孙夫人断后");
    }
}

