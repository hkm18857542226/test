package dd.设计模式.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: test
 * @description: 车辆模型的抽象类
 * @author: 胡凯铭
 * @create: 2020-04-14 16:20
 **/

public abstract class CarModel {

    public List<String> squence = new ArrayList<String>();

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
        for (String s:squence
             ) {
            switch (s){
                case "start":
                    this.start();
                    break;
                case "stop":
                    this.stop();
                    break;
                case "alaarm":
                    this.alaarm();
                    break;
                case "engineBoom":
                    this.engineBoom();
                    break;
                    default:
            }
        }
    }

    public void setSquence(List<String> squence) {
        this.squence = squence;
    }
}

