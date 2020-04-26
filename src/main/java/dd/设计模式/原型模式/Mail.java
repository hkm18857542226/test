package dd.设计模式.原型模式;

import java.util.ArrayList;

/**
 * @program: test
 * @description: 邮件类
 * @author: 胡凯铭
 * @create: 2020-04-19 16:37
 **/

public class Mail implements Cloneable{
    private String receiver;

    private String subject;

    private String appellation;

    private String context;

    private String tail;


    private   ArrayList list = new ArrayList();
    @Override
    protected Mail clone() throws CloneNotSupportedException {

        Mail mail = null;
        try{
            mail = (Mail)super.clone();
            mail.list = (ArrayList)list.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return mail;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}

