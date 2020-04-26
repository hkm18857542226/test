package dd.设计模式.建造者模式;

import java.util.List;

/**
 * @program: test
 * @description: 奔驰车组装者
 * @author: 胡凯铭
 * @create: 2020-04-14 16:44
 **/

public class BeazBuilder extends CarBuilder{

    private BenzModel benz = new BenzModel();

    /**
     * s启动的顺序
     *
     * @param list
     */
    @Override
    public void setSequence(List<String> list) {
        this.benz.setSquence(list);
    }

    /**
     * 通过给定的顺序 返回一个模型
     *
     * @return
     */
    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}

