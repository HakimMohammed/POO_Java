package views.Pages;

import controllers.ProfessorController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.Professor;
import views.components.ActionCell;
import views.components.BackButton;
import views.components.Header;

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
        Header header = new Header("Professors", back);
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
        actionColumn.setCellFactory(col -> new ActionCell<Professor>());


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
