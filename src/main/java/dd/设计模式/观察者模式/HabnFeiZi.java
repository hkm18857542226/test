package dd.设计模式.观察者模式;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: test
 * @description: 具体的被观察这
 * @author: 胡凯铭
 * @create: 2020-02-15 13:52
 **/

    public class HabnFeiZi implements IHanFeizi,Observer{
    /**
     * 韩非子时否是在吃饭，作为监控的判断标准
     */
        private boolean isHavingBreakfast = false;
    /**
     * 韩非子是否是在娱乐
     */
    private boolean isHavingFun = false;

    /**
     *  定义数组存放所有观察者
     */
    private List<ILiSi> observersList = new ArrayList<ILiSi>();

    /**
     * 被观察的人吃早饭
     */
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了");
        this.isHavingBreakfast = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }

    //韩非之是人 是人就要快活
    @Override
    public void havenFun() {
        System.out.println("韩非子开始娱乐了。。。");
        this.isHavingFun = true;
        this.notifyObserver("韩非子开始娱乐了");
    }

    @Override
    public void addObserver(ILiSi observer) {
        this.observersList.add(observer);
    }

    @Override
    public void deleteObserver(ILiSi observer) {
        this.observersList.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (ILiSi observer:observersList
             ) {

            observer.update(context);
        }
    }


}

