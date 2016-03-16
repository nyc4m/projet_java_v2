/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import jeu.ressource.Ressource;
 import jeu.exception.ressInfZero;
/**
 *
 * @author Baptiste
 */
public class Classe2Test {
    public static void main(String[] args){
        Ressource testRess = new Ressource(10, 15, 15);
        try{
        testRess.setBois(-20);
        }catch(ressInfZero e){
            
        }
        System.out.println(testRess.getBois());
        try{
            testRess.setBois(-1);
            System.out.println(testRess.getBois());
        }catch(ressInfZero e){
            
        }
    }
}
