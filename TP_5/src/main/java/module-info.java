module com.example.tp_5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;
    requires java.sql;


    opens com.example.tp_5 to javafx.fxml;
    //exports com.example.tp_5;
    exports views to javafx.graphics;
}