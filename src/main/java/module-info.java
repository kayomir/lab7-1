module com.example.laba {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens ui to javafx.fxml;
    exports ui;
}