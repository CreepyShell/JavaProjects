package Lab7_exercise4;

public class Department {
    private String name;
    private Student[] students;

    public Department(String name, Student[] students){
        setName(name);
        setStudents(students);
    }

    public String toString(){
        return "The "+ this.name + " department has "+students.length +" students";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }

    public String getName(){
        return this.name;
    }

    public Student[] getStudents() {
        return students;
    }
}
