package dd.设计模式.代理模式;

/**
 * @program: test
 * @description: 游戏者
 * @author: 胡凯铭
 * @create: 2020-04-15 16:32
 **/

public class GamPlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer iGamePlayer = null;

    public GamPlayer(String name) {


        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if(isProxy()){
            System.out.println("游戏名" + this.name + "账号名"  + user + "指挥官登录了");
        }else {
            System.out.println("操作失败");

        }

    }

    /**
     * 杀怪
     */
    @Override
    public void KillBoss() {
        if(isProxy()){
            System.out.println(this.name + "再打怪");
        }else{
            System.out.println("操作失败");
        }

    }

    /**
     * 升级
     */
    @Override
    public void upgrade() {
        if(this.isProxy()){
            System.out.println(this.name + "又升级了");
        }else{
            System.out.println("失败的");
        }

    }

    /**
     * 获取自己的代理类
     *
     * @return
     */
    @Override
    public IGamePlayer getProxy() throws Exception {
        this.iGamePlayer = new GamePlayerProxy(this);
        return this.iGamePlayer;
    }


    private boolean isProxy(){
        if (iGamePlayer == null){
            return false;
        }

        return  true;
    }
}

