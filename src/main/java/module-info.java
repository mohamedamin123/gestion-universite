module org.bibliotheque.universite {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.bibliotheque.universite to javafx.fxml;
    exports org.bibliotheque.universite;
    exports org.bibliotheque.universite.controller.enseignant;
    opens org.bibliotheque.universite.controller.enseignant to javafx.fxml;
    exports org.bibliotheque.universite.controller.etudiant;
    opens org.bibliotheque.universite.controller.etudiant to javafx.fxml;
}