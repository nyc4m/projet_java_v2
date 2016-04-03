/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.Elements;

import jeu.exception.moralInfZero;
import jeu.exception.vieInfZero;

/**
 *
 * @author Baptiste
 */
public class ElementHeros extends Heros{
    /**
     * Pointeur sur le héros suivant dans la liste
     */
    private ElementHeros suivant;
    /**
     * Constructeur de l'élément
     * @param nom Nom du héros
     * @param description Description du héros
     */
    public ElementHeros(String nom, String description) {
        super(nom, description);
        this.suivant = null;
    }
    
    public ElementHeros(String nom, String description, int moral, int vie){
        super(nom, description, moral, vie);
        this.suivant = null;
    }
    /**
     * Permet d'obtenir le suivant de la liste
     * @return Retourne l'élément suivant
     */
    public ElementHeros getSuivant(){
        return this.suivant;
    }
    /**
     * Permet de relier un élément de la liste à un autre.
     * @param heros L'élément à relier.
     */
    public void relier(ElementHeros heros){
        this.suivant = heros;
    }
    
    
}
