package projetpfa;


import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.image.BufferedImage;
import java.util.Date;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Eleve {
    
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String sexe;
    private String d;
    private String LieuDeNaissance;
    private String adresse;
    private int codePostal;
    private String niveau;
    private String classeele ;


        
    private String nomRes;
    private String prenomRes;
    private String professionRes;
    private String situationFamilaileRes;
    private int telephoneRes;
    private String emailRes;
    private int cinRes;
    
    Connexion con = new Connexion("root","root");

    public Eleve(int id, String nom, String prenom, int age, String sexe, String d, String LieuDeNaissance, String adresse, int codePostal, String niveau, String classeele, String nomRes, String prenomRes, String professionRes, String situationFamilaileRes, int telephoneRes, String emailRes, int cinRes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.d = d;
        this.LieuDeNaissance = LieuDeNaissance;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.niveau = niveau;
        this.classeele = classeele;
        this.nomRes = nomRes;
        this.prenomRes = prenomRes;
        this.professionRes = professionRes;
        this.situationFamilaileRes = situationFamilaileRes;
        this.telephoneRes = telephoneRes;
        this.emailRes = emailRes;
        this.cinRes = cinRes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getLieuDeNaissance() {
        return LieuDeNaissance;
    }

    public void setLieuDeNaissance(String LieuDeNaissance) {
        this.LieuDeNaissance = LieuDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getclasseele() {
        return classeele;
    }

    public void setclasseele(String classeele) {
        this.classeele= classeele;
    }

    public String getNomRes() {
        return nomRes;
    }

    public void setNomRes(String nomRes) {
        this.nomRes = nomRes;
    }

    public String getPrenomRes() {
        return prenomRes;
    }

    public void setPrenomRes(String prenomRes) {
        this.prenomRes = prenomRes;
    }

    public String getProfessionRes() {
        return professionRes;
    }

    public void setProfessionRes(String professionRes) {
        this.professionRes = professionRes;
    }

    public String getSituationFamilaileRes() {
        return situationFamilaileRes;
    }

    public void setSituationFamilaileRes(String situationFamilaileRes) {
        this.situationFamilaileRes = situationFamilaileRes;
    }

    public int getTelephoneRes() {
        return telephoneRes;
    }

    public void setTelephoneRes(int telephoneRes) {
        this.telephoneRes = telephoneRes;
    }

    public String getEmailRes() {
        return emailRes;
    }

    public void setEmailRes(String emailRes) {
        this.emailRes = emailRes;
    }

    public int getCinRes() {
        return cinRes;
    }

    public void setCinRes(int cinRes) {
        this.cinRes = cinRes;
    }
    
    //constructeur pour la creation de nouvelle objet pour l'appel de supression ,d'affichage et recherche
    public Eleve() {
    }
    
    //Procedure qui permet d'ajouter un Eleve
    public void Ajouter_Eleve()
    {
        String rqt="insert into eleve values('"+getNom()+"','"+getPrenom()+"',"+getAge()+",'"+getSexe()+"','"+getD()+"','"+getLieuDeNaissance()+"','"+getAdresse()+"','"+getCodePostal()+"','"+getNiveau()+"','"+getclasseele()+"',"+1+",'"+getNomRes()+"','"+getPrenom()+"','"+getProfessionRes()+"','"+getSituationFamilaileRes()+"',"+getTelephoneRes()+",'"+getEmailRes()+"',"+getCinRes()+")"; // requette pour saisir les donneés d'eleve
        try {
                con.getstm().executeQuery(rqt);
            
            JOptionPane.showMessageDialog(null, "Eleve a été ajouter avec succé !");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
    
    //Procedure qui permet de modifier un Eleve
    public void Modifier_Eleve(int id ,String nom , String prenom, String age, boolean sexe,String datenais ,String lieunais , String adresse , String codepostal , String niveau ,String classe , String cin , String nomresp , String prenomresp , String travail , String numtlf , String etatcivile)
    {
        String rqt="update eleve set nom ='"+getNom()+"',prenom='"+getPrenom()+"',age="+getAge()+",sexe='"+getSexe()+"',datenais='"+getD()+"',lieunais='"+getLieuDeNaissance()+"',adresse='"+getAdresse()+"',codepostal="+getCodePostal()+",niveau= '"+getNiveau()+"',classe='"+getclasseele()+"',cin="+getCinRes()+",nomresp='"+getNomRes()+"',prenomresp='"+getPrenom()+"',travail='"+getProfessionRes()+"',numtlf="+getTelephoneRes()+",etatcivile= '"+getSituationFamilaileRes()+"'where id="+id+"";
        
      try {
            con.getstm().executeQuery(rqt);
            con.getstm().close(); 
            JOptionPane.showMessageDialog(null, "Eleve a été Modifier avec succé !");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    
    }
    
    //Procedure qui permet de rechercher un Eleve 
    public void Rechercher_Eleve(int id, String nom , String prenom , String classe , String niveau ){
    
        
    
    
    }

    
    //Procedure qui permet d'afficher les eleve
    public static Eleve[] Afficher_Eleve(Eleve[] TabEleve){
        Connexion con=new Connexion("root","root");
        ResultSet rs;
        String rqt ="select * from eleve";
        int i=0;
       
       
        try {
            rs = con.getstm().executeQuery(rqt);
            while (rs.next()){
                i++; //pour calculer la taille de la table d'eleve
            }

            TabEleve = new Eleve[i];
            while (rs.next()){
                i++;
                TabEleve[i]=new Eleve(rs.getInt("id"),rs.getString("NOM"),rs.getString("PRENOM"),rs.getInt("age"),rs.getString("sexe"),rs.getString("datenais"),rs.getString("lieunais"),rs.getString("adresse"),rs.getInt("CODEPOSTAL"),rs.getString("NIVEAU"),rs.getString("classe"),rs.getString("NOMRESP"),rs.getString("PRENOMRESP"),rs.getString("PROFESSIONRESP"),rs.getString("SITUATIONFAMILAILERES"),rs.getInt("TELEPHONERES"),rs.getString("EMAILRES"),rs.getInt("CINRESP"));

            }
            con.getstm().close();
            //rs.close(); // pour fermer la requette 
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
       return TabEleve ;
    
    }
    
    //Procedure qui permet de Supprimer un eleve
    public void SupprimerEleve(String id){
        int id_eleve=Integer.parseInt(id);
        String rqt="delete from eleve where id="+id_eleve+"";
        int rep=JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer cette Elève", "Supprimer Elève", JOptionPane.YES_NO_OPTION);
        
        if(rep==0)
        {
            try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            JOptionPane.showMessageDialog(null, "élève a été supprimer avec succé !");
            
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } 
       
    }
    
    public ResultSet ConsulterEleve(String id){
        int id_eleve=Integer.parseInt(id);
        String rqt = "select * from eleve where id="+id_eleve+"";   
        ResultSet rs=null;
        try {
            rs=con.getstm().executeQuery(rqt);
            con.getstm().close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
         return rs;
        
    }
   
}
