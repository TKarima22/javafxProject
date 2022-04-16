/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.net.URL;
import java.sql.*;

import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Callback;
import utils.ConnectionUtil;

/**
 * FXML Controller class
 *
 * @author oXCToo
 */
public class HomeController implements Initializable {

    @FXML
    private TextField txtIdentifiantAgent;
    @FXML
    private TextField txtMotDePasse;
    @FXML
    private Button btnSave;
    @FXML

    Label lblStatus;

    @FXML
    TableView tblData;

    /**
     * Initializes the controller class.
     */
    public void ConnectionDB(){
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet;
        ResultSetMetaData metaData;
        String resultat="NULL";
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, "user", "user");

        }

    }


    public HomeController() {
        connection = (Connection) ConnectionUtil.conDB();
    }


    @FXML
    private void HandleEvents(MouseEvent event) {
        //check if not empty
        if (txtMotDePasse.getText().isEmpty() || txtIdentifiantAgent.getText().isEmpty()) {
            lblStatus.setTextFill(Color.TOMATO);
            lblStatus.setText("Enter all details please");
        } else {
            verifyDataAgent(txtMotDePasse.getText(),txtIdentifiantAgent.getText());
        }

    }

    private void clearFields() {
        txtIdentifiantAgent.clear();
        txtMotDePasse.clear();
    }

    private String verifyDataAgent(txtMotDePasse.getText(),txtIdentifiantAgent.getText()) {

        private int idAgent=txtIdentifiantAgent.getText();
        private String  MdpAgent=txtMotDePasse.getText();
        try {

            String st = "SELECT INTO GestionTerrain WHERE identifiantAgent=idAgent AND motDePasseAgent=MdpAgent";
            if()


            return "Success";

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            lblStatus.setTextFill(Color.TOMATO);
            lblStatus.setText(ex.getMessage());
            return "Exception";
        }
    }

    private ObservableList<ObservableList> data;
    String SQL = "SELECT * from wip_users";




}
