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
     *
     * @param or quantité d'or à attribuer
     * @param pierre quantité de pierre à attribuer
     * @param bois quantité de bois à attribuer
     */
    public Ressource(int or, int pierre, int bois) {
        this.bois = bois;
        this.pierre = pierre;
        this.or = or;
    }

    /**
     * Permet d'afficher les ressources
     *
     * @return la valeur convertie en chaine des ressources
     */
    public String toString() {
        String s;
        s = "Or ";
        s += this.or;
        s += " Bois ";
        s += this.bois;
        s += " Pierre ";
        s += this.pierre;
        s += ".";
        return s;
    }

/////// Set //////////////////
    /**
     * Modifie la valeur de l'or
     *
     * @param or nouvelle valeur pour l'or
     * @throws ressInfZero Si le nouveau montant est inférieur à 0, une
     * exception est levée
     */
    public void setOr(int or) throws ressInfZero {
        if (or < 0) {
            throw new ressInfZero();
        }
        this.or = or;
    }

    /**
     * Modifie la quantité de pierre
     *
     * @param pierre nouvelle quantité de pierre
     * @throws ressInfZero Si le nouveau montant est inférieur à 0, une
     * exception est levée
     */
    public void setPierre(int pierre) throws ressInfZero {
        if (pierre < 0) {
            throw new ressInfZero();
        }
        this.pierre = pierre;
    }

    /**
     * Modifie la quantité de bois
     *
     * @param bois nouvelle quantité de bois
     * @throws ressInfZero Si le nouveau montant est inférieur à 0, une
     * exception est levée
     */
    public void setBois(int bois) throws ressInfZero {
        if (bois < 0) {
            throw new ressInfZero();
        }
        this.bois = bois;
    }

//////// Get ////////////////
    /**
     *
     * @return Retourne la quantité d'or
     */
    public int getOr() {
        return or;
    }

    /**
     *
     * @return Retourne la quantité de pierre
     */
    public int getPierre() {
        return pierre;
    }

    /**
     *
     * @return Retourne la quantité de bois
     */
    public int getBois() {
        return bois;
    }

}
