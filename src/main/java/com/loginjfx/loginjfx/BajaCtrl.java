package com.loginjfx.loginjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.*;

public class BajaCtrl {
    @FXML
    private Button btnDeny;

    @FXML
    private Button btnOK;

    @FXML
    private TextField txtDNI;

    @FXML
    void OnClickDeny(ActionEvent event) {
        Stage stagePrincipal = (Stage) btnDeny.getScene().getWindow();
        stagePrincipal.close();
    }

    @FXML
    void OnClickOK(ActionEvent event) {
        String DNI = txtDNI.getText();
        alumnos
    }
}
