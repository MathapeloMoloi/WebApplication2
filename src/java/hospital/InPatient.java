package hospital;
// Generated Feb 23, 2016 10:54:10 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * InPatient generated by hbm2java
 */
public class InPatient  implements java.io.Serializable {


     private InPatientId id;
     private LocalDoctor localDoctor;
     private PatientMedication patientMedication;
     private Ward ward;
     private String patientFirstName;
     private String patientLastName;
     private String streetName;
     private Integer houseNo;
     private String city;
     private Integer cellphoneNo;
     private Date dateOfBirth;
     private Character sex;
     private Character maritalStatus;
     private Date dateRegistration;
     private Date datePlacedWard;
     private Date dateExpLeave;
     private Date actualDateLeft;
     private String wardNo;

    public InPatient() {
    }

	
    public InPatient(InPatientId id, LocalDoctor localDoctor, PatientMedication patientMedication, Ward ward) {
        this.id = id;
        this.localDoctor = localDoctor;
        this.patientMedication = patientMedication;
        this.ward = ward;
    }
    public InPatient(InPatientId id, LocalDoctor localDoctor, PatientMedication patientMedication, Ward ward, String patientFirstName, String patientLastName, String streetName, Integer houseNo, String city, Integer cellphoneNo, Date dateOfBirth, Character sex, Character maritalStatus, Date dateRegistration, Date datePlacedWard, Date dateExpLeave, Date actualDateLeft, String wardNo) {
       this.id = id;
       this.localDoctor = localDoctor;
       this.patientMedication = patientMedication;
       this.ward = ward;
       this.patientFirstName = patientFirstName;
       this.patientLastName = patientLastName;
       this.streetName = streetName;
       this.houseNo = houseNo;
       this.city = city;
       this.cellphoneNo = cellphoneNo;
       this.dateOfBirth = dateOfBirth;
       this.sex = sex;
       this.maritalStatus = maritalStatus;
       this.dateRegistration = dateRegistration;
       this.datePlacedWard = datePlacedWard;
       this.dateExpLeave = dateExpLeave;
       this.actualDateLeft = actualDateLeft;
       this.wardNo = wardNo;
    }
   
    public InPatientId getId() {
        return this.id;
    }
    
    public void setId(InPatientId id) {
        this.id = id;
    }
    public LocalDoctor getLocalDoctor() {
        return this.localDoctor;
    }
    
    public void setLocalDoctor(LocalDoctor localDoctor) {
        this.localDoctor = localDoctor;
    }
    public PatientMedication getPatientMedication() {
        return this.patientMedication;
    }
    
    public void setPatientMedication(PatientMedication patientMedication) {
        this.patientMedication = patientMedication;
    }
    public Ward getWard() {
        return this.ward;
    }
    
    public void setWard(Ward ward) {
        this.ward = ward;
    }
    public String getPatientFirstName() {
        return this.patientFirstName;
    }
    
    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }
    public String getPatientLastName() {
        return this.patientLastName;
    }
    
    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
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
    public Character getMaritalStatus() {
        return this.maritalStatus;
    }
    
    public void setMaritalStatus(Character maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public Date getDateRegistration() {
        return this.dateRegistration;
    }
    
    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }
    public Date getDatePlacedWard() {
        return this.datePlacedWard;
    }
    
    public void setDatePlacedWard(Date datePlacedWard) {
        this.datePlacedWard = datePlacedWard;
    }
    public Date getDateExpLeave() {
        return this.dateExpLeave;
    }
    
    public void setDateExpLeave(Date dateExpLeave) {
        this.dateExpLeave = dateExpLeave;
    }
    public Date getActualDateLeft() {
        return this.actualDateLeft;
    }
    
    public void setActualDateLeft(Date actualDateLeft) {
        this.actualDateLeft = actualDateLeft;
    }
    public String getWardNo() {
        return this.wardNo;
    }
    
    public void setWardNo(String wardNo) {
        this.wardNo = wardNo;
    }

    public String getInPatientname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}


