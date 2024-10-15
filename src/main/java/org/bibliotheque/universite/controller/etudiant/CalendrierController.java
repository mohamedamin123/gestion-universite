package org.bibliotheque.universite.controller.etudiant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.bibliotheque.universite.utils.Fenetre;
import org.bibliotheque.universite.utils.TimetableEntry;

public class CalendrierController {

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
                new TimetableEntry("08:30 - 10:00", "Mathématiques\n Salle A", "Physique\n Salle B\n TP", "", "", "", ""),
                new TimetableEntry("10:15 - 11:45", "", "", "Chimie\n Salle H", "", "", ""),
                new TimetableEntry("12:00 - 13:30", "", "", "", "Anglais\n Salle I", "", ""),
                new TimetableEntry("13:45 - 15:15", "", "", "", "", "", ""),
                new TimetableEntry("15:15 - 17:00", "", "", "", "", "", "")
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
