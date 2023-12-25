module com.example.laba {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.laba to javafx.fxml;
    exports com.example.laba;
}