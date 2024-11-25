package views;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Header extends HBox {
    public Header() {
        Label header = new Label("ENSET");
        header.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-text-fill: #1E90FF; -fx-font-family: 'Arial';");
        HBox buttons = new HBox(10);

        Button professors = new Button("Professors");
        professors.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-color: #000;");

        Button departments = new Button("Departments");
        departments.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-color: #000;");

        buttons.getChildren().addAll(professors, departments);

        this.getChildren().addAll(header, buttons);
        this.setStyle("-fx-padding: 20; -fx-background-color: #333;");
    }
}
