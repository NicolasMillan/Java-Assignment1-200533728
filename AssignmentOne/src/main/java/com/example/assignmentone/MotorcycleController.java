package com.example.assignmentone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MotorcycleController implements Initializable {

    @FXML
    private LineChart<?, ?> barChart;

    @FXML
    private CheckBox ccCheckBox;

    @FXML
    private CheckBox hpCheckBox;

    @FXML
    private Button submitButton;

    @FXML
    private CheckBox topSpeedCheckBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Verify that the code is working

    }

    @FXML
    void setSubmitButton(ActionEvent event){
        //Here is where the button pulls the data

    }

    @FXML
    void viewTable_onClick(ActionEvent event) throws IOException {
        SceneChanger.changeScene(event, "Motorcycle-table-view.fxml", "Motorcycle Stats!");
    }
}