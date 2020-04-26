package dd.设计模式.代理模式;

/**
 * @program: test
 * @description: 代练 者
 * @author: 胡凯铭
 * @create: 2020-04-18 15:34
 **/

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer iGamePlayer;

    public GamePlayerProxy(IGamePlayer iGamePlayer) {
        this.iGamePlayer = iGamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.iGamePlayer.login(user,password);
    }

    /**
     * 杀怪
     */
    @Override
    public void KillBoss() {
        this.iGamePlayer.KillBoss();
    }

    /**
     * 升级
     */
    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }

    /**
     * 获取自己的代理类
     *
     * @return
     */
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}

