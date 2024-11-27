package views.Pages;

import controllers.DepartmentController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import models.Departement;
import views.components.BackButton;
import views.components.Header;

public class DepartmentPage implements Page{
    private final Scene scene;
    private final Stage stage;
    private final DepartmentController controller;

    public DepartmentPage(Stage stage, WelcomePage welcomePage, DepartmentController departmentController) {
        this.controller = departmentController;
        this.stage = stage;

        BorderPane root = new BorderPane();

        // HEADER
        Button back = BackButton.create(stage, welcomePage);
        Header header = new Header("Departments", back);
        root.setTop(header);
        // END HEADER

        // TABLE VIEW
        TableView<Departement> tableView = new TableView<>();
        // COLUMNS
        TableColumn<Departement, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<Departement, Integer> nomColumn = new TableColumn<>("Nom");
        nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
        // ACTION BUTTONS
        // action
        TableColumn<Departement, Integer> actionColumn = new TableColumn<>("Actions");
        actionColumn.setCellFactory(column -> new TableCell<>() {
            private final HBox actionBox = new HBox(10);

            private final Button deleteButton = new Button("Delete");
            private final Button editButton = new Button("Edit");

            {
                // Button styles
                deleteButton.setStyle("-fx-background-color: red; -fx-text-fill: white;");
                editButton.setStyle("-fx-background-color: orange; -fx-text-fill: white;");

                // Button actions
                deleteButton.setOnAction(e -> {
                    Departement departement = getTableRow().getItem();
                    if (departement != null) {
                        handleDelete(departement);
                    }
                });

                editButton.setOnAction(e -> {
                    Departement departement = getTableRow().getItem();
                    if (departement != null) {
                        handleEdit(departement);
                    }
                });

                // Add buttons to the HBox
                actionBox.getChildren().addAll(editButton, deleteButton);
            }

            @Override
            protected void updateItem(Integer item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || getTableRow() == null || getTableRow().getItem() == null) {
                    setGraphic(null); // Clear the cell if there's no data
                } else {
                    setGraphic(actionBox); // Set the HBox with buttons
                }
            }

            private void handleDelete(Departement departement) {
                System.out.println("Deleting department: " + departement.getNom());
                // Implement your delete logic here
            }

            private void handleEdit(Departement departement) {
                System.out.println("Editing department: " + departement.getNom());
                // Implement your edit logic here
            }
        });
        // END ACTION BUTTONS
        // END COLUMNS
        tableView.getColumns().addAll(idColumn, nomColumn, actionColumn);
        tableView.setItems(controller.fetchAll());

        root.setCenter(tableView);
        // END TABLE VIEW

        scene = new Scene(root, 1080, 694);
    }

    public void show() {
        stage.setScene(scene);
    }
}
