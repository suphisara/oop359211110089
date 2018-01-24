package ooplab7;
//talking about student?
//1.student ID
//2.Name
//3.Adderss
//4.Gender



public class Student {
    //properties of student
    private String id;
    private String name;
    private  String Adderss;
    private  String Gender;
    //Constructor
    //Default Constructor
    Student() {}
    //Constructor by own
    public Student (String id ,String n ,String a , String g) {
        //assign data to properties
        this.id = id;
        this.name = name;
        this.Adderss = Adderss;
        this.Gender = Gender;
    }//Student
    //getter and setter methods

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Adderss='" + Adderss + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }

    public String getId(){
        return  this.id;
    }
    public void setId (String id) {
        this.id = id;
    }
    public  String getName() {
        return  this.name;
    }
    public  void setName (String name) {
        this.name = name;
    }

    public  String getAdderss() {
        return  this.Adderss;
    }
    public  void setAdderss (String Adderss) {
        this.Adderss = Adderss;
    }
    public  String getGender() {
        return  this.Gender;
    }
    public  void setGender (String Gender) {
        this.Gender = Gender;
    }

}//class