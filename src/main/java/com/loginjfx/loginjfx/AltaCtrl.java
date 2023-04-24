package com.loginjfx.loginjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.*;

public class AltaCtrl {
    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField txtDNI;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtName;

    ArrayList<Data> alumnos = new ArrayList<>();
    @FXML
    void OnClickAceptar(ActionEvent event) {
        String nombre = txtName.getText();
        String apellido = txtLastName.getText();
        String DNI = txtDNI.getText();

        //Se supone que aqui tienen que guardarse los datos de alguna forma

        Data new_alumno = new Data();
        new_alumno.setNombre(nombre);
        new_alumno.setApellido(apellido);
        new_alumno.setDNI(DNI);
        alumnos.add(new_alumno);

    }

    @FXML
    void OnClickCancelar(ActionEvent event) {
        Stage stagePrincipal = (Stage) btnCancelar.getScene().getWindow();
        stagePrincipal.close();
    }
    public ArrayList<Data> DevuelveLista(){
        return alumnos;
    }
}
