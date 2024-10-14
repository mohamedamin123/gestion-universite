package org.bibliotheque.universite.model;

public class Parcour {

    private Integer idParcour;
    private String nom;


    public Parcour() {
    }

    public Parcour(String nom) {
        this.nom = nom;
    }

    public Parcour(Integer idParcour, String nom) {
        this.idParcour = idParcour;
        this.nom = nom;
    }

    public Integer getIdParcour() {
        return idParcour;
    }

    public void setIdParcour(Integer idParcour) {
        this.idParcour = idParcour;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Parcour{" +
                "idParcour=" + idParcour +
                ", nom='" + nom + '\'' +
                '}';
    }
}
