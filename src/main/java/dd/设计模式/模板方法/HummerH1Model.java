package dd.设计模式.模板方法;

/**
 * @program: test
 * @description: HummerModel1
 * @author: 胡凯铭
 * @create: 2020-04-13 16:04
 **/

public class HummerH1Model extends HummerModel{
    /*** 启动*/
    @Override
    public void start() {
        System.out.println("悍马H1 发动");
    }

    /*** 停止发动*/
    @Override
    public void stop() {
        System.out.println("悍马H1 停止发动");
    }

    /*** 喇叭叫*/
    @Override
    public void alaarm() {
        System.out.println("悍马H1 的喇叭是这哟按的");
    }

    /*** 引擎动起来*/
    @Override
    public void engineBoom() {
        System.out.println("引擎发动");
    }


}

