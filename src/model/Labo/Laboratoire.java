/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Labo;

import java.util.List;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Stock.Emplacement;

/**
 *
 * @author mabonfillo
 */
public abstract class Laboratoire {        
        
    private final IntegerProperty consommation = new SimpleIntegerProperty();
        public int getConsommation() { return consommation.get(); }
        public void setConsommation(int value) { consommation.set(value); }
        public IntegerProperty consommationProperty() { return consommation; }
        
    private final FloatProperty tauxProduction = new SimpleFloatProperty();
        public float getTauxProduction() { return tauxProduction.get(); }
        public void setTauxProduction(float value) { tauxProduction.set(value); }
        public FloatProperty tauxProductionProperty() { return tauxProduction; }
        
    private final IntegerProperty nbLabo = new SimpleIntegerProperty();
        public int getNbLabo() {return nbLabo.get();}
        public void setNbLabo(int value) {nbLabo.set(getNbLabo() + value);}
        public IntegerProperty nbLaboProperty() {return nbLabo;}
        
    private final StringProperty des = new SimpleStringProperty();
        public String getDes() {return des.get();}
        public void setDes(String value) {des.set(value);}
        public StringProperty desProperty() {return des;}
        
    public float produire(){            
        return (float)getTauxProduction()*getConsommation()*4/10;
    }
    
    public void addLab(){
        setNbLabo(1);
    }
}
