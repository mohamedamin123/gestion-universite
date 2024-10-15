package org.bibliotheque.universite.model;

public class Devoir {

    private Integer idDevoir;
    private float noteDS;
    private float noteExamen;



    public Devoir() {
    }

    public Devoir(float noteDS, float noteExamen) {
        this.noteDS = noteDS;
        this.noteExamen = noteExamen;
    }

    public Devoir(Integer idDevoir, float noteDS, float noteExamen) {
        this.idDevoir = idDevoir;
        this.noteDS = noteDS;
        this.noteExamen = noteExamen;
    }

    public Integer getIdDevoir() {
        return idDevoir;
    }

    public void setIdDevoir(Integer idDevoir) {
        this.idDevoir = idDevoir;
    }

    public float getNoteDS() {
        return noteDS;
    }

    public void setNoteDS(float noteDS) {
        this.noteDS = noteDS;
    }

    public float getNoteExamen() {
        return noteExamen;
    }

    public void setNoteExamen(float noteExamen) {
        this.noteExamen = noteExamen;
    }

    @Override
    public String toString() {
        return "Devoir{" +
                "idDevoir=" + idDevoir +
                ", noteDS='" + noteDS + '\'' +
                ", noteExamen=" + noteExamen +
                '}';
    }
}
