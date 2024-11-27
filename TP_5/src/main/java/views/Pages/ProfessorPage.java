package views.Pages;

import controllers.ProfessorController;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import models.Professor;
import views.components.BackButton;
import views.components.Header;
import views.dialogs.Delete;
import views.dialogs.ProfessorEdit;

public class ProfessorPage implements Page{
    private final Scene scene;
    private final Stage stage;
    private final ProfessorController controller;

    public ProfessorPage(Stage stage, WelcomePage welcomePage, ProfessorController professorController) {
        this.controller = professorController;
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
        Button create = new Button("New Professor");
        create.setStyle("-fx-background-color: green; -fx-text-fill: white;");
        // END CREATE
        actions.getChildren().addAll(create, search);
        actions.setStyle("-fx-padding: 20 0 0 0");
        // END ACTIONS

        Header header = new Header(back, "Professors", actions);

        root.setTop(header);
        // End Header

        // Table View
        TableView<Professor> tableView = new TableView<>();
            // Columns
        TableColumn<Professor, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<Professor, Integer> nomColumn = new TableColumn<>("Nom ");
        nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
        TableColumn<Professor, Integer> prenomColumn = new TableColumn<>("Prénom");
        prenomColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        TableColumn<Professor, Integer> cinColumn = new TableColumn<>("CIN");
        cinColumn.setCellValueFactory(new PropertyValueFactory<>("cin"));
        TableColumn<Professor, Integer> addresseColumn = new TableColumn<>("Adresse");
        addresseColumn.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        TableColumn<Professor, Integer> telColumn = new TableColumn<>("Num Téléphone");
        telColumn.setCellValueFactory(new PropertyValueFactory<>("telephone"));
        TableColumn<Professor, Integer> emailColumn = new TableColumn<>("Email");
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        TableColumn<Professor, Integer> dateColumn = new TableColumn<>("Date de Recrutement");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("dateRecruitment"));

        // action
        TableColumn<Professor, Integer> actionColumn = new TableColumn<>("Actions");
        actionColumn.setCellFactory(column -> new TableCell<>() {
            private final HBox actionBox = new HBox(10);

            private final Button deleteButton = new Button("Delete");
            private final Button editButton = new Button("Edit");
            private final Button assignButton = new Button("Assign to Dept");

            {
                // Button styles
                deleteButton.setStyle("-fx-background-color: red; -fx-text-fill: white;");
                editButton.setStyle("-fx-background-color: orange; -fx-text-fill: white;");
                assignButton.setStyle("-fx-background-color: green; -fx-text-fill: white;");

                // Button actions
                deleteButton.setOnAction(e -> {
                    Professor professor = getTableRow().getItem();
                    if (professor != null) {
                        handleDelete(professor);
                    }
                });

                editButton.setOnAction(e -> {
                    Professor professor = getTableRow().getItem();
                    if (professor != null) {
                        handleEdit(professor, controller);
                    }
                });

                assignButton.setOnAction(e -> {
                    Professor professor = getTableRow().getItem();
                    if (professor != null) {
                        handleAssign(professor);
                    }
                });

                // Add buttons to the HBox
                actionBox.getChildren().addAll(editButton, deleteButton, assignButton);
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

            private void handleDelete(Professor professor) {
                boolean confirmed = Delete.show(professor.getPrenom()+ " "+professor.getNom());
                if(confirmed) {
                    professorController.delete(professor.getId());
                    this.refresh();
                }
            }

            private void handleEdit(Professor professor, ProfessorController controller) {
                ProfessorEdit.show(professor,controller, this::refresh);
            }

            private void handleAssign(Professor professor) {
                System.out.println("Assigning professor: " + professor.getNom());
                // Implement your assign-to-department logic here
            }

            // Refresh Data after making changes
            private void refresh(){
                tableView.setItems(controller.fetchAll());
                tableView.refresh();
            }
        });
        // end action


        tableView.getColumns().addAll(idColumn, nomColumn, prenomColumn, cinColumn, addresseColumn, telColumn, emailColumn, dateColumn, actionColumn);
        tableView.setItems(controller.fetchAll());

        root.setCenter(tableView);
        // End Table View

        scene = new Scene(root, 1080, 694);
    }

    public void show() {
        stage.setScene(scene);
    }
}
