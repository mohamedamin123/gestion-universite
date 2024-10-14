package org.bibliotheque.universite.model;

import org.bibliotheque.universite.utils.Role;

public class Enseignent extends User{
    private Integer idEnseignant;
    private String specialite;

    public Enseignent(String nom, String prenom, String tel, String email, String password, Role role, String specialite) {
        super(nom, prenom, tel, email, password, role);
        this.specialite = specialite;
    }

    public Enseignent(String nom, String prenom, String tel, String email, String password, Role role, Integer idEnseignant, String specialite) {
        super(nom, prenom, tel, email, password, role);
        this.idEnseignant = idEnseignant;
        this.specialite = specialite;
    }

    public Integer getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(Integer idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }



    @Override
    public String toString() {
        return
                super.toString()+
                        "idEnseignant= "+idEnseignant+

                        "specialite='" + specialite + '\'' ;

    }
}
