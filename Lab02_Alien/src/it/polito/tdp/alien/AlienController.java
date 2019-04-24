package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;

import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
    
   private AlienDictionary dizionario= new AlienDictionary();
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String w[]= this.txtWord.getText().split(" ");
    	
    	if(w.length==1) {
    		this.txtResult.appendText(dizionario.translateWord(w[0])+"\n");
    		this.txtWord.clear();
    	 }else {
    		 dizionario.addWord(w[0], w[1]);
    		 this.txtResult.appendText("parola aggiunta correttamente\n");
    		 this.txtWord.clear();
    	 }
    } 
     
    
    @FXML
    void doReset(ActionEvent event) {
    	this.txtResult.clear();
    }
    
}
