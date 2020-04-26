package dd.设计模式.享元模式;

/**
 * @program: test
 * @description: 多线程场景
 * @author: 胡凯铭
 * @create: 2020-04-09 16:28
 **/

public class MultiThread extends Thread{

    private SignInfo signInfo;

//    线程启动需要一个 报考信息的处理类  不然跑什么东习
    public MultiThread(SignInfo signInfo) {
        this.signInfo = signInfo;;
    }


    @Override
    public void run() {
         if(!signInfo.getId().equals(signInfo.getLocation())){
             System.out.println("编号为" + signInfo.getId());
             System.out.println("考试地址" + signInfo.getLocation());
             System.out.println("线程不安全了");
         }
    }
}

