/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Milktea;

import static Milktea.MilkTeaMenu.wallet;
import javax.swing.JOptionPane;
public class Wintermelon {
    MilkTeaMenu menu = new MilkTeaMenu();
    MilkteaVariables mv = new MilkteaVariables();

    int qty = 0;
    int choice;
    
     Wintermelon() {
    
         
        System.out.print("Hello + " + choice);
        setValue();
        order();
         
    
     }
     
     void setValue (){
       
         this.choice = mv.choice;
         System.out.print("Your choice is " + choice);
               
     }
        
      void order() {
          

        int Pillar = 85;
        int Classic = 90;
        int Grande = 100;


        choice = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                                   "Cup Size Choice\n" + "[1] Pillar " + Pillar 
                                                                   + "\n[2] Classic " + Classic 
                                                                   + "\n[3] Salted Caramel " + Grande 
                                                                   + "\n[4] Go Back to Milktea Menu" + "\n" 
                                                                   + "Choose [1-3]: "));

        if (choice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Pillar Cup " + 
                                                                     "\nQuantity: "));
            wallet = qty * Pillar;
            menu.passValue();       
            

        } else if (choice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup " + 
                                                                     "\nQuantity: "));
            wallet = qty * Classic;
            menu.passValue();       
           

        } else if (choice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup " + 
                                                                     "\n \nQuantity: "));
            wallet = qty * Grande;
            menu.passValue();       
            order();

        } else if (choice == 4) {

        }

    }

     
    }
   
   