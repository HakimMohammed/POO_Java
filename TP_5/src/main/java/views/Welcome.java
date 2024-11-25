package views;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class Welcome extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        VBox main = new VBox(30);


        VBox textBox = new VBox(10);

        Label title = new Label("Welcome !");
        title.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-text-fill: #000; -fx-font-family: 'Arial';");

        Label description = new Label("choose what you want to manage");
        description.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #000; -fx-font-family: 'Arial';");

        textBox.getChildren().addAll(title, description);
        textBox.setStyle("-fx-alignment: center;"); // Centers content within VBox

        main.getChildren().add(textBox);

        HBox buttonBox = new HBox(10);

        // Professor
        Image profImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/professor.png")));
        ImageView profImageView = new ImageView(profImage);

        Button profButton = new Button("Professors", profImageView);
        profButton.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #000; -fx-font-family: 'Arial';");
        profButton.setContentDisplay(ContentDisplay.TOP);

        profImageView.setFitWidth(200);
        profImageView.setFitHeight(200);

        buttonBox.getChildren().add(profButton);
        buttonBox.setAlignment(Pos.CENTER);

        // Department
        Image depImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/department.png")));
        ImageView depImageView = new ImageView(depImage);

        Button depButton = new Button("Departments", depImageView);
        depButton.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #000; -fx-font-family: 'Arial';");
        depButton.setContentDisplay(ContentDisplay.TOP);

        depImageView.setFitWidth(200);
        depImageView.setFitHeight(200);

        buttonBox.getChildren().add(depButton);
        buttonBox.setAlignment(Pos.CENTER);

        main.getChildren().add(buttonBox);

        main.setAlignment(Pos.CENTER);

        root.setCenter(main);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Manager of professors and departments");
        primaryStage.show();
    }
}
