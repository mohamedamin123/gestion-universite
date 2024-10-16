package org.bibliotheque.universite.controller.etudiant;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.bibliotheque.universite.model.Emploi;
import org.bibliotheque.universite.model.Matiere;
import org.bibliotheque.universite.model.Salle;
import org.bibliotheque.universite.utils.Fenetre;
import org.bibliotheque.universite.utils.TimetableEntry;

import java.time.LocalTime;

public class EmploiController {
    @FXML
    private TableView<Emploi> timetableTable;
    @FXML
    private TableColumn<Emploi, String> horaireColumn;
    @FXML
    private TableColumn<Emploi, String> lundiColumn;
    @FXML
    private TableColumn<Emploi, String> mardiColumn;
    @FXML
    private TableColumn<Emploi, String> mercrediColumn;
    @FXML
    private TableColumn<Emploi, String> jeudiColumn;
    @FXML
    private TableColumn<Emploi, String> vendrediColumn;
    @FXML
    private TableColumn<Emploi, String> samediColumn;
    @FXML
    private Button retour;
    private ObservableList<Emploi> emplois;


    @FXML
    public void initialize() {
        timetableTable.setFixedCellSize(60); // Ajustez cette valeur si nécessaire

        getData();

        horaireColumn.setCellValueFactory(cellData ->
                new SimpleObjectProperty<>(cellData.getValue().getTimeDebut()+" "+cellData.getValue().getTimeFin() )
        );
        lundiColumn.setCellValueFactory(cellData ->
                new SimpleObjectProperty<>("Math \n Salle A \n TP")
        );
        mardiColumn.setCellValueFactory(cellData ->
                new SimpleObjectProperty<>("Phys \n Salle A \n TP")
        );
        mercrediColumn.setCellValueFactory(cellData ->
                new SimpleObjectProperty<>("anglais \n Salle A \n TP")
        );
        jeudiColumn.setCellValueFactory(cellData ->
                new SimpleObjectProperty<>("francais \n Salle A \n TP")
        );
        vendrediColumn.setCellValueFactory(cellData ->
                new SimpleObjectProperty<>("Informatique \n Salle A \n TP")
        );


        timetableTable.setItems(emplois);

        retour.setOnAction(e -> {
            Fenetre.loadHomeEtudiantScene(e, "homeEtudiant");
        });
    }

    private void getData() {
        emplois = FXCollections.observableArrayList(
                new Emploi(1, "Lundi", LocalTime.of(8, 30), LocalTime.of(10, 0),5, 3),
                new Emploi(3, "Mardi", LocalTime.of(10, 15), LocalTime.of(11, 45),2,1),
                new Emploi(2, "Mercredi", LocalTime.of(12, 0), LocalTime.of(13, 30), 9,8),
                new Emploi(4, "Jeudi", LocalTime.of(13, 45), LocalTime.of(15, 15),7,1),
                new Emploi(5, "Vendredi", LocalTime.of(15, 30), LocalTime.of(17, 0),7,1)
        );

    }
}
