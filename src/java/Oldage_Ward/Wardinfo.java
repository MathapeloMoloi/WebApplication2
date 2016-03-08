
package Oldage_Ward;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hospital.Ward;

public class Wardinfo {
     private static SessionFactory factory;
     public static void wardInformation(String wardNo,int totalNoBeds,int telExtNo,int patientBedNo,String inPatient){
     try{
          Configuration conf =new Configuration().configure();   
          factory = new Configuration().configure().buildSessionFactory();
          Session session=factory.openSession();
          Transaction trans=session.beginTransaction();
          Ward wd =new Ward();
          wd.setWardNo(wardNo);
          wd.setTotalNoBeds(totalNoBeds);
          wd.setTelExtNo(telExtNo);
          wd.setPatientBedNo(patientBedNo);
          wd.setInPatient(inPatient);
          session.save(wd);
          trans.commit();
          System.out.println("Ward"+ wd.getWardNo()+"Ward Total No Beds"+ wd.getTotalNoBeds()+"Ward contact" + wd.getTelExtNo()+"Ward Patient Bed Nomber" + wd.getPatientBedNo()+"Patient name"+ wd.getWardInPatient);
    }catch(Exception e){
        e.printStackTrace();
    } finally{
  }
 }
public static void main(String[]args){
        Wardinfo p =new Wardinfo();
        p.wardInformation("8",7,016,851,"VAN DY loyde");
    }  
}

