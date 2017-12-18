/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import launch.BreakingGood;
import model.Joueur;

/**
 *
 * @author mabonfillo
 */
public class PlayWindow {
    
    @FXML
    TextField playerName;
    
    @FXML
    public void onStart(){
        
        
        BreakingGood.setJoueur(new Joueur(playerName.getText()));
        
        try{
            
            System.out.println("Nom joueur: " + BreakingGood.getJoueur().getNom());
            //playerName.textProperty().bind(BreakingGood.getPlayerName());
            BreakingGood.changerFenetre("/resources/fxml/GameWindow.fxml", getClass());
        }
        catch (Exception e) {
            Logger.getLogger(LaunchWindow.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
