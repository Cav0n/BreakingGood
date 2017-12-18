/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Stock;

import java.util.List;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author mabonfillo
 */
public class Entrepot {

    private final IntegerProperty niveau = new SimpleIntegerProperty();
        public int getNiveau() {return niveau.get();}
        public void setNiveau(int value) {niveau.set(value);}
        public IntegerProperty niveauProperty() {return niveau;}
    
    private ObservableList<Emplacement> emplacementsObs = FXCollections.observableArrayList();
    private final ListProperty<Emplacement> emps = new SimpleListProperty<>(emplacementsObs);
        public ObservableList<Emplacement> getEmps() {return emps.get();}
        public ReadOnlyListProperty<Emplacement> empsProperty() {return emps;}
    
    
    public Entrepot(List<Composant> l){
        setNiveau(1);
        for(Composant c : l){
            emplacementsObs.add(new Emplacement(10, 5, c));
        }
        
    }
    
}
