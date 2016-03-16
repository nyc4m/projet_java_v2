/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.batiment;
import jeu.ressource.Ressource

/**
 *
 * @author Baptiste
 */
public class Batiment {
    /**
     * Contient le prix du batiment
     */
    private Ressource prix;
    /**
     * le niveau du batiment
     */
    private int niveau;
    /**
     * le nom du batiment
     */
    private String nom;
    
    public Batiment(String nom, Ressource prix){
        this.nom = nom;
        this.prix = prix;
        
    }
    
}
