module com.example.javafx_retrofit_gson {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires okhttp3;


    opens com.example.javafx_retrofit_gson to javafx.fxml, com.google.gson;
    exports com.example.javafx_retrofit_gson;

}