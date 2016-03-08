package hospital;
// Generated Feb 23, 2016 10:54:10 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PatientMedication generated by hbm2java
 */
public class PatientMedication  implements java.io.Serializable {


     private String inPatientNo;
     private Integer drugNo;
     private String drugName;
     private Integer unitPerDay;
     private String methodOfAdmin;
     private Date startDate;
     private Date finishDate;
     private Set inPatients = new HashSet(0);

    public PatientMedication() {
    }

	
    public PatientMedication(String inPatientNo) {
        this.inPatientNo = inPatientNo;
    }
    public PatientMedication(String inPatientNo, Integer drugNo, String drugName, Integer unitPerDay, String methodOfAdmin, Date startDate, Date finishDate, Set inPatients) {
       this.inPatientNo = inPatientNo;
       this.drugNo = drugNo;
       this.drugName = drugName;
       this.unitPerDay = unitPerDay;
       this.methodOfAdmin = methodOfAdmin;
       this.startDate = startDate;
       this.finishDate = finishDate;
       this.inPatients = inPatients;
    }
   
    public String getInPatientNo() {
        return this.inPatientNo;
    }
    
    public void setInPatientNo(String inPatientNo) {
        this.inPatientNo = inPatientNo;
    }
    public Integer getDrugNo() {
        return this.drugNo;
    }
    
    public void setDrugNo(Integer drugNo) {
        this.drugNo = drugNo;
    }
    public String getDrugName() {
        return this.drugName;
    }
    
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
    public Integer getUnitPerDay() {
        return this.unitPerDay;
    }
    
    public void setUnitPerDay(Integer unitPerDay) {
        this.unitPerDay = unitPerDay;
    }
    public String getMethodOfAdmin() {
        return this.methodOfAdmin;
    }
    
    public void setMethodOfAdmin(String methodOfAdmin) {
        this.methodOfAdmin = methodOfAdmin;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getFinishDate() {
        return this.finishDate;
    }
    
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
    public Set getInPatients() {
        return this.inPatients;
    }
    
    public void setInPatients(Set inPatients) {
        this.inPatients = inPatients;
    }




}

