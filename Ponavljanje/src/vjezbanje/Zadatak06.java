package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak06 {
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		System.out.println("Rezultat je: " + (x/y));
		
	}

}
