package vjezbanje;

import javax.swing.JOptionPane;

public class DrugiProgram {

	public static void main(String[] args) {

		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int rez = prviBroj + drugiBroj;
		System.out.println(rez);
		
	}

}
