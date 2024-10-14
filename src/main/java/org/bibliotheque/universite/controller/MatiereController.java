package org.bibliotheque.universite.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import org.bibliotheque.universite.model.Matiere;
import org.bibliotheque.universite.utils.Fenetre;

import java.util.Arrays;
import java.util.List;

public class MatiereController {
    @FXML
    private Button retour;
    @FXML
    private ListView<Matiere> matiereListView;

    @FXML
    public void initialize() {
        // Example list of Matiere objects
        List<Matiere> matieres = Arrays.asList(
                new Matiere(1, "Mathematics", 4.5f, 40),
                new Matiere(2, "Physics", 3.0f, 30),
                new Matiere(3, "Chemistry", 3.5f, 35),
                new Matiere(4, "Biology", 2.5f, 25)
        );

        // Set the items in the ListView
        matiereListView.getItems().addAll(matieres);

        // Customize the cell factory to display Matiere data
        matiereListView.setCellFactory(new Callback<>() {
            @Override
            public ListCell<Matiere> call(ListView<Matiere> listView) {
                return new ListCell<>() {
                    @Override
                    protected void updateItem(Matiere matiere, boolean empty) {
                        super.updateItem(matiere, empty);
                        if (empty || matiere == null) {
                            setText(null);
                        } else {
                            setText("Nom: " + matiere.getNom() + " | Coef: " + matiere.getCoef() + " | Nbr Heure: " + matiere.getNbrHeure());
                        }
                        getStyleClass().add("list-cell");  // Add CSS class for styling
                    }
                };
            }
        });

        retour.setOnAction(e->{
            Fenetre.loadHomeEtudiantScene(e, "homeEtudiant");
        });
    }
}