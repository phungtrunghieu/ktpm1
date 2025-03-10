package com.pth.fxenglishapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert;

public class PrimaryController {

//    @FXML
//    private void switchToSecondary() throws IOException {
//        App.setRoot("secondary");
//    }
    
    public void checkHandler(ActionEvent e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION,"Hello World",ButtonType.OK);
            alert.show();
    }
}
