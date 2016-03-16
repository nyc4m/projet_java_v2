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
public class nivInf extends Exception{
    
    public nivInf(){
        System.out.println("Le nouveau niveau est inférieur au précédent");
    }
    
}
