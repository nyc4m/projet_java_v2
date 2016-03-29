/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.Elements;

/**
 *
 * @author Baptiste
 */
public class Liste {

    /**
     * Le premier élément de la liste
     */
    private ElementHeros premier;
    /**
     * Le dernier élément de la liste
     */
    private ElementHeros dernier;

    public Liste() {
        this.premier = null;
        this.dernier = null;
    }

    /**
     * Méthode permettant de tester que la liste est vide
     *
     * @return Retourn vrai si la liste est vide, faux si la liste contient au
     * moins un élément.
     */
    public boolean estVide() {
        boolean res;
        if ((this.premier == null) && (this.dernier == null)) {
            res = true;
        } else {
            res = false;
        }
        return res;

    }

    /**
     * ajoute un heros à la fin de la liste
     *
     * @param heros le héros à ajouter
     */
    public void ajouterElement(ElementHeros heros) {
        if (this.estVide()) {
            this.premier = heros;
            this.premier.relier(null);
            this.dernier = heros;
        } else {
            this.dernier.relier(heros);
            this.dernier = heros;
        }
    }

    /**
     * Permet d'obtenir le nombre d'élément dans la liste
     *
     * @return Retourn le nombre d'élément trouvé
     */
    public int nbElement() {
        ElementHeros heros;
        int nbElement = 0;
        heros = this.premier;

        while (heros != null) {
            nbElement++;
            heros = heros.getSuivant();
        }

        return nbElement;

    }

    /**
     * Permet de supprimer un héros passé en paramètre
     *
     * @param heros le héros à supprimer
     */
    public void supprimerHeros(ElementHeros heros) {

    }

    public ElementHeros getPremier() {
        return premier;
    }

    public ElementHeros getDernier() {
        return dernier;
    }
    
}
