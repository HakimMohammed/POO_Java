package views.dialogs.Edit;

import controllers.DepartmentController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Departement;

public class DepartmentCreate {
    public static void show(DepartmentController controller, Runnable onSave) {
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.APPLICATION_MODAL);
        dialogStage.setTitle("Create Department");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(15));

        // Input fields
        TextField nomField = new TextField();


        // Save button
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            controller.create(new Departement(nomField.getText()));

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
