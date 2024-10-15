package org.bibliotheque.universite.controller.etudiant;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import org.bibliotheque.universite.model.Devoir;
import org.bibliotheque.universite.model.Matiere;

import java.io.IOException;

public class NoteListCell extends ListCell<Devoir> {

    @FXML
    private Label noteDS;

    @FXML
    private Label matiereName;

    @FXML
    private Label noteExamen;

    private FXMLLoader mLLoader;

    @Override
    protected void updateItem(Devoir devoir, boolean empty) {
        super.updateItem(devoir, empty);

        if (empty || devoir == null) {
            setText(null);
            setGraphic(null);
        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("/org/bibliotheque/universite/note_cell.fxml"));
                mLLoader.setController(this);

                try {
                    mLLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            matiereName.setText("nom de matiere");
            noteDS.setText("Note DS: " + devoir.getNoteDS());  // Set the DS note (you need to have this in your Matiere model)
            noteExamen.setText("Note Examen: " + devoir.getNoteExamen());  // Set the exam note (you need to have this in your Matiere model)


            setText(null);
            setGraphic(mLLoader.getRoot());
        }
    }
}
