package org.bibliotheque.universite.controller.etudiant;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import org.bibliotheque.universite.utils.Fenetre;
import org.bibliotheque.universite.utils.Role;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField emailConnecter;
    @FXML
    private PasswordField passwordConnecter;
    @FXML
    private Button myButton;
    @FXML
    private Label loginErreur;

    private Role role;

    @FXML
    private void connecter(ActionEvent event) {
        String email = emailConnecter.getText().trim();
        String password = passwordConnecter.getText().trim();

        if (email.isEmpty() || password.isEmpty()) {
            loginErreur.setText("Email et mot de passe ne doivent pas être vides!");
            loginErreur.setVisible(true);
        } else {
            if (validateLogin(email, password)) {
                loginErreur.setVisible(false);
                if(role.equals(Role.ETUDIANT)) {
                    Fenetre.loadHomeEtudiantScene(event,"homeEtudiant");
                } else if(role.equals(Role.ENSEIGNANT   )) {
                    Fenetre.loadHomeEtudiantScene(event,"homeEnseignant");
                } else if(role.equals(Role.ADMIN   )) {
                    Fenetre.loadHomeEtudiantScene(event,"homeAdmin");
                }
            } else {
                loginErreur.setText("Votre email ou mot de passe est incorrect!!");
                loginErreur.setVisible(true);
            }
        }
    }

    // Method to validate login (replace this with your actual logic)
    private boolean validateLogin(String email, String password) {
        if (email.equals("amin") && password.equals("123")){
            role=Role.ETUDIANT;
            return true;
        } else if(email.equals("amine") && password.equals("123")) {
            role=Role.ENSEIGNANT;
            return true;
        } else if(email.equals("aminee") && password.equals("123")) {
            role=Role.ADMIN;
            return true;
        }else {
            return false;
        }
    }

    // Load the homeEtudiant interface after successful login

}
