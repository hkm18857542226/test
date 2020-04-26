package dd.设计模式.工厂方法;

/**
 * @program: test
 * @description: 人类创建的工厂
 * @author: 胡凯铭
 * @create: 2020-04-11 15:31
 **/

public class HumanFactory extends AbstractHumanFactory {
    /**
     * @param c
     * @return
     */
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;


        try {
            human =(Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生产错误");
        }

        return (T)human;
    }
}

