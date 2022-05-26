/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Milktea;

import javax.swing.JOptionPane;

public class Wintermelon {

    MilkTeaMenu menu = new MilkTeaMenu();
    MilkteaVariables mv = new MilkteaVariables();

    int qty = 0;
    int choice;

    Wintermelon() {

        System.out.print("Hello + " + choice);
        setValue();

    }

    void setValue() {

        this.choice = mv.choice;
        System.out.print("Your choice is " + choice);

    }

}
