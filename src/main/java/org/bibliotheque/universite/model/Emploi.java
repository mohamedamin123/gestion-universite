package org.bibliotheque.universite.model;

import java.time.LocalTime;

public class Emploi {

    private Integer idEmploi;
    private String jour;
    private LocalTime timeDebut;
    private LocalTime timeFin;

    private Integer idSalle;
    private Integer idMatiere;

    private Salle salle;
    private Matiere matiere;


    public Emploi(Integer idEmploi, String jour, LocalTime timeDebut, LocalTime timeFin, Integer idSalle, Integer idMatiere) {
        this.idEmploi = idEmploi;
        this.jour = jour;
        this.timeDebut = timeDebut;
        this.timeFin = timeFin;
        this.idSalle = idSalle;
        this.idMatiere = idMatiere;
    }


    public Integer getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(Integer idSalle) {
        this.idSalle = idSalle;
    }

    public Integer getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Integer idMatiere) {
        this.idMatiere = idMatiere;
    }

    public Integer getIdEmploi() {
        return idEmploi;
    }

    public void setIdEmploi(Integer idEmploi) {
        this.idEmploi = idEmploi;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public LocalTime getTimeDebut() {
        return timeDebut;
    }

    public void setTimeDebut(LocalTime timeDebut) {
        this.timeDebut = timeDebut;
    }

    public LocalTime getTimeFin() {
        return timeFin;
    }

    public void setTimeFin(LocalTime timeFin) {
        this.timeFin = timeFin;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "Emploi{" +
                "idEmploi=" + idEmploi +
                ", jour='" + jour + '\'' +
                ", timeDebut=" + timeDebut +
                ", timeFin=" + timeFin +
                ", salle=" + salle.getNom() +
                ", matiere=" + matiere.getNom() +
                '}';
    }
}
