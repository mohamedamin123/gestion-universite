package org.bibliotheque.universite.model;

public class Matiere {

    private Integer idMatiere;

    private String nom;
    private float coef;

    public Matiere() {
    }

    public Matiere(Integer idMatiere, String nom, float coef) {
        this.idMatiere = idMatiere;
        this.nom = nom;
        this.coef = coef;
    }

    public Integer getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Integer idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getCoef() {
        return coef;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "idMatiere=" + idMatiere +
                ", nom='" + nom + '\'' +
                ", coef=" + coef +
                '}';
    }
}
