package hospital;
// Generated Feb 23, 2016 10:54:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Ward generated by hbm2java
 */
public class Ward  implements java.io.Serializable {


     private String wardNo;
     private Integer totalNoBeds;
     private Integer telExtNo;
     private Integer patientBedNo;
     private String inPatient;
     private Set inPatients = new HashSet(0);
     private Set wardRequisitions = new HashSet(0);
    public String getWardTotalNoBeds;
    public String getWardInPatient;

    public Ward() {
    }

	
    public Ward(String wardNo) {
        this.wardNo = wardNo;
    }
    public Ward(String wardNo, Integer totalNoBeds, Integer telExtNo, Integer patientBedNo, String inPatient, Set inPatients, Set wardRequisitions) {
       this.wardNo = wardNo;
       this.totalNoBeds = totalNoBeds;
       this.telExtNo = telExtNo;
       this.patientBedNo = patientBedNo;
       this.inPatient = inPatient;
       this.inPatients = inPatients;
       this.wardRequisitions = wardRequisitions;
    }
   
    public String getWardNo() {
        return this.wardNo;
    }
    
    public void setWardNo(String wardNo) {
        this.wardNo = wardNo;
    }
    public Integer getTotalNoBeds() {
        return this.totalNoBeds;
    }
    
    public void setTotalNoBeds(Integer totalNoBeds) {
        this.totalNoBeds = totalNoBeds;
    }
    public Integer getTelExtNo() {
        return this.telExtNo;
    }
    
    public void setTelExtNo(Integer telExtNo) {
        this.telExtNo = telExtNo;
    }
    public Integer getPatientBedNo() {
        return this.patientBedNo;
    }
    
    public void setPatientBedNo(Integer patientBedNo) {
        this.patientBedNo = patientBedNo;
    }
    public String getInPatient() {
        return this.inPatient;
    }
    
    public void setInPatient(String inPatient) {
        this.inPatient = inPatient;
    }
    public Set getInPatients() {
        return this.inPatients;
    }
    
    public void setInPatients(Set inPatients) {
        this.inPatients = inPatients;
    }
    public Set getWardRequisitions() {
        return this.wardRequisitions;
    }
    
    public void setWardRequisitions(Set wardRequisitions) {
        this.wardRequisitions = wardRequisitions;
    }

}


