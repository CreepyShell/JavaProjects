package Lab10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer {

    private int hoursWorked;

    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffId, String[] coursesTaught, GregorianCalendar dateOfAppointment, int hoursWorked) {
        super(name, address, dateOfBirth, staffId, coursesTaught, dateOfAppointment);
        setHoursWorked(hoursWorked);
    }

    @Override
    public String toString() {
        return super.toString() +
                "hoursWorked=" + getHoursWorked();
    }

    @Override
    public String getStatus() {
        return "Contracted temporary lecturer on part-time hours";
    }

    @Override
    public int getPointOnScale() {
        Calendar current = Calendar.getInstance();
        if (current.get(Calendar.YEAR) - getDateOfAppointment().get(Calendar.YEAR) >= 3 && getHoursWorked() > 1500) {
            return 4;
        } else if (current.get(Calendar.YEAR) - getDateOfAppointment().get(Calendar.YEAR) >= 3 && getHoursWorked() > 1000) {
            return (int) Math.floor(getHoursWorked() * 1.33 / 700.0 + 1);
        }
        return current.get(Calendar.YEAR) - getDateOfAppointment().get(Calendar.YEAR);

    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0)
            hoursWorked = 0;
        this.hoursWorked = hoursWorked;
    }
}
