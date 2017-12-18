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
public class Dealer {
    
    private final String nom;
    private final int prixVente;
    
    public Dealer(String nom, int prixVente){
        this.nom = nom;
        this.prixVente = prixVente;
    }
    
    public int vendre(float nbMeth) {
        return (int) nbMeth * this.prixVente;
    }
}
