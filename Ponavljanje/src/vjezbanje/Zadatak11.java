package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak11 {
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Unesi treći broj"));
		
		if (x>y && x>z) {
			System.out.println(x + " je najveći broj");
		} else if (y>x && y>z) {
			System.out.println(y+ " je najveći broj");
		} else if (z>x && z>y) {
			System.out.println(z + " je najveći broj");
		} else if (x==y && x==z && z==y) {
			System.out.println ("Brojevi su jednaki");
		} else {
			System.out.println();
		}
		
	}

}
