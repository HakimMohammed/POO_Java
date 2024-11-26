package views;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import views.Pages.DepartmentPage;
import views.Pages.ProfessorPage;
import views.Pages.WelcomePage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Pages
        WelcomePage welcomePage = new WelcomePage(primaryStage);
        ProfessorPage professorPage = new ProfessorPage(primaryStage, welcomePage);
        DepartmentPage departmentPage = new DepartmentPage(primaryStage, welcomePage);

        // Navigation
        welcomePage.setNavigation(professorPage, departmentPage);

        primaryStage.setScene(welcomePage.getScene());
        primaryStage.setTitle("Manager of professors and departments");
        primaryStage.show();
    }
}
