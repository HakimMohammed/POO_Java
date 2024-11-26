package views.Pages;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import views.components.BackButton;
import views.components.Header;

public class DepartmentPage implements Page{
    private final Scene scene;
    private final Stage stage;

    public DepartmentPage(Stage stage, WelcomePage welcomePage) {
        this.stage = stage;
        BorderPane root = new BorderPane();
        Button back = BackButton.create(stage, welcomePage);
        Header header = new Header("Departments", back);
        root.setTop(header);

        scene = new Scene(root, 1080, 694);
    }

    public void show() {
        stage.setScene(scene);
    }
}
