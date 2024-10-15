package org.bibliotheque.universite.controller.etudiant;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.bibliotheque.universite.utils.Fenetre;

public class ProfileController {

    @FXML
    private Button retour;
    @FXML
    private TextField nom;
    @FXML
    private Label nomError;
    @FXML
    private TextField prenom;
    @FXML
    private Label prenomError;
    @FXML
    private TextField email;
    @FXML
    private Label emailError;
    @FXML
    private TextField tel;
    @FXML
    private Label telError;
    @FXML
    private DatePicker dateDeNaissance;
    @FXML
    private Label dateDeNaissanceError;
    @FXML
    private Label specialiteL;
    @FXML
    private TextField specialite;
    @FXML
    private Label specialiteError;
    @FXML
    private Label classl;
    @FXML
    private TextField classs;
    @FXML
    private Label classError;


    @FXML
    private void initialize() {
        getData();
        retour.setOnAction(e->{
            Fenetre.loadHomeEtudiantScene(e,"homeEtudiant");
        });

    }
    public void getData() {

    }



}
