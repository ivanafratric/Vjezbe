package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak13 {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		if (a%2==0 && b%2==0) {
			System.out.println(a+b);
		} else {
			System.out.println(a-b);
		}
		
	}

}
