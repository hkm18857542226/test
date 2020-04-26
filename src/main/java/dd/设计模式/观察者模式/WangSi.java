package dd.设计模式.观察者模式;



/**
 * @program: test
 * @description: 杜撰的观察者
 * @author: 胡凯铭
 * @create: 2020-02-16 11:24
 **/

public class WangSi implements ILiSi {



    private void cry(String context) {
        System.out.println("王思：因为" + context + "这是在观察者王思类中");
    }



    /**
     * 一发现别人有东京自己就要行动起来
     *
     * @param context
     */
    @Override
    public void update(String context) {
        System.out.println("王思：观察到韩非子活动，自己开始活动了");
        this.cry(context.toString());
        System.out.println("王思：哭死了");
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */


}

