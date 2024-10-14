package org.bibliotheque.universite.model;

public class Matiere {

    private Integer idMatiere;

    private String nom;
    private float coef;

    private int nbrHeure;
    public Matiere() {
    }

    public Matiere(String nom, float coef, int nbrHeure) {
        this.nom = nom;
        this.coef = coef;
        this.nbrHeure = nbrHeure;
    }

    public Matiere(Integer idMatiere, String nom, float coef, int nbrHeure) {
        this.idMatiere = idMatiere;
        this.nom = nom;
        this.coef = coef;
        this.nbrHeure=nbrHeure;
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

    public int getNbrHeure() {
        return nbrHeure;
    }

    public void setNbrHeure(int nbrHeure) {
        this.nbrHeure = nbrHeure;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "idMatiere=" + idMatiere +
                ", nom='" + nom + '\'' +
                ", coef=" + coef +
                ", nombre de heure=" + nbrHeure +

                '}';
    }
}
