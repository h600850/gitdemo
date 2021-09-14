package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
 
	static int factorial (int n) {
		if (n == 0)
			return 1;
		
		else 
			return (n*factorial(n-1));
	}
	
	public static void main(String args[]) {
		
		String fakultet = showInputDialog("Nummer");
		int number = Integer.parseInt(fakultet);
		int fact=1;
		
		fact=factorial(number);
		showMessageDialog(null,"Fakultet av" + number + "er" + fact);
		
	}
}