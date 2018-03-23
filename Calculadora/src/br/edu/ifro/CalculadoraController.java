/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 01854314297
 */
public class CalculadoraController implements Initializable {

    @FXML
    private TextField txtNum1;
    
    @FXML
    private TextField txtNum2;
    
    @FXML 
    private Button btnSoma;
    
    @FXML
    private Button btnSubtrai;
    
    @FXML
    private Button btnMultiplica;
    
    @FXML
    private Button btnDivide;
    
    @FXML 
    private TextField txtResult; 
    
    @FXML 
    public void soma (ActionEvent event){
      
        double num1, num2;
        
     num1 = Double.parseDouble(txtNum1.getText());
     num2 = Double.parseDouble(txtNum2.getText());
     
     txtResult.setText((""+num1+num2));
        
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
