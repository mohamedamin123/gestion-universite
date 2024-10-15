package org.bibliotheque.universite.controller.etudiant;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import org.bibliotheque.universite.model.Devoir;
import org.bibliotheque.universite.utils.Fenetre;

import java.util.Arrays;
import java.util.List;

public class NoteController {

    @FXML
    private Button retour;

    @FXML
    private ListView<Devoir> matiereListView;

    @FXML
    public void initialize() {
        // Example list of Matiere objects
        List<Devoir> devoirs = Arrays.asList(
                new Devoir(1,15f,17f ),
                new Devoir(2,10f,15f ),
                new Devoir(3,4f,12f),
                new Devoir(4,20f,15f )
        );

        // Set the items in the ListView
        matiereListView.getItems().addAll(devoirs);

        // Set the custom cell factory for displaying Matiere data
        matiereListView.setCellFactory(listView -> new NoteListCell());

        retour.setOnAction(e -> {
            Fenetre.loadHomeEtudiantScene(e, "homeEtudiant");
        });
    }
}
