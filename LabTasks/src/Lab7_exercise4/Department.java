package Lab7_exercise4;

import java.util.Arrays;

public class Department {
    private String name;
    private Student[] students;

    public Department(String name, Student[] students) {
        setName(name);
        setStudents(students);
    }

    public String toString() {
        String text = "The " + this.name + " department has those students\n";
        for (Student st : this.students) {
            if (st != null) {
                text += st.toString() + "\n";
            }
        }
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        if (students == null) return;
        this.students = Arrays.copyOf(students, students.length);
    }

    public String getName() {
        return this.name;
    }

    public Student[] getStudents() {
        if (students == null) {
            return new Student[]{};
        }
        return Arrays.copyOf(students, students.length);
    }
}
