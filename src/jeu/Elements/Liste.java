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
     * Cherche un héros, et donne son rang
     *
     * @param heros
     * @return retourne la position du héros dans la liste
     */
    public int rechercher(Heros heros) throws Exception {
        boolean termine = false;
        int rang = 1;
        int nbElement = this.nbElement();
        ElementHeros pointeur;
        pointeur = this.premier;
        while (!termine) {
            if (pointeur.getNom().equals(heros.getNom())) {
                termine = true;
            } else {
                rang++;
                pointeur = pointeur.getSuivant();
                if (rang > nbElement) {
                    throw new Exception("Héros inexistant dans cette liste");
                }

            }

        }
        return rang;
    }

    /**
     * Permet de supprimer un héros passé en paramètre
     *
     * @param heros le héros à supprimer
     */
    public void supprimerHeros(ElementHeros heros) {
        ElementHeros pointeur = this.premier;
        try {
            int rang = rechercher(heros);
            if (rang == 1) {
                this.supprimerPremier();
            } else if (rang == this.nbElement()) {
                this.supprimerDernier();
            } else {
                for(int i = 1 ; i < rang-1; i++){
                    pointeur = pointeur.getSuivant();
                }
                pointeur.relier(pointeur.getSuivant().getSuivant());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " " + "\"" + heros.getNom() + "\"");
            System.out.println("");
        }

    }

    /**
     * Methode supprimant le premier element de la liste
     */
    public void supprimerPremier() {
        this.premier = this.premier.getSuivant();
    }

    /**
     * Methode supprimant le premier element de la liste
     */
    public void supprimerDernier() {
        ElementHeros pointeur;
        pointeur = this.premier;
        while (pointeur.getSuivant() != this.dernier) {
            pointeur = pointeur.getSuivant();
        }
        pointeur.relier(null);
        this.dernier = pointeur;

    }

    public ElementHeros getPremier() {
        return premier;
    }

    public ElementHeros getDernier() {
        return dernier;
    }

    public String toString() {
        String str = "";
        ElementHeros pointeur = this.premier;
        while (pointeur != null) {
            str += pointeur.toString();
            str += "\n";
            pointeur = pointeur.getSuivant();
        }
        return str;
    }

}
