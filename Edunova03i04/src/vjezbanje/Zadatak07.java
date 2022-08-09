package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak07 {

	public static void main(String[] args) {

		int niz[] = new int[4];
		
		niz[0] = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		niz[1] = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		niz[2] = Integer.parseInt(JOptionPane.showInputDialog("Unesi treći broj"));
		niz[3] = Integer.parseInt(JOptionPane.showInputDialog("Unesi četvrti broj"));
		
		int suma = niz[0] + niz[1] + niz[2] + niz[3];
		System.out.println(suma);
		
	}

}
