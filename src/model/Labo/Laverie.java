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
public class Laverie extends Laboratoire{

    public Laverie(){
        setTauxProduction((float)0.1);
        setNbLabo(0);
        setConsommation(3);
        setDes("Laverie");
    }
    
    
}