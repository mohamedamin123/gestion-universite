package org.bibliotheque.universite.utils;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TimetableEntry {
    private final StringProperty horaire;
    private final StringProperty lundi; // Contient matière et salle pour Lundi
    private final StringProperty mardi; // Contient matière et salle pour Mardi
    private final StringProperty mercredi; // Contient matière et salle pour Mercredi
    private final StringProperty jeudi; // Contient matière et salle pour Jeudi
    private final StringProperty vendredi; // Contient matière et salle pour Vendredi
    private final StringProperty samedi; // Contient matière et salle pour Samedi

    public TimetableEntry(String horaire, String lundi, String mardi, String mercredi, String jeudi, String vendredi, String samedi) {
        this.horaire = new SimpleStringProperty(horaire);
        this.lundi = new SimpleStringProperty(lundi); // Exemple : "Mathématiques, Salle A"
        this.mardi = new SimpleStringProperty(mardi); // Exemple : "Physique, Salle B"
        this.mercredi = new SimpleStringProperty(mercredi);
        this.jeudi = new SimpleStringProperty(jeudi);
        this.vendredi = new SimpleStringProperty(vendredi);
        this.samedi = new SimpleStringProperty(samedi);
    }

    public StringProperty horaireProperty() {
        return horaire;
    }

    public StringProperty lundiProperty() {
        return lundi; // Getter pour Lundi
    }

    public StringProperty mardiProperty() {
        return mardi; // Getter pour Mardi
    }

    public StringProperty mercrediProperty() {
        return mercredi; // Getter pour Mercredi
    }

    public StringProperty jeudiProperty() {
        return jeudi; // Getter pour Jeudi
    }

    public StringProperty vendrediProperty() {
        return vendredi; // Getter pour Vendredi
    }

    public StringProperty samediProperty() {
        return samedi; // Getter pour Samedi
    }
}
