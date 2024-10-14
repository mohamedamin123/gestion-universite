package org.bibliotheque.universite.model;

import org.bibliotheque.universite.utils.Role;

import java.time.LocalDate;

public class Etudiant extends User{

    private Integer idEtudiant;

    private LocalDate dateDeNaissance;
    private String niveau;

    public Etudiant(String nom, String prenom, String tel, String email, String password, Role role, LocalDate dateDeNaissance, String niveau) {
        super(nom, prenom, tel, email, password, role);
        this.dateDeNaissance = dateDeNaissance;
        this.niveau = niveau;
    }

    public Etudiant(String nom, String prenom, String tel, String email, String password, Role role, Integer idEtudiant, LocalDate dateDeNaissance, String niveau) {
        super(nom, prenom, tel, email, password, role);
        this.idEtudiant = idEtudiant;
        this.dateDeNaissance = dateDeNaissance;
        this.niveau = niveau;
    }

    public Integer getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return super.toString()+
                "idEtudiant= "+idEtudiant+
                "dateDeNaissance=" + dateDeNaissance +
                ", niveau='" + niveau + '\'';
    }
}
