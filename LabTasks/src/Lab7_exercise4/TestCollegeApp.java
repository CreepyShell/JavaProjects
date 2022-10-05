package Lab7_exercise4;

import javax.swing.*;

public class TestCollegeApp {
    public static void main(String[] args) {
        Student student1 = new Student(154345, "Jake", "Computing");
        Student student2 = new Student(234532, "Mary", "Creative Media");
        Student student3 = new Student(453726, "Tommy", "Computing");
        Student student4 = new Student(623456, "Peter", "Creative Media");

        Student[] computingStudents = new Student[10];
        computingStudents[0] = student1;
        computingStudents[1] = student3;

        Student[] creativeMediaStudents = new Student[10];
        creativeMediaStudents[0] = student2;
        creativeMediaStudents[1] = student4;

        Department computingDepartment = new Department("Computing", computingStudents);
        Department creativeMediaDepartment = new Department("Creative Media", creativeMediaStudents);

        Department[] departments = new Department[5];
        departments[0] = computingDepartment;
        departments[1] = creativeMediaDepartment;

        Institute institute = new Institute("Institute of Technology, Tralee", departments);


        creativeMediaStudents[2] = student1;
        computingStudents[0] = null;
        System.out.println(institute.toString());

    }
}
