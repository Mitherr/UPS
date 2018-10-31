/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.nodes.Board;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author petrh
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private BorderPane borderPane;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Board board = new Board(); 
        borderPane.setCenter(board);
    }    
    
}
