package views.components;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Header extends HBox {
    public Header(String title, Node node) {
        Label header = new Label(title);
        header.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-text-fill: #FFF; -fx-font-family: 'Arial';");


        this.getChildren().add(node);
        this.getChildren().addAll(header);
        this.setStyle("-fx-padding: 20; -fx-background-color: #333;");
    }
}
