package org.bibliotheque.universite.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    private Label welcomeText;


    @FXML
    private void connecter() {
        String email = emailConnecter.getText().trim();
        String password = passwordConnecter.getText().trim();

        if (email.isEmpty() || password.isEmpty()) {
            loginErreur.setText("Email et mot de passe ne doivent pas être vides!");
            loginErreur.setVisible(true);
        } else {
            if (validateLogin(email, password)) {
                loginErreur.setVisible(false);
            } else {
                loginErreur.setText("Votre email ou mot de passe est incorrect!!");
                loginErreur.setVisible(true);
            }
        }
    }

    // Example method to validate login (you would replace this with actual authentication logic)
    private boolean validateLogin(String email, String password) {
        // Replace this with actual validation logic (e.g., check from a database)
        return email.equals("admin@example.com") && password.equals("password");
    }
}