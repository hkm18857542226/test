package dd.设计模式.建造者模式;

/**
 * @program: test
 * @description: 奔驰模型
 * @author: 胡凯铭
 * @create: 2020-04-14 16:28
 **/

public class BenzModel extends CarModel{
    /*** 启动*/
    @Override
    public void start() {
        System.out.println("奔驰启动");
    }

    /*** 停止发动*/
    @Override
    public void stop() {
        System.out.println("奔驰停止发动");
    }

    /*** 喇叭叫*/
    @Override
    public void alaarm() {
        System.out.println("奔驰的喇叭叫");
    }

    /*** 引擎动起来*/
    @Override
    public void engineBoom() {
        System.out.println("奔驰引擎启动");
    }
}

