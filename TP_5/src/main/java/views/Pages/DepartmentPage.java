package views.Pages;

import controllers.DepartmentController;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import models.Departement;
import views.components.BackButton;
import views.components.Header;
import views.dialogs.Delete;
import views.dialogs.Edit.DepartmentCreate;
import views.dialogs.Edit.DepartmentEdit;
import views.dialogs.List;

public class DepartmentPage implements Page{
    private final Scene scene;
    private final Stage stage;
    private final DepartmentController controller;

    public DepartmentPage(Stage stage, WelcomePage welcomePage, DepartmentController departmentController) {
        this.controller = departmentController;
        this.stage = stage;

        BorderPane root = new BorderPane();

        // Header
        Button back = BackButton.create(stage, welcomePage);

        // ACTIONS
        HBox actions = new HBox(10);
        // SEARCH
        HBox search = new HBox(2);
        TextField searchField = new TextField();
        Button searchButton = new Button("Search");
        search.getChildren().addAll(searchField ,searchButton);
        // END SEARCH

        // CREATE
        Button createButton = new Button("New Department");
        createButton.setStyle("-fx-background-color: green; -fx-text-fill: white;");
        // END CREATE
        actions.getChildren().addAll(createButton, search);
        actions.setStyle("-fx-padding: 20 0 0 0");

        // END ACTIONS

        Header header = new Header(back, "Departments", actions);

        root.setTop(header);
        // End Header

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
            private final Button listButton = new Button("List Professors");

            {
                createButton.setOnAction(e -> {
                    handleCreate();
                });

                // Button styles
                deleteButton.setStyle("-fx-background-color: red; -fx-text-fill: white;");
                editButton.setStyle("-fx-background-color: orange; -fx-text-fill: white;");
                listButton.setStyle("-fx-background-color: green; -fx-text-fill: white;");

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

                listButton.setOnAction(e -> {
                    Departement departement = getTableRow().getItem();
                    handleList(departement);
                });

                // Add buttons to the HBox
                actionBox.getChildren().addAll(editButton, deleteButton, listButton);
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
                boolean confirmed = Delete.show(departement.getNom());
                if (confirmed){
                    System.out.println("Deleting Department . . .");
                    // Call the controller
                    departmentController.delete(departement.getId());
                    this.refresh();
                }
            }

            private void handleEdit(Departement departement) {
                DepartmentEdit.show(departement, controller, this::refresh);
                System.out.println("Editing department: " + departement.getNom());
                // Implement your edit logic here
            }

            private void handleCreate() {
                DepartmentCreate.show(controller, this::refresh);
            }

            private void handleList(Departement departement) {
                List.show(departement);
            }

            // Refresh Data after making changes
            private void refresh(){
                tableView.setItems(controller.fetchAll());
                tableView.refresh();
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
