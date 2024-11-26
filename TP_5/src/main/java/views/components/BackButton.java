package views.components;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import views.Pages.WelcomePage;

import java.util.Objects;

public class BackButton {
    public static Button create(Stage primaryStage, WelcomePage welcomePage) {
        Image image = new Image(Objects.requireNonNull(BackButton.class.getResourceAsStream("/images/back.png")));
        ImageView imageView = new ImageView(image);

        Button button = new Button("", imageView);
        imageView.setFitWidth(20);
        imageView.setFitHeight(20);

        button.setOnAction(e -> primaryStage.setScene(welcomePage.getScene()));

        return button;
    }
}
