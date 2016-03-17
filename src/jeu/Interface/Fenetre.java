/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.Interface;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Diabolo
 */
public class Fenetre extends JFrame {
    
    private JFrame fen;
    private Panneau pan = new Panneau();

    public Fenetre() {
        fen = new JFrame();
        fen.setTitle("The ultimate game");
        fen.setSize(600, 600);
        fen.setContentPane(pan);
        ImageIcon img = new ImageIcon("logo.JPG");
        fen.setIconImage(img.getImage());        
        fen.setVisible(true);
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
                     }    
}
