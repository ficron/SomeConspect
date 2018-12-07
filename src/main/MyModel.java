package main;

import jsp_p.Student;

public class MyModel  {

    public Student getStudent(){
        Student student = new Student();
        student.setAge(22);
        student.setName("Max");

        return student;
    }
}
