module com.example.comp1008test1java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1008test1java to javafx.fxml;
    exports com.example.comp1008test1java;
}