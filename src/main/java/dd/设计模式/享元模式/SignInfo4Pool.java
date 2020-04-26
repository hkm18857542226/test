package dd.设计模式.享元模式;

/**
 * @program: test
 * @description: 对象池的报考信息
 * @author: 胡凯铭
 * @create: 2020-04-08 17:14
 **/

public class SignInfo4Pool extends  SignInfo {
    /*8定义一个对象池提取的key值*/
    private String key;
    //构造函数获取相同的标志


    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

