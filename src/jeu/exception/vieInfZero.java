/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.exception;

/**
 *
 * @author Baptiste
 * Exception permettant de ne pas attribuer une vie négative au héros.
 */
public class vieInfZero extends Exception {
    public vieInfZero(){
        System.out.println("Un personnage est mort.");
    }
}
