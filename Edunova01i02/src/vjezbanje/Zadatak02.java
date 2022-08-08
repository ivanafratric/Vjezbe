package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak02 {

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi dvoznamenkasti broj"));
		
		int rez = i%10;
		System.out.println(rez);
		
	}

}
