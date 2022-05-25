package javaproject;

import javax.swing.JFrame;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MilkTeaDraft {

    JFrame OptionPane;

    Scanner sc = new Scanner(System.in);

    //Milktea Variables Declaration
    int[] milkTeaQty = {50, 50, 50};
    //MilkTea Cups
    int Pillar = 65, Classic = 75, Grande = 99;

    int qty = 0, trans, prdChoice;

    //WALLET 
    int cost = 0, mlkWallet;

    
    MilkTeaDraft() {

    this.mlkWallet = mlkWallet;
   
        do {

            trans = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                       MilkTea Menu Choice 
                                                                        [1] Winter Melon
                                                                        [2]Oreo Cheesecake
                                                                        [3] Salted Caramel                                                                      
                                                                       Choose [1-3]: """));

            switch (trans) {

                case 1 ->
                    WinterMelon();

                case 2 -> {
                    Oreo();
                }

                case 3 -> {
                }

            }

        } while (trans <= 3);

    }

    void order() {

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n"
                + "[1] Pillar " + Pillar
                + "\n[2] Classic " + Classic
                + "\n[3] Salted Caramel " + Grande
                + "\n[4] Go Back to Milktea Menu"
                + "\n"
                + "Choose [1-3]: "));

    }

    void WinterMelon() {

        order();
        qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\n You Chose: Winter Melon \nQuantity: "));
        evaluation();

    }

    void Oreo() {
        order();
        qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\n You Chose: Oreo Cheesecake \nQuantity: "));
        evaluation();
    }
   
    
    
    /*

    void evaluation() {

        do {
            if (prdChoice == 1) {
                mlkWallet = addWallet(Pillar, qty);
                System.out.println("the wallet = " + mlkWallet);
                order();
                
            } else if (prdChoice == 4) {

                System.out.println("the wallet = " + mlkWallet);
                new MilkTeaDraft();
            }
        } while (prdChoice <= 4);
    }

    int addWallet(int a, int b) {

         int c = a * b;

        return c;

    }
    
    */


    int evaluation() {
            
      
        do {

            if (prdChoice == 1) {

                cost = qty * Pillar;

                JOptionPane.showMessageDialog(null, "The cost of your current order is " + cost);

                mlkWallet += cost;

                System.out.println(mlkWallet);
                order();
            } else if (prdChoice == 2) {

                cost = qty * Classic;

                JOptionPane.showMessageDialog(null, "The cost of your current order is " + cost);

                mlkWallet += cost;

                System.out.println(mlkWallet);
                order();

            } else if (prdChoice == 3) {

                cost = qty * Grande;

                JOptionPane.showMessageDialog(null, "The cost of your current order is " + cost);

                mlkWallet += cost;
                System.out.println(mlkWallet);
                order();

            } else if (prdChoice == 4) {

               
                System.out.println("Total : " + mlkWallet);

                new MilkTeaDraft();
                
            }
        } while (prdChoice <= 4);
        return mlkWallet;
        
    }


  
}
