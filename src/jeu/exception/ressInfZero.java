/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.exception;

/**
 *
 * @author Baptiste
 */
public class ressInfZero extends Exception{
    
    public ressInfZero(){
        System.out.println("Impossible de dépenser plus que les ressources disponibles");
    }
    
}
