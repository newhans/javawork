package lab;
import java.io.*;
public class Schedule implements Serializable{
    private String classid;
    private String cid;
    private String tid;
    private String classroom;
    Schedule(String classid,String cid,String tid,String classroom){
        this.classid = classid;
        this.cid = cid;
        this.tid = tid;
        this.classroom = classroom;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void display(){
        System.out.println("classid = "+getClassid()+",cid "+getCid()+",tid = "+getTid()+",classroom = "+getClassroom());
    }
}
