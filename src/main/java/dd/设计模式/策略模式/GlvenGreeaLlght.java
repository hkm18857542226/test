package dd.设计模式.策略模式;

/**
 * @program: test
 * @description: 吴国太开绿灯
 * @author: 胡凯铭
 * @create: 2020-04-24 15:21
 **/

public class GlvenGreeaLlght implements IStrategy{
    @Override
    public void operate() {
        System.out.println("找吴国太开路灯");
    }
}

