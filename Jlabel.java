/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avery
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;

  public class Jlabel extends JPanel {

   

   
   
   
   public JPanel panel;
   public JPanel panel_1;
   public JFrame frame;



   public Jlabel() {

    createMap(10,10);

   }


   public void createMap(int maxX,int maxY) {    

       int [ ][ ] map = new int [maxX][maxY];

      for (int i = 0; i < maxX; i++) {

          for (int j = 0; j < maxY ; j++) {
              map [i][j] = + i + j ;


          JPanel panel = new JPanel();
              add(panel);
              
              panel.setOpaque(true);
              setLayout(new GridLayout(maxX,maxY, 10/5, 1));
              setBackground(Color.GRAY);
              

              System.out.println( map [i][j]); 
          }
      }

    

  }

   private static void Gui() {
      JFrame frame = new JFrame("Grid Test");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setPreferredSize(new Dimension(818, 857));
      frame.getContentPane().add(new Jlabel());
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);     
      frame.pack();


   }
   
   @Override
   public void paintComponent(Graphics g)
   {
       super.paintComponent(g);
       
       BufferedImage background = null;
       
       try
       {
           background = ImageIO.read(new File("SandL.gif"));
       }
       catch (IOException e){
   }
       
       g.drawImage(background, 0, 0, panel);
   }
       
   public static void main(String[] args) { 
            Gui();
         }
      
   

}