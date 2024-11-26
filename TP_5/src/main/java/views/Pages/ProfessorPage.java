package views.Pages;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import views.components.BackButton;
import views.components.Header;

public class ProfessorPage implements Page{
    private final Scene scene;
    private final Stage stage;

    public ProfessorPage(Stage stage, WelcomePage welcomePage) {
        this.stage = stage;
        BorderPane root = new BorderPane();
        Button back = BackButton.create(stage, welcomePage);
        Header header = new Header("Professors", back);
        root.setTop(header);

        scene = new Scene(root, 500, 500);
    }

    public void show() {
        stage.setScene(scene);
    }
}
