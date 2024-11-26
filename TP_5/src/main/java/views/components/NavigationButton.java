package views.components;

import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import views.Pages.Page;

public class NavigationButton {
    public static Button create(Image image, String title, Page page) {
        ImageView imageView = new ImageView(image);

        Button button = new Button(title, imageView);
        button.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #000; -fx-font-family: 'Arial';");
        button.setContentDisplay(ContentDisplay.TOP);

        imageView.setFitWidth(200);
        imageView.setFitHeight(200);

        button.setOnAction(e -> page.show());

        return button;
    }
}
