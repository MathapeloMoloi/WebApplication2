package hospital;
// Generated Feb 23, 2016 10:54:10 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PatientAppointment generated by hbm2java
 */
public class PatientAppointment  implements java.io.Serializable {


     private PatientAppointmentId id;
     private OutPatient outPatient;
     private Staff staff;
     private Date appDate;
     private Date appTime;

    public PatientAppointment() {
    }

	
    public PatientAppointment(PatientAppointmentId id, OutPatient outPatient, Staff staff) {
        this.id = id;
        this.outPatient = outPatient;
        this.staff = staff;
    }
    public PatientAppointment(PatientAppointmentId id, OutPatient outPatient, Staff staff, Date appDate, Date appTime) {
       this.id = id;
       this.outPatient = outPatient;
       this.staff = staff;
       this.appDate = appDate;
       this.appTime = appTime;
    }
   
    public PatientAppointmentId getId() {
        return this.id;
    }
    
    public void setId(PatientAppointmentId id) {
        this.id = id;
    }
    public OutPatient getOutPatient() {
        return this.outPatient;
    }
    
    public void setOutPatient(OutPatient outPatient) {
        this.outPatient = outPatient;
    }
    public Staff getStaff() {
        return this.staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    public Date getAppDate() {
        return this.appDate;
    }
    
    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }
    public Date getAppTime() {
        return this.appTime;
    }
    
    public void setAppTime(Date appTime) {
        this.appTime = appTime;
    }




}

