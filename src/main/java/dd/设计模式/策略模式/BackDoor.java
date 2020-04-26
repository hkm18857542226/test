package dd.设计模式.策略模式;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-24 15:21
 **/

public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老开后门");
    }
}

