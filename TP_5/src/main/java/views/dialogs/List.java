package views.dialogs;

import controllers.ProfessorController;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import metier.ProfessorMetierImpl;
import models.Departement;
import models.Professor;

public class List {
    public static void show(Departement departement) {
        ProfessorMetierImpl professorMetier = new ProfessorMetierImpl();
        ProfessorController professorController = new ProfessorController(professorMetier);
        ObservableList<Professor> professors = professorController.fetchAll();

        Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);  // Block events to the main window
        dialog.setTitle("Departments List");

        VBox vbox = new VBox(10);

        for (Professor professor : professors) {
            if( professor.getIdDepartment() == departement.getId()) {
                Label professorLabel = new Label(professor.getPrenom()+" "+professor.getNom());
                vbox.getChildren().add(professorLabel);
            }

        }

        Scene scene = new Scene(vbox, 300, 250);
        dialog.setScene(scene);
        dialog.showAndWait();
    }
}
