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

/**
 *
 * @author Baptiste
 */
public class Classe2Test {

    public static void main(String[] args) {
        Liste liste = new Liste();
        liste.ajouterElement(new ElementHeros("Fox", "RAS"));
        liste.ajouterElement(new ElementHeros("Goku", "RAS"));
        System.out.println(liste.nbElement());
        System.out.println(liste.getDernier());
        System.out.println(liste.getPremier());
    }
}
