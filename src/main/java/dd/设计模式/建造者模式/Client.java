package dd.设计模式.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-14 16:33
 **/

public class Client {
    /**
     *  使用的场景
     *  1
     * @param args
     */

    public static void main(String[] args) {
        CarModel carModel = new BenzModel();

        List<String>list = new ArrayList<>();
        list.add("engineBoom");
        list.add("start");
        list.add("stop");


        BeazBuilder beazBuilder = new BeazBuilder();
        beazBuilder.setSequence(list);

        BenzModel benzModel = (BenzModel) beazBuilder.getCarModel();
        benzModel.run();
    }
}

