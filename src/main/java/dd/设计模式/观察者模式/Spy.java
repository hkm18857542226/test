package dd.设计模式.观察者模式;

/**
 * @program: test
 * @description: 间谍
 * @author: 胡凯铭
 * @create: 2020-02-15 15:22
 **/

public class Spy extends Thread{

    private HabnFeiZi habnFeiZi;

    private LiSi liSi;

    private String  type;

    public Spy(HabnFeiZi habnFeiZi, LiSi liSi, String type) {
        this.habnFeiZi = habnFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    public void spit() throws InterruptedException {
        sleep(10000);
    }



    @Override
    public void run() {
        while(true){
            if(this.type.equals("breakfast")){
                this.liSi.update("韩非子在吃饭");
                this.habnFeiZi.setHavingBreakfast(false);
            }else{
                //是否在娱乐
                if(this.habnFeiZi.isHavingFun()){
                    this.liSi.update("韩非子在yule");
                    this.habnFeiZi.setHavingFun(false);
                }
            }
        }
    }
}

