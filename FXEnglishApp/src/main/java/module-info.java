module com.pth.fxenglishapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.pth.fxenglishapp to javafx.fxml;
    exports com.pth.fxenglishapp;
}
