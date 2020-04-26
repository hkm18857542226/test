package dd.设计模式.观察者模式;

/**
 * @program: test
 * @description: 观察一哈这接口
 * @author: 胡凯铭
 * @create: 2020-02-16 12:03
 **/

public interface Observer {
     public void addObserver(ILiSi ILiSi);

     public void deleteObserver(ILiSi observer);

     public void notifyObserver(String context);


}

