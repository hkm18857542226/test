package dd.设计模式.观察者模式;

/**
 * @program: test
 * @description: chan
 * @author: 胡凯铭
 * @create: 2020-02-15 16:52
 **/

public class Client {
    public static void main(String[] args) throws InterruptedException {
      ILiSi liSi = new LiSi();
      ILiSi wangsi = new WangSi();
      ILiSi liousi = new LiuSi();
        HabnFeiZi hanFeizi = new HabnFeiZi();
       hanFeizi.addObserver(liSi);
       hanFeizi.addObserver(wangsi);
       hanFeizi.addObserver(liousi);
       hanFeizi.havenFun();

    }
}

