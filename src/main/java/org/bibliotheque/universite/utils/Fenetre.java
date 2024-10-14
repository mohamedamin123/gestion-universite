package org.bibliotheque.universite.utils;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Fenetre {
    public static void loadHomeEtudiantScene(Event event, String template) {
        try {
            // Load the FXML file for homeEtudiant
            FXMLLoader loader = new FXMLLoader(Fenetre.class.getResource("/org/bibliotheque/universite/" + template + ".fxml"));
            Parent homeEtudiantRoot = loader.load();

            // Get the current stage (window) and set the new scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(homeEtudiantRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();  // Log the exception (you can improve error handling)
        }
    }
}
