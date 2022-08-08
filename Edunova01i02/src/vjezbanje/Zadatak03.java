package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak03 {

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int rez = i/j;
		
		System.out.println(rez);
		
	}

}
