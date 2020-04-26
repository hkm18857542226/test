package dd.设计模式.代理模式;

/**
 * @program: test
 * @description: 游戏者接口
 * @author: 胡凯铭
 * @create: 2020-04-15 16:29
 **/

public interface IGamePlayer{
    //登录游戏
    public void login(String user,String password);

    /**
     *  杀怪
     */
    public void KillBoss();

    /**
     *  升级
     */
    public void upgrade();

    /**
     *  获取自己的代理类
     * @return
     */
    public IGamePlayer getProxy() throws Exception;

}
