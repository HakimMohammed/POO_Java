package views.dialogs;

import controllers.DepartmentController;
import controllers.ProfessorController;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import metier.DepartmentMetierImpl;
import models.Departement;

public class Select {
    public static void show(int id, ProfessorController controller) {
        Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);  // Block events to the main window
        dialog.setTitle("Select an Item");

        VBox vbox = new VBox(10);

        DepartmentMetierImpl departmentMetier = new DepartmentMetierImpl();
        DepartmentController departmentController = new DepartmentController(departmentMetier);
        ObservableList<Departement> departments = departmentController.fetchAll();

        CheckBox[] checkboxes = new CheckBox[departments.size()];

        for (int i = 0; i < departments.size(); i++) {
            Departement dept = departments.get(i);
            checkboxes[i] = new CheckBox(dept.getNom());
            vbox.getChildren().add(checkboxes[i]);
        }

        Button submitButton = new Button("Assign");
        submitButton.setOnAction(e -> {
            // Check if exactly one checkbox is selected
            CheckBox selectedCheckbox = null;
            for (CheckBox checkbox : checkboxes) {
                if (checkbox.isSelected()) {
                    if (selectedCheckbox != null) {
                        Alert alert = new Alert(AlertType.WARNING);
                        alert.setTitle("Invalid Selection");
                        alert.setHeaderText("Please select only one department.");
                        alert.showAndWait();
                        return;
                    }
                    selectedCheckbox = checkbox;
                }
            }

            if (selectedCheckbox != null) {
                // Find the department corresponding to the selected checkbox
                Departement selectedDepartment = null;
                for (int i = 0; i < departments.size(); i++) {
                    if (checkboxes[i].isSelected()) {
                        selectedDepartment = departments.get(i);
                        break;
                    }
                }

                // Call the onSubmit action with the selected department
                if (selectedDepartment != null) {
                    controller.assignToDepartment(id, selectedDepartment.getId());
                }

                dialog.close();
            } else {
                // Show an alert if no checkbox is selected
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("No Selection");
                alert.setHeaderText("Please select a department.");
                alert.showAndWait();
            }
        });

        vbox.getChildren().add(submitButton);

        Scene scene = new Scene(vbox, 300, 250);
        dialog.setScene(scene);
        dialog.showAndWait();
    }
}
