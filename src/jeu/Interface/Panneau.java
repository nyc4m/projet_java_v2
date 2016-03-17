/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Diabolo
 */
public class Panneau extends JPanel {
    
      public void paintComponent(Graphics g){
   /**
    * Image de fond
    * this.getWidth(),this.getHeight(),this va permettre d'étendre l'image sur
    * toute la longueur de la fenêtre
    */
     try {
      Image img = ImageIO.read(new File("menu.jpg"));
      g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),this);
      
    } catch (IOException e) {
      e.printStackTrace();
    }         
     
     Font font = new Font("Courier", Font.BOLD, 20);
    g.setFont(font);
    g.setColor(Color.red);     
   
   /*
    * Faire une division de getWidth et getHeight revient à calculer selon la taille
    de la fenetre l'emplacement du texte, a noter que grâce à cela le texte bouge
    en continu de la taille de la fenetre
    */ 
    g.drawString("THE ULTIMATE RPG", this.getWidth()/4, this.getHeight()/6); 
    g.setColor(Color.black);
    g.drawString("Nouvelle partie", this.getWidth()/9, this.getHeight()/4);
    g.drawString("Continuer", this.getWidth()/9, (int) (this.getHeight()/3.4));
    g.drawString("Quiter", this.getWidth()/9,  this.getHeight()/3); 
    
       
  
                                            }
      
      

    
}
