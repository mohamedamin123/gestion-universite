package org.bibliotheque.universite.model;

public class Salle {

    private Integer idSalle;

    private String nom;
    private int capacite;

    public Salle() {
    }

    public Salle(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
    }

    public Salle(Integer idSalle, String nom, int capacite) {
        this.idSalle = idSalle;
        this.nom = nom;
        this.capacite = capacite;
    }

    public Integer getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(Integer idSalle) {
        this.idSalle = idSalle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Salle{" +
                "idSalle=" + idSalle +
                ", nom='" + nom + '\'' +
                ", capacite=" + capacite +
                '}';
    }
}
