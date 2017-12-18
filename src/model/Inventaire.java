/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cav0n
 */
public class Inventaire {
    //Labos
    boolean Caravane;
    boolean Maison;
    boolean Laverie;
    
    //Composants
    boolean ErlenmeyerMauvais;
    boolean ErlenmeyerBon;
    boolean ErlenmeyerExcellent;
    
    Inventaire(){
        Caravane = false;
        Maison = false;
        Laverie = false;
        
        ErlenmeyerMauvais = false;
        ErlenmeyerBon = false;
        ErlenmeyerExcellent = false;
    }
}
