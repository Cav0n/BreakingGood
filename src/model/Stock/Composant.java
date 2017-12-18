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
public class Composant {

    private final StringProperty designation = new SimpleStringProperty();
        public String getDesignation() {return designation.get();}
        public void setDesignation(String value) {designation.set(value);}
        public StringProperty designationProperty() {return designation;}    
    
    private final IntegerProperty prix = new SimpleIntegerProperty();
        public int getPrix() {return prix.get();}
        public void setPrix(int value) {prix.set(value);}
        public IntegerProperty prixProperty() {return prix;}
        
    private final StringProperty type = new SimpleStringProperty();
        public String getType() { return type.get(); }
        public void setType(String value) { type.set(value); }
        public StringProperty typeProperty() { return type; }
    
        
    public Composant(String des, int prix){
        setPrix(prix);
        setDesignation(des);
        setType(null);
    }
    
    public Composant(String des, String type, int prix){
        setPrix(prix);
        setDesignation(des);
        setType(type);
    }
    
}
