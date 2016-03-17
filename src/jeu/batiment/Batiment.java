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

    /**
     * Constructeur du batiment
     *
     * @param nom Contient le nom du batiment
     * @param prix contient le prix du batiment
     */
    public Batiment(String nom, Ressource prix) {
        this.nom = nom;
        this.prix = prix;

    }

    /**
     * Methode permettant au joueur d'acheter un niveau
     *
     * @param ressJ Contient les ressources du joueur.
     * @return
     */
    public boolean acheterNiveau(Ressource ressJ) {
        boolean valide = true;
        try {
            ressJ.setOr(ressJ.getOr() - this.prix.getOr());
            ressJ.setBois(ressJ.getBois() - this.prix.getBois());
            ressJ.setPierre(ressJ.getPierre() - this.prix.getPierre());

        } catch (ressInfZero e) {
            valide = false;

        }

        return valide;
    }
////////////// SET /////////////////////

    /**
     * Permet de modifier le niveau du batiment
     *
     * @param niveau le nouveau niveau à attribeur
     * @throws nivInf Une exception est levée si le nouveau niveau est inférieur
     * au niveau actuel
     */
    public void setNiveau(int niveau) throws nivInf {
        if (this.niveau > niveau) {
            throw new nivInf();
        }
        this.niveau = niveau;
    }

    /**
     * Permet d'incrémenter le niveau dans le cadre d'un achat de niveau.
     *
     * @param ressJ Les ressources à débiter.
     */
    public void augmenterNiveau(Ressource ressJ) {
        if (this.acheterNiveau(ressJ)) {
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

}
