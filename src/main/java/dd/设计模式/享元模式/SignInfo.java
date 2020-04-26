package dd.设计模式.享元模式;

/**
 * @program: test
 * @description: 报考信息
 * @author: 胡凯铭
 * @create: 2020-04-08 16:33
 **/

public class SignInfo {

    private String id;

    private String location;

    private String subject;

    private String pstAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPstAddress() {
        return pstAddress;
    }

    public void setPstAddress(String pstAddress) {
        this.pstAddress = pstAddress;
    }
}

