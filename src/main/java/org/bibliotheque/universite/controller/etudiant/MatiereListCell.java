package org.bibliotheque.universite.controller.etudiant;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import org.bibliotheque.universite.model.Matiere;

import java.io.IOException;
import java.util.Objects;

public class MatiereListCell extends ListCell<Matiere> {

    @FXML
    private Label typeMatiere;

  //  private final Image defaultIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/cour.png"))); // Load the image once


    @FXML
    private Label matiereName;

    @FXML
    private Label matiereDetails;

    private FXMLLoader mLLoader;

    @Override
    protected void updateItem(Matiere matiere, boolean empty) {
        super.updateItem(matiere, empty);

        if (empty || matiere == null) {
            setText(null);
            setGraphic(null);
        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("/org/bibliotheque/universite/matiere_cell.fxml"));
                mLLoader.setController(this);

                try {
                    mLLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            matiereName.setText(matiere.getNom());
            typeMatiere.setText("Cour");
            matiereDetails.setText("Charge horaire: " + matiere.getNbrHeure() + "h");
            //matiereIcon.setImage(defaultIcon); // Use the same icon for all items

            setText(null);
            setGraphic(mLLoader.getRoot());
        }
    }
}
