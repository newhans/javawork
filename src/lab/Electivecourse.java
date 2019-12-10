package lab;

import java.io.Serializable;

public class Electivecourse implements Serializable {
    private String elid;
    private String sid;
    private String classid;
    Electivecourse(String elid,String sid,String classid){
        this.elid = elid;
        this.sid =sid;
        this.classid = classid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getElid() {
        return elid;
    }

    public void setElid(String elid) {
        this.elid = elid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
    public void display() {
        System.out.println("elid = " + getElid() + ",sid = " + getSid() + ",classid = " + getClassid());
    }
}
