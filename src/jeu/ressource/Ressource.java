/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.ressource;

import jeu.exception.ressInfZero;

/**
 *
 * @author Baptiste
 */
public class Ressource {
    /**
     * Exprime une quatité d'or
     */
    private int or;
    /**
     * Exprime une quatité de pierre
     */
    private int pierre;
    /**
     * Exprime une quatité de bois
     */
    private int bois;
    /**
     * Constructeur du type Ressource, qui permet de stocker des ressources
     * comme la pierre, l'or ou encore le bois. Elle permet de définir un prix,
     * ou un crédit.
     * @param or quantité d'or à attribuer
     * @param pierre quantité de pierre à attribuer
     * @param bois quantité de bois à attribuer
     */
    public Ressource(int or, int pierre, int bois){
        this.bois = bois;
        this.pierre = pierre;
        this.or = or;
    }
    
     
/////// Set //////////////////
    public void setOr(int or) throws ressInfZero{
        if(this.or + or < 0) throw new ressInfZero();
        this.or = or;
    }

    public void setPierre(int pierre) throws ressInfZero{
        if(this.pierre + pierre < 0) throw new ressInfZero();
        this.pierre = pierre;
    }

    public void setBois(int bois) {
        this.bois = bois;
    }
    
//////// Get ////////////////

    public int getOr() {
        return or;
    }

    public int getPierre() {
        return pierre;
    }

    public int getBois() {
        return bois;
    }
    
    
}
