package Lab7_exercise4;

import java.util.Arrays;

public class Institute {
    private String name;
    private Department[] departments;

    public Institute(String name, Department[] departments) {
        setName(name);
        setDepartments(departments);
    }

    @Override
    public String toString() {
        String text = this.name + " has " + " departments: \n";
        for (Department dep : departments) {
            if (dep != null) {
                text += dep.toString() + "\n";
            }
        }
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setDepartments(Department[] departments) {
        if (departments == null) {
            return;
        }
        this.departments = Arrays.copyOf(departments, departments.length);
    }

    public String getName() {
        return name;
    }

    public Department[] getDepartments() {
        if (this.departments == null)
            return null;
        return Arrays.copyOf(this.departments, this.departments.length);
    }

    public int getTotalStudent() {
        int count = 0;
        if (departments == null) {
            return count;
        }

        for (Department dep : this.departments) {
            if (dep == null)
                continue;
            count += dep.getStudents().length;
        }
        return count;
    }
}
