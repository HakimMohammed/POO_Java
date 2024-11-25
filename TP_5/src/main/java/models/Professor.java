package models;

import java.sql.Date;

public class Professor {
    private int id;
    private final String nom;
    private final String prenom;
    private final String cin;
    private final String adresse;
    private final String telephone;
    private final String email;
    private final java.sql.Date dateRecruitment;
    // Foreign Key
    private final Integer idDepartment;

    public Professor(String nom, String prenom, String cin, String adresse, String telephone, String email, Date dateRecruitment, Integer id_department) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.dateRecruitment = dateRecruitment;
        this.idDepartment = id_department;
    }

    public Professor(String nom, String prenom, String cin, String adresse, String telephone, String email, Date dateRecruitment) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.dateRecruitment = dateRecruitment;
        this.idDepartment = null;
    }

    public Professor(int id, String nom, String prenom, String cin, String adresse, String telephone, String email, Date dateRecruitment, Integer id_department) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.dateRecruitment = dateRecruitment;
        this.idDepartment = id_department;
    }

    public Professor(int id, String nom, String prenom, String cin, String adresse, String telephone, String email, Date dateRecruitment) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.dateRecruitment = dateRecruitment;
        this.idDepartment = null;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCin() {
        return cin;
    }

    public String getAdresse() {
        return adresse;
    }
    
    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public java.sql.Date getDateRecruitment() {
        return dateRecruitment;
    }

    public Integer getIdDepartment() {
        if( idDepartment == null){
            return 0;
        }
        return idDepartment;
    }
}


