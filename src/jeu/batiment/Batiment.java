/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.batiment;

import jeu.ressource.Ressource;
import jeu.exception.nivInf;
import jeu.exception.ressInfZero;

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

    public Batiment(String nom, Ressource prix) {
        this.nom = nom;
        this.prix = prix;

    }
////////////// SET /////////////////////

    public void setNiveau(int niveau) throws nivInf {
        if (this.niveau > niveau) {
            throw new nivInf();
        }
        this.niveau = niveau;
    }

    public void augmenterNiveau() {
        niveau++;
        try {
            this.prix.setOr(this.prix.getOr() * 2);
        } catch (ressInfZero e) {
        }

        if (prix.getBois() == 0) {
            try {
                this.prix.setBois(10);
            } catch (ressInfZero e) {
            }
        } else {
            try {
                this.prix.setBois(this.prix.getBois() * 2);
            } catch (ressInfZero e) {
            }
        }

        if (this.prix.getPierre() == 0) {
            try {
                this.prix.setPierre(20);
            } catch (ressInfZero e) {

            }

        } else {
            try {
                this.prix.setPierre(this.prix.getPierre() * 2);
            } catch (ressInfZero e) {

            }
        }
        
    }

}
