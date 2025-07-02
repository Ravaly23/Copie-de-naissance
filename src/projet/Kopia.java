/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;
import java.sql.*;
/**
 *
 * @author valy
 */
public class Kopia {
    private int ref,idEnfant;
    private String dateDeCreation;
    private String heureDeCreation;
    private String situationDeCreation;
    private String lieuDeCreation;
    private String responsable;
    
    public Kopia(int ref,int idEnfant,String date,String heure,String situation,String lieu,String responsable)
    {
      this.ref=ref;
      this.idEnfant=idEnfant;
      dateDeCreation =  date;
      heureDeCreation = heure;
      situationDeCreation = situation;
      lieuDeCreation = lieu;
      this.responsable = responsable;
    }
    public int getRef()                    {return this.ref;}
    public int getIdEnfant()                    {return this.idEnfant;}
    public String getDateDeCreation()      { return dateDeCreation;}
    public String getHeureDeCreation()     { return heureDeCreation;}
    public String getSituationDeCreation() { return situationDeCreation;}
    public String getLieuDeCreation()      { return lieuDeCreation;}
    public String getResponsable()         { return this.responsable;}
    
    public void setRef(int n)                {this.ref=n;}
    public void setIdEnfant(int m)                {this.idEnfant=m;}
    public void setDateDeCreation(String dt) { dateDeCreation = dt;}
    public void setHeureDeCreation(String hr) { heureDeCreation = hr;}
    public void setSituationDeCreation(String st) { situationDeCreation = st;}
    public void setLieuDeCreation(String ld) { lieuDeCreation = ld;}
    public void setResponsable(String rp) {responsable = rp;}
    
    public static void sauverInformationKopia(Kopia k)
    {
      try 
      {  
       String url    = "jdbc:mysql://localhost/mlr1";
       String user   = "root";
       String passwd = "";
       Connection log = DriverManager.getConnection(url,user,passwd);
       Statement st = log.createStatement();
       String SqlInsert="insert into kopia(REF,ID_ENFANT,DATE_CREATION,HEURE_CREATION,SITUATION_CREATION,LIEU_CREATION,RESPONSABLE)values("+k.getRef()+","+k.getIdEnfant()
               +",'"+k.getDateDeCreation()+"','"+k.getHeureDeCreation()+"','"+k.getSituationDeCreation()+"','"+k.getLieuDeCreation()+"','"
               +k.getResponsable()+"')";
       st.executeUpdate(SqlInsert);
      }catch(SQLException e){e.printStackTrace();}  
    }     
}
