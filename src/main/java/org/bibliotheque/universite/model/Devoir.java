package org.bibliotheque.universite.model;

public class Devoir {

    private Integer idDevoir;
    private String titre;
    private float note;


    public Devoir() {
    }


    public Devoir(String titre, float note) {
        this.titre = titre;
        this.note = note;
    }

    public Devoir(Integer idDevoir, String titre, float note) {
        this.idDevoir = idDevoir;
        this.titre = titre;
        this.note = note;
    }

    public Integer getIdDevoir() {
        return idDevoir;
    }

    public void setIdDevoir(Integer idDevoir) {
        this.idDevoir = idDevoir;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Devoir{" +
                "idDevoir=" + idDevoir +
                ", titre='" + titre + '\'' +
                ", note=" + note +
                '}';
    }
}
