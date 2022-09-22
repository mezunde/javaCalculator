module com.example.thecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thecalculator to javafx.fxml;
    exports com.example.thecalculator;
}