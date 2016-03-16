/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.exception;

/**
 *
 * @author Diabolo
 */
public class ressInvalide extends Exception {

    
public ressInvalide(){
        System.out.println("Votre réponse ne correspond pas aux choix proposer");
    }
}
