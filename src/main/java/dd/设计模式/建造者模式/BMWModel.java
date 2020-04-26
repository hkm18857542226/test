package dd.设计模式.建造者模式;

/**
 * @program: test
 * @description: 宝马模型
 * @author: 胡凯铭
 * @create: 2020-04-14 16:30
 **/

public class BMWModel extends CarModel {
    /*** 启动*/
    @Override
    public void start() {
        System.out.println("宝马启动");
    }

    /*** 停止发动*/
    @Override
    public void stop() {
        System.out.println("宝马停止发动");
    }

    /*** 喇叭叫*/
    @Override
    public void alaarm() {
        System.out.println("包埋喇叭叫");
    }

    /*** 引擎动起来*/
    @Override
    public void engineBoom() {
        System.out.println("宝马引擎启动");
    }
}

