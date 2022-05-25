package javaproject;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Milktea.MilkTeaMenu;

public class menu_choices {

	JFrame OptionPane;

	int choice;
        
       public static int cost; 
        


	menu_choices() {
            
            

		JFrame optionpane = new JFrame();

		do {
			choice = Integer.parseInt(JOptionPane.showInputDialog(null, "\tMenu Choices \n" + "[1] MilkTea" + "\n [2] Fresh Tea" + "\n [3] Smoothie" + "\nChoose [1 - 3]: "));

			switch (choice)

			{
			case 1: 
                            
				 new MilkTeaMenu();
                                
				break;
				
				
			case 2: 
				
				break;
				
				
			case 3: 
				
				break;
				
				
			default: 
				JOptionPane.showMessageDialog(null, "WRONG INPUT", "Warning Message!!!", JOptionPane.WARNING_MESSAGE);
				new menu_choices();
			}
		} while (choice < 3);

	}
        
      
}
