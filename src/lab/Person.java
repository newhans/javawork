package lab;
import java.io.*;
public class Person implements Serializable {
    protected String name;
    protected String sex;
    protected int age;
    Person(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }
    public String getSex(){
        return this.sex;
    }
    public void setSex(){
        this.sex = sex;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(){
        this.age = age;
    }

    public void display(){
        //toString
        System.out.println("name = "+getName()+",sex = "+getSex()+",age = "+getAge());
    }
}
/*
import java.io.Serializable;

public class Person implements Serializable {
    protected String name, sex;
    protected int age;

    public Person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void display(){
        System.out.printf("the Person info: name:%s, sex:%s, age:%d\n", this.name, this.sex, this.age);
    }

}
*/