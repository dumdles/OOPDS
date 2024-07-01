module com.example.lab5_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lab5_javafx to javafx.fxml;
    exports com.example.lab5_javafx;
}