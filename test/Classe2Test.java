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
        Heros trunks = new Heros("Trunks", "Un guerrier");
        liste.ajouterElement(trunks.HerosToElement());
        System.out.println(liste);
        Heros trunks2 = liste.ElementToHeros(new ElementHeros("Trunks", "RAS"));
        System.out.println(trunks2);
        trunks2.enleverPv(100);
        System.out.println(trunks2);
    }
}
