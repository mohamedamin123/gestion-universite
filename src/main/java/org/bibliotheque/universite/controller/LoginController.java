package org.bibliotheque.universite.controller;

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
                // If the login is successful, load the homeEtudiant interface
                Fenetre.loadHomeEtudiantScene(event,"homeEtudiant");
            } else {
                loginErreur.setText("Votre email ou mot de passe est incorrect!!");
                loginErreur.setVisible(true);
            }
        }
    }

    // Method to validate login (replace this with your actual logic)
    private boolean validateLogin(String email, String password) {
        // Replace with actual validation (e.g., check from database)
        return email.equals("amin@amin.com") && password.equals("123");
    }

    // Load the homeEtudiant interface after successful login

}
