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
import jeu.exception.moralInfZero;
import jeu.exception.ressInfZero;
import jeu.exception.vieInfZero;

/**
 *
 * @author Baptiste
 */
public class Classe2Test {

    public static void main(String[] args) throws vieInfZero, moralInfZero {
        Liste liste = new Liste();
        Heros trunks = new Heros("Trunks", "Un guerrier");
        System.out.println(trunks);
        trunks.enleverPv(99);
        liste.ajouterElement(trunks.HerosToElement());
        System.out.println(liste);
        Heros trunks2 = liste.ElementToHeros(new ElementHeros("Trunks", "RAS"));
        trunks2.enleverPv(1);
        System.out.println(trunks2);
    }
}
