package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak10 {
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		if (x>y) {
			System.out.println(x + " je najveći broj");
		} else if (y>x){
			System.out.println(y + " je najveći broj");
		} else {
			System.out.println("Brojevi su jednaki");
		}
		
	}

}
