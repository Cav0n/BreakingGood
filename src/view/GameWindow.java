/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import launch.BreakingGood;
import model.Game;
import model.Joueur;
import model.Labo.Laboratoire;
import model.Stock.Meth;
import model.Dealer;

/**
 *
 * @author flbernard
 */
public class GameWindow implements Initializable {
    
    @FXML
    private Label nameLabel;
    @FXML
    private Label cashLabel;
    @FXML
    private Label scoreLabel;
    @FXML
    private Label poidsLabel;
    @FXML
    private ProgressBar pgProd;
    
    private Game g;
    private boolean prodEnCours = false;
    
    //Le joueur 
    Joueur j = BreakingGood.getJoueur();
    //La meth (permet de gérer la quantité en kg)
    Meth meth = new Meth();
    Dealer d;
    
    private Boolean saved = false;
    
    //La barre de progression
    private final FloatProperty prog = new SimpleFloatProperty();
        public float getProg() { return prog.get(); }
        public void setProg(float value) { prog.set(value); }
        public FloatProperty progProperty() { return prog; }
    public void addProg(float value) { setProg(getProg() + value); }
    //"-prodParClic" parceque si on met zero ca commence à la valeur "prodParClic"
    public void restartProg(){ setProg(0); } 
    //
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        //Binding
        nameLabel.textProperty().bind(j.nomProperty());
        scoreLabel.textProperty().bind(j.scoreSProperty());
        cashLabel.textProperty().bind(j.cashSProperty());
        poidsLabel.textProperty().bind(meth.sProperty());
        pgProd.progressProperty().bind(prog);
        //On est obligé d'ajouter zero pour que les valeurs s'affichent dès le début
        j.addScore(0);
        j.addCash(0);
        g = new Game();
         d = new Dealer("Jessie", 20);
    }
    
    public void onProduire()throws Exception{
        g.consommation();
        try{
            Thread t = new Thread(() -> {
                
                float prod = g.produire();
                while(prod != 100){
                    prodEnCours = true;
                    Platform.runLater(() -> {
                        addProg(g.produire());
                        j.addScore(5);
                        for(Laboratoire l : g.getLabs()){
                            meth.addPoids(l.getTauxProduction() * l.getNbLabo());
                        }
                        
                    });
                    prod += g.produire();
                    if(getProg() >= 1){
                        restartProg();
                        break;
                    }
                    try {
                        Thread.sleep((long)500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                prodEnCours = false;
            });
            if (prodEnCours){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Production impossible");
                alert.setHeaderText("Une production est déjà en cours!");
                alert.setContentText("Vous ne pouvez pas lancer une deuxieme production.");
                alert.showAndWait();
            }
            else{
                t.start();   
            }
        }
        catch(Exception e){
            Logger.getLogger(LaunchWindow.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void onMagasin(){
        try{
            BreakingGood.changerFenetre("/resources/fxml/ShopWindow.fxml", getClass());
        }
        catch (Exception e) {
            Logger.getLogger(LaunchWindow.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void onVendre(){
        j.addCash(d.vendre(getProg()));
    }
    
}
