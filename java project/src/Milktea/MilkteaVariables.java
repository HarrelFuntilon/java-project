package Milktea;

import javax.swing.JOptionPane;

public class MilkteaVariables {

    private static int wallet;
    int choice;

    void getWallet(int wallet) {
        this.wallet = wallet;
        System.out.println("Total Milktea Cost: " + wallet);
    }

    void getChoice(int choice) {
        this.choice = choice;
    }

    public static int balance(int wallet) {

        System.out.println("MilkTea Variables: " + MilkteaVariables.wallet);
       
        return MilkteaVariables.wallet;
        
    }

}
