package hospital;
// Generated Feb 23, 2016 10:54:10 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OutPatient generated by hbm2java
 */
public class OutPatient  implements java.io.Serializable {


     private String outPatientNo;
     private String firstName;
     private String lastName;
     private String streetName;
     private Integer houseNo;
     private String city;
     private Integer cellphoneNo;
     private Date dateOfBirth;
     private Character sex;
     private Date appDate;
     private Date appTime;
     private Set patientAppointments = new HashSet(0);

    public OutPatient() {
    }

	
    public OutPatient(String outPatientNo) {
        this.outPatientNo = outPatientNo;
    }
    public OutPatient(String outPatientNo, String firstName, String lastName, String streetName, Integer houseNo, String city, Integer cellphoneNo, Date dateOfBirth, Character sex, Date appDate, Date appTime, Set patientAppointments) {
       this.outPatientNo = outPatientNo;
       this.firstName = firstName;
       this.lastName = lastName;
       this.streetName = streetName;
       this.houseNo = houseNo;
       this.city = city;
       this.cellphoneNo = cellphoneNo;
       this.dateOfBirth = dateOfBirth;
       this.sex = sex;
       this.appDate = appDate;
       this.appTime = appTime;
       this.patientAppointments = patientAppointments;
    }
   
    public String getOutPatientNo() {
        return this.outPatientNo;
    }
    
    public void setOutPatientNo(String outPatientNo) {
        this.outPatientNo = outPatientNo;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getStreetName() {
        return this.streetName;
    }
    
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public Integer getHouseNo() {
        return this.houseNo;
    }
    
    public void setHouseNo(Integer houseNo) {
        this.houseNo = houseNo;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public Integer getCellphoneNo() {
        return this.cellphoneNo;
    }
    
    public void setCellphoneNo(Integer cellphoneNo) {
        this.cellphoneNo = cellphoneNo;
    }
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Character getSex() {
        return this.sex;
    }
    
    public void setSex(Character sex) {
        this.sex = sex;
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
    public Set getPatientAppointments() {
        return this.patientAppointments;
    }
    
    public void setPatientAppointments(Set patientAppointments) {
        this.patientAppointments = patientAppointments;
    }




}


