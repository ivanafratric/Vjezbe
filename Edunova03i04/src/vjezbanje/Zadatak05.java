package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak05 {

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		if (i<0 || i>999) {
			System.out.println("Greška");
		} else if (i<10) {
			System.out.println(i);
		} else if (i>=10 && i<100) {
			System.out.println(i/10);
		} else {
			System.out.println(i/100);
		}
		
	}

}
