package Lab10;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer {
    private String pensionEntitlements;
    private String status;

    @Override
    public String toString() {
        return super.toString() +
                "pensionEntitlements='" + getPensionEntitlements() + '\'' +
                ", status='" + getStatus();
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }


    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffId, String[] coursesTaught, GregorianCalendar dateOfAppointment, String pensionEntitlements, String status) {
        super(name, address, dateOfBirth, staffId, coursesTaught, dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public int getPointOnScale() {
        int yearOfAppointment = getDateOfAppointment().get(Calendar.YEAR);
        int thisYear = (new Date(System.currentTimeMillis())).toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear();
        if (yearOfAppointment - thisYear > 20)
            return 20;
        return yearOfAppointment - thisYear;
    }
}
