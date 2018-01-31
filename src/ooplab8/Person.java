package ooplab8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private  String gender;
    private Date dateOFBirth;
    private int age;
    //constructor

    public Person(String name, String gender, Date dateOFBirth, int age) {
        this.name = name;
        this.gender = gender;
        this.dateOFBirth = dateOFBirth;
        this.age = age;
    }
    //toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOFBirth=" + dateOFBirth +
                ", age=" + age +
                '}';
    }

    //getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(Date dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
