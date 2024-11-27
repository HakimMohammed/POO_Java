package views.dialogs;

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

public class ProfessorEdit {
    public static void show(Professor professor, ProfessorController controller, Runnable onSave) {
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.APPLICATION_MODAL);
        dialogStage.setTitle("Edit Professor");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(15));

        // Input fields
        TextField nomField = new TextField(professor.getNom());
        TextField prenomField = new TextField(professor.getPrenom());
        TextField cinField = new TextField(professor.getCin());
        TextField addresseField = new TextField(professor.getAdresse());
        TextField telephoneField = new TextField(professor.getTelephone());
        TextField emailField = new TextField(professor.getEmail());

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
                    professor.getDateRecruitment()
                    );
            // Update professor fields
            // Call Controller
            controller.edit(professor.getId(), newProfessor);

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
