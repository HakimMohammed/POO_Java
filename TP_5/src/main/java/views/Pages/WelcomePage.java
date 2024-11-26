package views.Pages;

import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import views.components.NavigationButton;

import java.util.Objects;

public class WelcomePage {

    private final Scene scene;

    public WelcomePage() {
        BorderPane root = new BorderPane();

        VBox main = new VBox(30);
        VBox textBox = new VBox(10);

        Label title = new Label("Welcome !");
        title.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-text-fill: #000; -fx-font-family: 'Arial';");

        Label description = new Label("choose what you want to manage");
        description.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #000; -fx-font-family: 'Arial';");

        textBox.getChildren().addAll(title, description);
        textBox.setAlignment(Pos.CENTER);

        main.getChildren().add(textBox);

        main.setAlignment(Pos.CENTER);
        root.setCenter(main);

        scene = new Scene(root, 1080, 694);
    }

    public void setNavigation(ProfessorPage professorPage, DepartmentPage departmentPage) {
        HBox buttonBox = new HBox(20);

        // Professor Button
        try {
            Image profImage = new Image(Objects.requireNonNull(WelcomePage.class.getResourceAsStream("/images/professor.png")));
            Button profButton = NavigationButton.create(profImage, "Professors", professorPage);
            buttonBox.getChildren().add(profButton);
        } catch (NullPointerException e) {
            System.err.println("Error: Professor image not found.");
        }

        // Department Button
        try {
            Image depImage = new Image(Objects.requireNonNull(WelcomePage.class.getResourceAsStream("/images/department.png")));
            Button departmentButton = NavigationButton.create(depImage, "Departments", departmentPage);
            buttonBox.getChildren().add(departmentButton);
        } catch (NullPointerException e) {
            System.err.println("Error: Department image not found.");
        }

        buttonBox.setAlignment(Pos.CENTER);
        // add buttons to page
        BorderPane root = (BorderPane) scene.getRoot();
        VBox main = (VBox) root.getCenter();
        main.getChildren().add(buttonBox);
    }

    public Scene getScene() {
        return scene;
    }
}
