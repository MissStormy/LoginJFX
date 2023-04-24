package com.loginjfx.loginjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginCtrl {
    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtPass;

    @FXML
    private TextField txtUsuario;

    @FXML
    void OnClickLogin(ActionEvent event) throws IOException {
        String nombre = txtUsuario.getText();
        String pass = txtPass.getText();

        if (nombre.equals("Admin") && pass.equals("Admin")){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
            Parent root = fxmlLoader.load();
            MenuCtrl controlador = fxmlLoader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Menu");
            stage.setScene(scene);
            stage.show();

            Stage stagePrincipal = (Stage) btnLogin.getScene().getWindow();
            stagePrincipal.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error de usuario o password");
            alert.setContentText("El usuario o password introducido no es correcto");
            alert.showAndWait();
        }





    }
}