package dd.设计模式.适配器模式;

/**
 * @program: test
 * @description: 实现类
 * @author: 胡凯铭
 * @create: 2020-02-12 15:36
 **/

public class UserInfo implements IUserInfo{
    @Override
    public String getUserName() {
        System.out.println("名字叫做");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭地址是在这里");
        return null;
    }
    /**
     * 获取手机号码
     * @return
     */
    @Override
    public String getMobileNumber() {
        System.out.println("手机号是这个");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("座机为");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这个人的职位是boss ");
        return null;
    }
}

