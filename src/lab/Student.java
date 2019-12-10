package lab;
import java.io.*;
public class Student extends Person implements Serializable {

    private String sid;
    private String major;
    Student(String sid,String name, String sex, int age,String major) {
        super(name, sex, age);
        this.sid = sid;
        this.major = major;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void display() {
        System.out.println("sid = " + getSid() +" ,name = "+this.name+" ,sex = "+this.sex+" ,age = "+this.age+ ",major = " + getMajor());
    }
}
