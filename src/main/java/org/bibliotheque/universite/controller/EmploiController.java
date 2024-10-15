package org.bibliotheque.universite.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.bibliotheque.universite.utils.Fenetre;
import org.bibliotheque.universite.utils.TimetableEntry;

public class EmploiController {
    @FXML
    private TableView<TimetableEntry> timetableTable;
    @FXML
    private TableColumn<TimetableEntry, String> horaireColumn;
    @FXML
    private TableColumn<TimetableEntry, String> lundiColumn;
    @FXML
    private TableColumn<TimetableEntry, String> mardiColumn;
    @FXML
    private TableColumn<TimetableEntry, String> mercrediColumn;
    @FXML
    private TableColumn<TimetableEntry, String> jeudiColumn;
    @FXML
    private TableColumn<TimetableEntry, String> vendrediColumn;
    @FXML
    private TableColumn<TimetableEntry, String> samediColumn;
    @FXML
    private Button retour;
    @FXML
    private TableColumn<TimetableEntry, String> sujetSalleColumn; // New column for sujet and salle
    private ObservableList<TimetableEntry> timetableEntries;

    @FXML
    public void initialize() {
        timetableTable.setFixedCellSize(60); // Ajustez cette valeur si nécessaire

        timetableEntries = FXCollections.observableArrayList(
                new TimetableEntry("08:30 - 10:00", "Mathématiques\n Salle A", "Physique\n Salle B", "Chimie\n Salle C", "Informatique\n Salle D", "Économie\n Salle E", ""),
                new TimetableEntry("10:15 - 11:45", "Histoire\n Salle F", "Mathématiques\n Salle G", "Chimie\n Salle H", "Anglais\n Salle I", "Informatique\n Salle J", ""),
                new TimetableEntry("12:00 - 13:30", "", "", "", "", "", ""),
                new TimetableEntry("13:45 - 15:15", "Informatique\n Salle K", "Économie\n Salle L", "Histoire\n Salle M", "Mathématiques\n Salle N", "Chimie\n Salle O", ""),
                new TimetableEntry("15:15 - 17:00", "Anglais\n Salle P", "Chimie\n Salle Q", "Mathématiques\n Salle R", "Informatique\n Salle S", "", "")
        );

        horaireColumn.setCellValueFactory(cellData -> cellData.getValue().horaireProperty());
        lundiColumn.setCellValueFactory(cellData -> cellData.getValue().lundiProperty());
        mardiColumn.setCellValueFactory(cellData -> cellData.getValue().mardiProperty());
        mercrediColumn.setCellValueFactory(cellData -> cellData.getValue().mercrediProperty());
        jeudiColumn.setCellValueFactory(cellData -> cellData.getValue().jeudiProperty());
        vendrediColumn.setCellValueFactory(cellData -> cellData.getValue().vendrediProperty());
        samediColumn.setCellValueFactory(cellData -> cellData.getValue().samediProperty());

        timetableTable.setItems(timetableEntries);

        retour.setOnAction(e -> {
            Fenetre.loadHomeEtudiantScene(e, "homeEtudiant");
        });
    }
}
