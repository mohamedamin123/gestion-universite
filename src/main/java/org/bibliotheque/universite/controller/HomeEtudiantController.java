package org.bibliotheque.universite.controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import org.bibliotheque.universite.utils.Fenetre;

public class HomeEtudiantController {

    @FXML
    private Label name;
    @FXML
    private ImageView emploi;
    @FXML
    private ImageView cours;
    @FXML
    private ImageView profile;
    @FXML
    private ImageView note;
    @FXML
    private ImageView calendrier;
    @FXML
    private ImageView deconnecter;


    @FXML
    private void initialize() {
        getName();

        emploi.setOnMouseClicked(e->{
            System.out.println("emploi");
            Fenetre.loadHomeEtudiantScene(e,"emploi");

        });

        cours.setOnMouseClicked(e->{
            System.out.println("cours");
            Fenetre.loadHomeEtudiantScene(e,"matiere");
        });

        profile.setOnMouseClicked(e->{
            System.out.println("profile");
            Fenetre.loadHomeEtudiantScene(e,"profile");
        });

        calendrier.setOnMouseClicked(e->{
            System.out.println("calendrier");
        });
        note.setOnMouseClicked(e->{
            System.out.println("note");
        });
        deconnecter.setOnMouseClicked(e->{
            System.exit(0);
        });
    }





    private void getName() {
    name.setText("Mohamed Amin Gana");
    }


}
