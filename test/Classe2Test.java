/**
 * Classe de test
 * Doit être utilisée pour tester les fonctionnalitées du jeu.
 */
import jeu.Interface.Fenetre;
import jeu.Elements.Batiment;
import jeu.Elements.ElementHeros;
import jeu.Elements.Heros;
import jeu.Elements.Liste;
import jeu.Elements.Ressource;
import jeu.exception.ressInfZero;
import jeu.exception.vieInfZero;

/**
 *
 * @author Baptiste
 */
public class Classe2Test {

    public static void main(String[] args) {
        Liste liste = new Liste();
        liste.ajouterElement(new ElementHeros("Trunks", "RAS"));
        liste.ajouterElement(new ElementHeros("Goku", "RAS"));
        liste.ajouterElement(new ElementHeros("Vegeta", "RAS"));
        liste.ajouterElement(new ElementHeros("Gohan", "RAS"));
        System.out.println(liste);
        liste.supprimerHeros(new ElementHeros("Trunks", "RAS"));
        liste.supprimerHeros(new ElementHeros("Veget", ""));
        System.out.println(liste.toString());
        System.out.println(liste.getPremier());
        System.out.println(liste.getDernier());
    }
}
