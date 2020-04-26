package dd.设计模式.观察者模式;

/**
 * @program: test
 * @description:  李斯
 * @author: 胡凯铭
 * @create: 2020-02-15 15:12
 **/

public class LiSi implements ILiSi {
    /**
     * 一发现别人有东京自己就要行动起来
     *
     * @param context
     */
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子的活动");
        this.reportToQiShiHuang(context);
        System.out.println("里斯汇报完毕");
    }

    /**
     * 汇报给秦始皇
     * @param context
     */
    private void reportToQiShiHuang(String context) {
        System.out.println("李斯：报告，秦老板！韩非子有活动 ---》" + context);
    }




}

