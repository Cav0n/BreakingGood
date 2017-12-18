/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Stock;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author mabonfillo
 */
public class Emplacement {

    private final StringProperty designation = new SimpleStringProperty();
        public String getDesignation() {return designation.get();}
        public void setDesignation(String value) {designation.set(value);}
        public StringProperty designationProperty() {return designation;}
        
    private final IntegerProperty contenance = new SimpleIntegerProperty();
        public int getContenance() {return contenance.get();}
        public void setContenance(int value) {contenance.set(value);}
        public IntegerProperty contenanceProperty() {return contenance;}
        
    private final IntegerProperty nbComposant = new SimpleIntegerProperty();
        public int getNbComposant() {return nbComposant.get();}
        public void setNbComposant(int value) {nbComposant.set(value + getNbComposant());}
        public IntegerProperty nbComposantProperty() {return nbComposant;}
        
    private Composant comp;
        public Composant getComp() {return comp;}
        public void setComp(Composant comp) {this.comp = comp;}
    
    public Emplacement(int cont, int nbC, Composant c){
        setDesignation("Emplacement " + c.getDesignation());
        setContenance(cont);
        setNbComposant(nbC);
        
    }
    
    public void consommation(int cons){
        if(getNbComposant() != 0 && getNbComposant() - cons >= 0){
            setNbComposant(-cons);
        }
        else{
            System.out.println("Pas assez de composants" + cons);
        }
    }
    
}
