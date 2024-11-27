package views.dialogs;

import controllers.DepartmentController;
import controllers.ProfessorController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Departement;
import models.Professor;

public class DepartmentEdit {
    public static void show(Departement departement, DepartmentController controller, Runnable onSave) {
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.APPLICATION_MODAL);
        dialogStage.setTitle("Edit Professor");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(15));

        // Input fields
        TextField nomField = new TextField(departement.getNom());


        // Save button
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            Departement newDepartment = new Departement(
                    nomField.getText()
            );
            // Update professor fields
            // Call Controller
            controller.edit(departement.getId(), newDepartment);

            // Trigger the onSave callback
            if (onSave != null) {
                onSave.run();
            }

            dialogStage.close();
        });

        vbox.getChildren().addAll(new Label("Nom:"), nomField, saveButton);

        Scene scene = new Scene(vbox);
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
}
