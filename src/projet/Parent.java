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
public class Parent {
    private int idParent;
    private String nomPere; 
    private String prenomPere;
    private String dateDeNaissancePere;
    private String lieuDeNaissancePere;
    private String proffessionPere;
    private String nomMere;
    private String prenomMere;
    private String dateDeNaissanceMere;
    private String lieuDeNaissanceMere;
    private String proffessionMere;
    private String residence;


public Parent(int idParent,String nomP,String prenomP,String dateP,String lieuP,String proffP
              ,String nomM,String prenomM,String dateM,String lieuM,String proffM,String resi)
{
  this.idParent=idParent;  
  nomPere = nomP;
  prenomPere = prenomP;
  dateDeNaissancePere = dateP;
  lieuDeNaissancePere = lieuP;
  proffessionPere = proffP;
  nomMere = nomM;
  prenomMere = prenomM;
  dateDeNaissanceMere = dateM;
  lieuDeNaissanceMere = lieuM;
  proffessionMere = proffM;
  residence = resi;
}
public int getIdParent()               {return this.idParent;}
public String getNomPere()             { return nomPere;}
public String getPrenomPere()          { return prenomPere;}
public String getDateDeNaissancePere() { return dateDeNaissancePere;} 
public String getLieuDeNaissancePere() { return lieuDeNaissancePere;}
public String getProffessionPere()     { return proffessionPere;}
public String getNomMere()             { return nomMere;}
public String getPrenomMere()          { return prenomMere;}
public String getDateDeNaisanceMere()  { return dateDeNaissanceMere;}
public String getLieuDeNaissanceMere() { return lieuDeNaissanceMere;}
public String getProffessionMere()     { return proffessionMere;}
public String getResidence()           { return residence;}

public void setIdParent(int m)     {this.idParent=m;}
public void setNomPere(String nmP) {nomPere = nmP;}
public void setPrenomPere(String pmP) {prenomPere = pmP;}
public void setDateDeNaissancePere(String dtP) {dateDeNaissancePere = dtP;}
public void setLieuDeNaissancePere(String ldP) {lieuDeNaissancePere = ldP;}
public void setProffessionPere(String prP) {proffessionPere = prP;}
public void setgetNomMere(String nmM) {nomMere = nmM;}
public void setPrenomMere(String pmM) {prenomMere = pmM;}
public void setDateDeNaisanceMere(String dtM) {dateDeNaissanceMere = dtM;}
public void setLieuDeNaissanceMere(String ldM) {lieuDeNaissanceMere = ldM;}
public void setProffessionMere(String prM) {proffessionMere = prM;}
public void setResidence(String rs) {residence = rs;}

public static void sauverInformationParent(Parent p)
{
      try 
      {  
       String url    = "jdbc:mysql://localhost/mlr1";
       String user   = "root";
       String passwd = "";
       Connection log = DriverManager.getConnection(url,user,passwd);
       Statement st = log.createStatement();
       String SqlInsert="insert into parent(ID_PARENT,NOM_PERE,PRENOM_PERE,DATE_NAISSANCE_PERE,LIEU_NAISSANCE_PERE,PROFESSION_PERE,"
       + "NOM_MERE,PRENOM_MERE,DATE_NAISSANCE_MERE,LIEU_NAISSANCE_MERE,PROFESSION_MERE,RESIDENCE)values("+p.getIdParent()
       +",'"+p.getNomPere()+"','"+p.getPrenomPere()+"','"+p.getDateDeNaissancePere()+"','"+p.getLieuDeNaissancePere()+"','"+p.getProffessionPere()
       +"','"+p.getNomMere()+"','"+p.getPrenomMere()+"','"+p.getDateDeNaisanceMere()+"','"+p.getLieuDeNaissanceMere()+"','"+p.getProffessionMere()+"'"
       + ",'"+p.getResidence()+"')";
       st.executeUpdate(SqlInsert);
      }catch(SQLException e){e.printStackTrace();}   
}

}
