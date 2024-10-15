package org.bibliotheque.universite.controller.etudiant;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
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

        // Set the custom cell factory for displaying Matiere data
        matiereListView.setCellFactory(listView -> new MatiereListCell());

        retour.setOnAction(e -> {
            Fenetre.loadHomeEtudiantScene(e, "homeEtudiant");
        });
    }
}
