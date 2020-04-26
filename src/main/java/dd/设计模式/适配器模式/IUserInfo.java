package dd.设计模式.适配器模式;

/**
 * @program: test
 * @description: 员工信息接口
 * @author: 胡凯铭
 * @create: 2020-02-12 14:48
 **/

public interface IUserInfo {
    //用户的姓名
    public String getUserName();

//    获得家庭地址
    public String getHomeAddress();

    /**
     * 获取手机号码
     * @return
     */
    public  String getMobileNumber();

    /**
     *     办公电话 座机
      */
    public String getOfficeTelNumber();

    /**
     * 这个人的职位时什么
     */
    public String getJobPosition();

}
