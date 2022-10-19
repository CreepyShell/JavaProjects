package Lab10;

import java.util.Arrays;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffId;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    @Override
    public String toString() {
        return "Lecturer: {" +
                "name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                ", dateOfBirth = " + dateOfBirth +
                ", staffId = '" + staffId + '\'' +
                ", coursesTaught = " + Arrays.toString(coursesTaught) +
                ", dateOfAppointment = " + dateOfAppointment +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public Lecturer(String name, String address, GregorianCalendar dateOfBirth, String staffId, String[] coursesTaught, GregorianCalendar dateOfAppointment) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffId(staffId);
        setCoursesTaught(coursesTaught);
        setCoursesTaught(coursesTaught);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public abstract String getStatus();
    public abstract int getPointOnScale();
}
