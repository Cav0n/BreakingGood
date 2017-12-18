/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Labo;

import model.Stock.Emplacement;

/**
 *
 * @author mabonfillo
 */
public class Caravane extends Laboratoire{

    
    public Caravane(){
        setTauxProduction((float)0.01);
        setNbLabo(1);
        System.out.println("model.Labo.Caravane.<init>()" + getNbLabo());
        setConsommation(1);
        setDes("Caravane");
    }
    
    
}
