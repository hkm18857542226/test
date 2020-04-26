package dd.设计模式.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: test
 * @description: 导演类
 * @author: 胡凯铭
 * @create: 2020-04-14 17:29
 **/

public class Directro {

    private List<String> list = new ArrayList<>();

    private BeazBuilder benzModel = new BeazBuilder();

    /**
     *  A 类型的奔驰车模型
     * @return
     */
    public BenzModel getBeanzModel(){
        this.list.clear();
        this.list.add("engineBoom");
        this.list.add("start");
        this.list.add("stop");
        this.benzModel.setSequence(list);
        return (BenzModel) this.benzModel.getCarModel();

    }
}

