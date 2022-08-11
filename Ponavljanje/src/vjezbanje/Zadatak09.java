package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak09 {
	
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		if (i%2==0) {
			System.out.println(i + " je paran broj");
		} else {
			System.out.println(i + " je neparan broj");
		}
		
	}

}
