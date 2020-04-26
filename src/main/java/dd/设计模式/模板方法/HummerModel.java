package dd.设计模式.模板方法;

/**
 * @program: test
 * @description: 抽象悍马模型
 * @author: 胡凯铭
 * @create: 2020-04-13 15:58
 **/

public abstract class HummerModel {
    /*** 启动*/
    public abstract void start();
    /*** 停止发动*/
    public abstract void stop();
    /*** 喇叭叫*/
    public abstract void alaarm();
    /*** 引擎动起来*/
    public abstract void engineBoom();
    /*** 模型会跑*/
    public   void run(){
        this.start();
        this.engineBoom();
        this.alaarm();
        this.stop();
    }
}

