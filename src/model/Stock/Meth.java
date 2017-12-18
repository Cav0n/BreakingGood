/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Stock;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author flbernard
 */
public class Meth {
    
    private float poids;
    
    
    private final StringProperty s = new SimpleStringProperty();
        public String getS(){ return s.get(); }
        public void setS(String s){ this.s.set(s); }
        public StringProperty sProperty(){ return s; }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }
    
    public void addPoids(float poids){
        setPoids ((float)Math.round((getPoids() * 100) + (poids * 100)) / 100);
        setS(toStringMeth());
    }
    
    public String toStringMeth(){
        return getPoids() + "Kg de Meth";
    }
}
