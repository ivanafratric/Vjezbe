package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak12 {
	
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 999"));
		
		if (i<1 || i>999) {
			System.out.println("Greška");
		} else if (i>100) {
			System.out.println(i/100);
		} else if (i>10) {
			System.out.println(i/10);
		} else {
			System.out.println(i);
		}
		
	}
}
