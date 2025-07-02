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
public class Enfant {
    private int idEnfant,idParent;
     private String nomEnfant;
    private String prenomEnfant;
    private String dateDeNaissance;
    private String heureDeNaissance;
    private String situationDeNaissance;
    private String district;
    private String sexe;
    private String lieuDeNaissance;
    
    public Enfant(int idEnfant,int idParent,String nom,String prenom,String date,String heure,String situation
                  ,String district,String sexe,String lieu)
    {
        this.idEnfant=idEnfant;
        this.idParent=idParent;
        nomEnfant = nom;
        prenomEnfant = prenom ;
        dateDeNaissance = date;
        heureDeNaissance = heure;
        situationDeNaissance = situation;
        this.district = district;
        this.sexe = sexe;
        lieuDeNaissance = lieu;
    }
    public int getIdEnfant()               {return this.idEnfant;}
    public int getIdParent()               {return this.idParent;}
    public String getNomEnfant()            { return nomEnfant;};
    public String getPrenomEnfant()         { return prenomEnfant;};
    public String getDateDeNaissance()      { return dateDeNaissance;}
    public String getHeureDeNaissance()     { return heureDeNaissance;} 
    public String getSituationDeNaissance() { return situationDeNaissance;}
    public String getDistrict()             { return this.district; }
    public String getSexe()                 { return sexe;}
    public String getLieuDeNaissance()      { return lieuDeNaissance;}
    
    public void setIdEnfant(int n)       {this.idEnfant=n;}
    public void setIdParent(int m)       {this.idParent=m;}
    public void setNomEnfant(String nm)            {nomEnfant = nm;}
    public void setPrenomEnfant(String pm)         {prenomEnfant = pm;} 
    public void setDateDeNaissance(String dt)      {dateDeNaissance = dt;}
    public void setHeureDeNaissance(String hr)     {heureDeNaissance = hr;}
    public void setSituationDeNaissance(String st) {situationDeNaissance = st;}
    public void setDistrict(String ds)             {this.district = ds;}
    public void setSexe(String sx)                 {this.sexe = sx;}
    public void setLieuDeNaissance(String ln)      {lieuDeNaissance = ln;}
    
    public static void sauverInformationEnfant(Enfant d)
    {
      try 
      {  
       String url    = "jdbc:mysql://localhost/mlr1";
       String user   = "root";
       String passwd = "";
       Connection log = DriverManager.getConnection(url,user,passwd);
       Statement st = log.createStatement();
       String SqlInsert="insert into enfant(ID_ENFANT,ID_PARENT,NOM,PRENOM,DATE_NAISSANCE,HEURE_NAISSANCE,SITUATION_NAISSANCE,DISTRICT,SEXE,LIEU_NAISSANCE)values("+d.getIdEnfant()+","+d.getIdParent()+",'"+d.getNomEnfant()+"','"+d.getPrenomEnfant()+"','"+d.getDateDeNaissance()+"','"+d.getHeureDeNaissance()+"','"+d.getSituationDeNaissance()+"','"+d.getDistrict()+"','"+d.getSexe()+"','"+d.getLieuDeNaissance()+"')";
       st.executeUpdate(SqlInsert);
      }catch(SQLException e){e.printStackTrace();}
    }
            
    
}
