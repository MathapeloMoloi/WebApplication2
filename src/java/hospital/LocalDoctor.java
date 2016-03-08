package hospital;
// Generated Feb 23, 2016 10:54:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * LocalDoctor generated by hbm2java
 */
public class LocalDoctor  implements java.io.Serializable {


     private String clinicNo;
     private String inPatientNo;
     private String localDoctorFirstName;
     private String localDoctorLastName;
     private String streetName;
     private Integer houseNo;
     private String city;
     private Integer cellphoneNo;
     private Integer telNo;
     private Set inPatients = new HashSet(0);

    public LocalDoctor() {
    }

	
    public LocalDoctor(String clinicNo) {
        this.clinicNo = clinicNo;
    }
    public LocalDoctor(String clinicNo, String inPatientNo, String localDoctorFirstName, String localDoctorLastName, String streetName, Integer houseNo, String city, Integer cellphoneNo, Integer telNo, Set inPatients) {
       this.clinicNo = clinicNo;
       this.inPatientNo = inPatientNo;
       this.localDoctorFirstName = localDoctorFirstName;
       this.localDoctorLastName = localDoctorLastName;
       this.streetName = streetName;
       this.houseNo = houseNo;
       this.city = city;
       this.cellphoneNo = cellphoneNo;
       this.telNo = telNo;
       this.inPatients = inPatients;
    }
   
    public String getClinicNo() {
        return this.clinicNo;
    }
    
    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }
    public String getInPatientNo() {
        return this.inPatientNo;
    }
    
    public void setInPatientNo(String inPatientNo) {
        this.inPatientNo = inPatientNo;
    }
    public String getLocalDoctorFirstName() {
        return this.localDoctorFirstName;
    }
    
    public void setLocalDoctorFirstName(String localDoctorFirstName) {
        this.localDoctorFirstName = localDoctorFirstName;
    }
    public String getLocalDoctorLastName() {
        return this.localDoctorLastName;
    }
    
    public void setLocalDoctorLastName(String localDoctorLastName) {
        this.localDoctorLastName = localDoctorLastName;
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
    public Integer getTelNo() {
        return this.telNo;
    }
    
    public void setTelNo(Integer telNo) {
        this.telNo = telNo;
    }
    public Set getInPatients() {
        return this.inPatients;
    }
    
    public void setInPatients(Set inPatients) {
        this.inPatients = inPatients;
    }




}

