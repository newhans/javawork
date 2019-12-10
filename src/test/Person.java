package test;

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

