module com.example.javafx_retrofit_gson {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires retrofit2;
    requires retrofit2.converter.gson;


    opens com.example.javafx_retrofit_gson to javafx.fxml;
    exports com.example.javafx_retrofit_gson;
}