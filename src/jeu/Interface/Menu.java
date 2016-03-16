package jeu.Interface;


import java.util.Scanner;
import jeu.batiment.*;
import jeu.exception.*;

/**
 *
 * @author Diabolo
 */
public class Menu {
    
public String toString(){
    String s = null ;
    s+="1- Batîment";   
    s+="\n"+"Quitter";
 
    return s ;
}


public void getReponse() throws ressInvalide {
    
   Scanner sc = new Scanner(System.in);
  
   int i = sc.nextInt();
  try {    
  
   switch (i) {
       case 1 : //Batiment() ;
         break;
       case 2 : System.out.println("A plus");
         break;
       default : throw new ressInvalide();
         
              }
  } catch (ressInvalide e) {
           
           }
   }
   
    
    
    
}
      
        
        
        
        
        
        
    
    
