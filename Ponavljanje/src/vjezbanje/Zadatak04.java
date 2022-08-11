package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak04 {
	
	public static void main(String[] args) {
		
		float a = Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi broj"));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Unesi drugi broj"));
		float c = Float.parseFloat(JOptionPane.showInputDialog("Unesi treći broj"));
		
		System.out.println(a*c-b);
		
	}

}
