package dd.设计模式.观察者模式;


/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-02-16 11:54
 **/

public class LiuSi implements ILiSi {



    private void happy(String arg) {
        System.out.println("刘思：因为" + arg + ",我很快乐腌");
    }



    /**
     * 一发现别人有东京自己就要行动起来
     *
     * @param context
     */
    @Override
    public void update(String context) {
        System.out.println("刘思观察到韩非子的活动开始动作了");
        this.happy(context);
    }
}

