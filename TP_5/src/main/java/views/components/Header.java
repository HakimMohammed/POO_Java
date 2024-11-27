package views.components;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class Header extends HBox {
    public Header(Node leftNode, String title, Node actions) {
        // Title label
        Label header = new Label(title);
        header.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-text-fill: #FFF; -fx-font-family: 'Arial';");

        // Spacer to push actions to the far right
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS); // Spacer grows to take up available space

        // Add elements to the HBox
        this.getChildren().addAll(leftNode, header, spacer, actions);

        // Style the header container
        this.setStyle("-fx-padding: 20; -fx-background-color: #333;");
        this.setAlignment(Pos.CENTER_LEFT); // Align items on the left side
    }
}
