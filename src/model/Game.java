/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Stock.Composant;
import model.Stock.Entrepot;
import java.util.ArrayList;
import java.util.List;
import model.Labo.Caravane;
import model.Labo.Laboratoire;
import model.Labo.Laverie;
import model.Labo.Maison;
import model.Stock.Emplacement;

/**
 *
 * @author mabonfillo
 */
public class Game {
    
    private List<Composant> composants;
    private Entrepot entrepot;
    private List<Laboratoire> labs;

    public List<Laboratoire> getLabs() {
        return labs;
    }
    
    public Game(){
        composants = new ArrayList<Composant>();
        composants.add(new Composant("Phospore rouge", 8));
        composants.add(new Composant("Iode", 30));
        composants.add(new Composant("Lithium", 22));
        composants.add(new Composant("Ammoniac anhydre", 9));
        entrepot = new Entrepot(composants);
        labs = new ArrayList<>();
        labs.add(new Caravane());
        labs.add(new Maison());
        labs.add(new Laverie());
    }
    
    public void addLabo(String lab){
        switch(lab){
            case "Caravane":
                labs.get(0).addLab();
                break;
            case "Maison":
                labs.get(1).addLab();
                break;
            case "Laverie":
                labs.get(2).addLab();
                break;
        }
    }
    
    public float produire(){
        float prod = 0;
        for(Laboratoire l : labs){
                prod = prod + (float)l.produire() * l.getNbLabo();
        }
        return prod;
    }
    
    public void consommation(){        
        for(Emplacement e : entrepot.getEmps()){
            for(Laboratoire l : labs){
                if(l.getNbLabo() != 0){
                    e.consommation(l.getConsommation());
                }
            }
        }
    }
    
}
