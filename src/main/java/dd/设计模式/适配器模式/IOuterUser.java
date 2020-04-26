package dd.设计模式.适配器模式;

import java.util.Map;

/**
 * @program: test
 * @description: 劳动服务公司的人员信息接口
 * @author: 胡凯铭
 * @create: 2020-02-12 16:35
 **/

public interface IOuterUser {
    /**
     *  基本信息 名称 性别  手机号码
     * @return
     */
    public Map getUserBeaseInfo();

    /**
     * 工作区域的信息
     * @return
     */
    public Map getUserOfficeInfo();

    /**
     *  用户的家庭信息
     * @return
     */
    public Map getUserHomeInfo();


}
