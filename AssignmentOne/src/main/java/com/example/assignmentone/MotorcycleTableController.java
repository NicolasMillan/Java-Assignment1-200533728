package com.example.assignmentone;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class MotorcycleTableController implements Initializable {

    @FXML
    private TableColumn<Motorcycle, String> brandColumn;

    @FXML
    private Button buttonAddStats;

    @FXML
    private Button buttonViewGraph;

    @FXML
    private TableColumn<Motorcycle, Integer> ccColumn;

    @FXML
    private TableColumn<Motorcycle, Integer> hpColumn;

    @FXML
    private TableColumn<Motorcycle, Integer> modelIdColumn;

    @FXML
    private TableColumn<Motorcycle, Double> priceColumn;

    @FXML
    private TableColumn<Motorcycle, Integer> topSpeedColumn;

    @FXML
    private TableView<Motorcycle> tableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        System.out.println(DBUtility.getMotorcyclesFromDB());
        ArrayList<Motorcycle> motorcycles = DBUtility.getMotorcyclesFromDB();

        modelIdColumn.setCellFactory(new PropertyValueFactory<>("modelId"));
        brandColumn.setCellFactory(new PropertyValueFactory<>("brand"));
        ccColumn.setCellFactory(new PropertyValueFactory<>("cc"));
        hpColumn.setCellFactory(new PropertyValueFactory<>("hp"));
        topSpeedColumn.setCellFactory(new PropertyValueFactory<>("topSpeed"));
        priceColumn.setCellFactory(new PropertyValueFactory<>("price"));

        tableView.getItems().addAll(motorcycles);
    }
}