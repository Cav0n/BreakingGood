/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import launch.BreakingGood;

/**
 *
 * @author mabonfillo
 */
public class LaunchWindow {
    
    public void onClicPlay(){
        try{
            BreakingGood.changerFenetre("/resources/fxml/PlayWindow.fxml", getClass());
        }
        catch (Exception e) {
            Logger.getLogger(LaunchWindow.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void onClicLoad(){
        try{
            BreakingGood.changerFenetre("/resources/fxml/LoadWindow.fxml", getClass());
        }
        catch (Exception e) {
            Logger.getLogger(LaunchWindow.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
