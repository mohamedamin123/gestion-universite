package org.bibliotheque.universite.model;

import org.bibliotheque.universite.utils.TypeSeance;

import java.time.LocalDate;
import java.time.LocalTime;

public class Seance {

    private Integer idSeance;

    private TypeSeance typeSeance;

    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public Seance() {
    }

    public Seance(TypeSeance typeSeance, LocalDate date, LocalTime heureDebut, LocalTime heureFin) {
        this.typeSeance = typeSeance;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public Seance(Integer idSeance, TypeSeance typeSeance, LocalDate date, LocalTime heureDebut, LocalTime heureFin) {
        this.idSeance = idSeance;
        this.typeSeance = typeSeance;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public Integer getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(Integer idSeance) {
        this.idSeance = idSeance;
    }

    public TypeSeance getTypeSeance() {
        return typeSeance;
    }

    public void setTypeSeance(TypeSeance typeSeance) {
        this.typeSeance = typeSeance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "idSeance=" + idSeance +
                ", typeSeance=" + typeSeance +
                ", date=" + date +
                ", heureDebut=" + heureDebut +
                ", heureFin=" + heureFin +
                '}';
    }
}
