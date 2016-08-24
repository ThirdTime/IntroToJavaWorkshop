package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {

	String IfThisIsBenYoureADisappointment = JOptionPane.showInputDialog("What's your name, kiddo?");
	
	
	if(IfThisIsBenYoureADisappointment.equals("Ben"))
	{
		JOptionPane.showMessageDialog(null, "You're trash.");
		} else
	{
		JOptionPane.showMessageDialog(null, "Hello, " + IfThisIsBenYoureADisappointment );
	}
	}
}
