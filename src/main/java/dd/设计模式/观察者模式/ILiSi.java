package dd.设计模式.观察者模式;

/**
 * @program: test
 * @description: 观察者接口
 * @author: 胡凯铭
 * @create: 2020-02-15 15:11
 **/

public interface ILiSi {
    /**
     *  一发现别人有东京自己就要行动起来
     * @param context
     */
    public void update(String context);
}
