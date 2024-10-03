//Create 'Person' interface and that interface should have getAttandenceString() function.
//Create two class Teacher and  Student. Both should have necessary fields.
//Last step update the Italian and Math class's takeAttandence function's parameter to Person type and just call getAttandenceString()



/*
    1- Create "Class" interface which will have takeAttendance and getAttendanceList functions.
    implement that interface from 2 class which called "Math" and "Italian". write test cases.
 */

import java.util.ArrayList;
import java.util.List;

public interface Class {
    void takeAttendance(Person person);
    List<String> getAttendanceList();
}

class Math implements Class {
    List<String> attendanceList;

    public Math() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(Person person) {
        attendanceList.add(person.getAttendanceString());
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class Italian implements Class {
    List<String> attendanceList;

    public Italian() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(Person person) {
        attendanceList.add(person.getAttendanceString());
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

interface Person {
    String getAttendanceString();
}

class Student implements Person {
    private String id;
    private String name;
    private double grade ;

    public Student(){

    }
    public Student(String id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String getAttendanceString() {
        return "this is student ("+this.name+")";
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public String getName(){
        return this.name;
    }
    public String getId() {
        return this.id;
    }
    public double getGrade(){
        return this.grade;
    }
}

class Teacher implements Person {
    private String id;
    private String name;
    private String course;
    public Teacher(){}
    public Teacher(String id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String getAttendanceString() {
        return "this is teacher ("+this.name+")";
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getCourse(){
        return this.course;
    }
}

class ClassRunner {
    public static void main(String[] args) {
        Class mathClass = new Math();
        Class italianClass = new Italian();

        Person student1 = new Student("1122", "Mirgisa",3.00);
        Person student2 = new Student("2233", "Wafi",4.00);
        mathClass.takeAttendance(student1);
        mathClass.takeAttendance(student2);

        Person teacher1 = new Teacher("3344", "Mr. Husein","Advanced Java");
        Person teacher2 = new Teacher("4455", "Melissa", "Introduction to Programming");
        italianClass.takeAttendance(teacher1);
        italianClass.takeAttendance(teacher2);

        System.out.println(mathClass.getAttendanceList());
        System.out.println(italianClass.getAttendanceList());
    }
}
