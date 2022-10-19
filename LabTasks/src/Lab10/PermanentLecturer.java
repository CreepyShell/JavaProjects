package Lab10;

import java.util.Date;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer {
    private String pensionEntitlements;
    private String status;

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
        long years = new Date(System.currentTimeMillis()).getTime() - this.getDateOfAppointment().getTime().getTime();
        if (years / 1000 / 3600 / 24 / 365 > 20) {
            return 20;
        }
        return Math.round(years / 1000 / 3600 / 24 / 365);
    }
}
