package test;


import java.io.Serializable;
public class Teacher extends Person implements Serializable {
    private String tid;
    private String title;
    Teacher(String tid,String name, String sex, int age,String title) {
        super(name, sex, age);
        this.tid = tid;
        this.title = title;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("tid = "+getTid()+" ,name = "+this.name+" ,sex"+this.sex+" ,age = "+this.age+",title = "+getTitle());
    }
}
