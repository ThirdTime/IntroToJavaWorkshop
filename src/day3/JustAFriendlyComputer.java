package day3;

import javax.swing.JOptionPane;

public class JustAFriendlyComputer {
public static void main(String[] args) {
	
	String age = JOptionPane.showInputDialog("How old are you?");
	String address = JOptionPane.showInputDialog("What is your address?");
	String family = JOptionPane.showInputDialog("How many people do you live with?");
	//here's where it get creepy
	JOptionPane.showMessageDialog(null, "I know that you are " + age +" years old, you live at " + address +" and you live with " + family +" people. It's not smart to give out your personal information. If I were not a friendly computer..." );
	JOptionPane.showMessageDialog(null, "YOU'D BE DEAD ALREADY.");
}
}
