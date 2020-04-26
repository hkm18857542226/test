package dd.设计模式.代理模式.动态代理;

/**
 * @program: test
 * @description: 抽象主题
 * @author: 胡凯铭
 * @create: 2020-04-18 17:49
 **/

public interface Subject {
    /**
     *  实现具体的业务
     * @param str
     */
    void doSomething(String str);
}
