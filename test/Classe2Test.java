/**
 * Classe de test
 * Doit être utilisée pour tester les fonctionnalitées du jeu.
 */
import jeu.Interface.Fenetre;
import jeu.batiment.Batiment;
import jeu.ressource.Ressource;
import jeu.exception.ressInfZero;

/**
 *
 * @author Baptiste
 */
public class Classe2Test {

    public static void main(String[] args) {
        Batiment batTest = new Batiment("Test", new Ressource(20,10,10));
        Ressource ressTest = new Ressource(15,15,15);
        
        batTest.augmenterNiveau(ressTest);
        System.out.println(ressTest.toString());
    }
}
