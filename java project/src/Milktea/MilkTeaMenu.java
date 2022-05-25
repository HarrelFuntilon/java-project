package Milktea;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MilkTeaMenu {

    int choice;

    int prdChoice;

    int qty, num;

    public static int wallet;

    MilkteaVariables mc = new MilkteaVariables();


    JFrame Optiopane;

   public MilkTeaMenu() {
       
      

        do {

            choice = Integer.parseInt(JOptionPane.showInputDialog(null, "MilkTea Menu Choice\n"
                    + "					 [1] Winter Melon\n"
                    + "					 [2]Oreo Cheesecake\n"
                    + "					 [3] Salted Caramel\n"
                    + "[4] Check Balance:\n"
                    + "					Choose [1-3]:"));

            switch (choice) {

                case 1 -> {
                    order1();
                }

                case 2 -> {
                    order2();
                }

                case 3 -> {
                    order3();
                }

                case 4 -> {
                    mc.balance();
                }

            }

        } while (choice <= 4);

    }

    void order1() {

        int Pillar = 65;
        int Classic = 75;
        int Grande = 85;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + Pillar
                + "\n[2] Classic " + Classic
                + "\n[3] Grande Cup " + Grande
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Pillar Cup "
                    + "\nQuantity: "));
            wallet = qty * Pillar;
            passValue();
            order1();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                    + "\nQuantity: "));
            wallet = qty * Classic;
            passValue();
            order1();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup "
                    + "\n \nQuantity: "));
            wallet = qty * Grande;
            passValue();
            order1();
        } else if (prdChoice == 4) {
             
            new MilkTeaMenu();
        }

    }

    void order2() {

        int Pillar = 79;
        int Classic = 89;
        int Grande = 99;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + Pillar
                + "\n[2] Classic " + Classic
                + "\n[3] Grande Cup " + Grande
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Oreo Cheesecake + Pillar Cup "
                    + "\nQuantity: "));
            wallet = qty * Pillar;
            passValue();
            order2();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Oreo Cheesecake + Classic Cup "
                    + "\nQuantity: "));
            wallet = qty * Classic;
            passValue();
            order2();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Oreo Cheesecake + Grande Cup "
                    + "\n \nQuantity: "));
            wallet = qty * Grande;
            passValue();
            order2();
        } else if (prdChoice == 4) {

             new MilkTeaMenu();
        }

    }

    void order3() {

        int Pillar = 75;
        int Classic = 85;
        int Grande = 95;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + Pillar
                + "\n[2] Classic " + Classic
                + "\n[3] Grande Cup " + Grande
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Salted Caramel + Pillar Cup "
                    + "\nQuantity: "));
            wallet = qty * Pillar;
            passValue();
            order3();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Salted Caramel + Classic Cup "
                    + "\nQuantity: "));
            wallet = qty * Classic;
            passValue();
            order3();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Salted Caramel + Grande Cup "
                    + "\n \nQuantity: "));
            wallet = qty * Grande;
            passValue();
            order3();
        } else if (prdChoice == 4) {

             new MilkTeaMenu();
        }

    }
    
    void passValue() {

        num = num + wallet;

        System.out.println("\nPassed Num: " + num);
        System.out.println("\nPassed choice: " + choice);

        mc.getWallet(num);
        mc.getChoice(choice);

    }

}
