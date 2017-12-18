/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author mabonfillo
 */
public class Joueur {
    
    //Le nom du joueur
    private final StringProperty nom = new SimpleStringProperty();
        public String getNom(){ return nom.get(); }
        public void setNom(String nom){ this.nom.set(nom); }
        public StringProperty nomProperty(){ return nom; }
        
    //Le score
    private final IntegerProperty score = new SimpleIntegerProperty();
        public int getScore(){ return score.get(); }
        public void setScore(int score){ this.score.set(score); }
        public IntegerProperty scoreProperty(){ return score; }
        //Pour pouvoir avoir le score en String :
        public String toStringScore(){ return getScore() + " points"; }
        //Pour pouvoir ajouter des points au joueur :
        public void addScore(int score){
            setScore(getScore() + score);
            setScoreS(toStringScore());
    }
    
    //Le cash
    private final IntegerProperty cash = new SimpleIntegerProperty();
        public int getCash(){ return cash.get(); }
        public void setCash(int cash){ this.cash.set(cash); }
        public IntegerProperty cashProperty(){ return cash; }
        //Pour pouvoir avoir le cash en String :
        public String toStringCash(){ return "$ " + getCash(); }
        //Pour pouvoir ajouter du cash au joueur :
        public void addCash(int cash){
            setCash(getCash() + cash);
            setCashS(toStringCash());
    }
        
        
     //Pour pouvoir afficher le score et le cash dans les labels on a besoin de faire des "StringProperty"
     private final StringProperty scoreS = new SimpleStringProperty();
        public String getScoreS(){ return getScore() + " points"; }
        public void setScoreS(String scoreS){ this.scoreS.set(scoreS); }
        public StringProperty scoreSProperty(){ return scoreS; }
     
     private final StringProperty cashS = new SimpleStringProperty();
        public String getCashS(){ return "$ " + getCash(); }
        public void setCashS(String cashS){ this.cashS.set(cashS); }
        public StringProperty cashSProperty(){ return cashS; }
        
        
        //Le joueur doit avoir un inventaire pour avoir des Bonus, des composants, etc...
        private Inventaire inventaire = new Inventaire();
        public Inventaire getInventaire() { return inventaire; }
    
        public Joueur(String nom){
            setNom(nom);
            setScore(0);
            setCash(500);
        }
    
}
