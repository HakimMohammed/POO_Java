package views;

import controllers.DepartmentController;
import controllers.ProfessorController;
import javafx.application.Application;
import javafx.stage.Stage;
import metier.DepartmentMetierImpl;
import metier.ProfessorMetierImpl;
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
        WelcomePage welcomePage = new WelcomePage();

        ProfessorMetierImpl professorMetier = new ProfessorMetierImpl();
        ProfessorController professorController = new ProfessorController(professorMetier);
        ProfessorPage professorPage = new ProfessorPage(primaryStage, welcomePage, professorController);
        DepartmentMetierImpl departmentMetier = new DepartmentMetierImpl();
        DepartmentController departmentController = new DepartmentController(departmentMetier);
        DepartmentPage departmentPage = new DepartmentPage(primaryStage, welcomePage, departmentController);

        // Navigation
        welcomePage.setNavigation(professorPage, departmentPage);

        primaryStage.setScene(welcomePage.getScene());
        primaryStage.setTitle("Manager of professors and departments");
        primaryStage.show();
    }
}
