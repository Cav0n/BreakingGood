/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import model.Joueur;

/**
 *
 * @author mabonfillo
 */
public class BreakingGood extends Application {
    
    private static Stage primaryStage;

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
    
    private static Joueur j;
    
    public static Joueur getJoueur(){ return j; }
    public static void setJoueur(Joueur nj){ j = nj;}
    
    @Override
    public void start(Stage stage) throws Exception {
        
        primaryStage=stage;
        Parent launch = FXMLLoader.load(getClass().getResource("/resources/fxml/LaunchWindow.fxml"));
        
        Scene scene = new Scene(launch, 700, 437);
        primaryStage.getIcons().add(new Image("resources/img/icon.png"));
        primaryStage.setTitle("Breaking Good");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void changerFenetre(String window, Class classe) throws Exception {
        Stage stage = BreakingGood.getPrimaryStage();
        stage.close();
        Parent fenetre = FXMLLoader.load(classe.getResource(window));
        Scene sc = new Scene(fenetre);
        stage.setScene(sc);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
