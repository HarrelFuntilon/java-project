package Milktea;

import javax.swing.JOptionPane;

public class MilkteaVariables {

    private static int wallet;
    int choice;

    void getWallet(int wallet) {
        this.wallet = wallet;
        System.out.println("Over all balance: " + wallet);
    }

    void getChoice(int choice) {
        this.choice = choice;
    }

    public static void balance(int wallet) {

        JOptionPane.showMessageDialog(null, "Your Current Balance is: " + MilkteaVariables.wallet);
       
        
    }

}
