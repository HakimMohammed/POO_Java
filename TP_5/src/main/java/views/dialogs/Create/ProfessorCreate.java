package views.dialogs.Edit;

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
import models.Professor;

import java.util.Calendar;
import java.sql.Date;

public class ProfessorCreate {
    public static void show(ProfessorController controller, Runnable onSave) {
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.APPLICATION_MODAL);
        dialogStage.setTitle("Create Professor");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(15));

        // Input fields
        TextField nomField = new TextField();
        TextField prenomField = new TextField();
        TextField cinField = new TextField();
        TextField addresseField = new TextField();
        TextField telephoneField = new TextField();
        TextField emailField = new TextField();

        // Save button
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            Professor newProfessor = new Professor(
                    nomField.getText(),
                    prenomField.getText(),
                    cinField.getText(),
                    addresseField.getText(),
                    telephoneField.getText(),
                    emailField.getText(),
                    new Date(Calendar.getInstance().getTimeInMillis())
            );
            // Update professor fields
            // Call Controller
            controller.create(newProfessor);

            // Trigger the onSave callback
            if (onSave != null) {
                onSave.run();
            }

            dialogStage.close();
        });

        // Create HBox containers for each pair of fields
        HBox row1 = new HBox(10, new Label("Nom:"), nomField, new Label("Prenom:"), prenomField);
        HBox row2 = new HBox(10, new Label("CIN:"), cinField, new Label("Adresse:"), addresseField);
        HBox row3 = new HBox(10, new Label("Telephone:"), telephoneField, new Label("Email:"), emailField);

        // Apply styling for alignment and spacing
        row1.setStyle("-fx-alignment: center-left; -fx-spacing: 10px;");
        row2.setStyle("-fx-alignment: center-left; -fx-spacing: 10px;");
        row3.setStyle("-fx-alignment: center-left; -fx-spacing: 10px;");

        vbox.getChildren().addAll(row1, row2, row3, saveButton);

        Scene scene = new Scene(vbox);
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
}
