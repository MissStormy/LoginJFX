package com.loginjfx.loginjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class MenuCtrl {
    @FXML
    private Button btnAltaAlumno;

    @FXML
    private Button btnBajaAlumno;

    @FXML
    private Button btnConsulta;

    @FXML
    void OnClickAlta(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("altaAlumno.fxml"));
        Parent root = fxmlLoader.load();
        AltaCtrl controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Alta alumno");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void OnClickBaja(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bajaAlumno.fxml"));
        Parent root = fxmlLoader.load();
        BajaCtrl controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Baja alumno");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void OnClickConsulta(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("consultaAlumno.fxml"));
        Parent root = fxmlLoader.load();
        ConsultaCtrl controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Consultar alumnos");
        stage.setScene(scene);
        stage.show();

    }
}
