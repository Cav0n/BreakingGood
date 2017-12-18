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
public class Maison extends Laboratoire{

    public Maison(){
        setTauxProduction((float)0.05);
        setNbLabo(0);
        setConsommation(2);
        setDes("Maison");
    }
    
    
}
