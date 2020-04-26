package dd.设计模式.建造者模式;

import java.util.List;

/**
 * @program: test
 * @description: 抽象汽车组装者
 * @author: 胡凯铭
 * @create: 2020-04-14 16:46
 **/

public abstract class CarBuilder {
    /**
     *  s启动的顺序
     * @param list
     */
    public abstract  void setSequence(List<String>list);

    /**
     * 通过给定的顺序 返回一个模型
     * @return
     */
    public abstract CarModel getCarModel();

}

