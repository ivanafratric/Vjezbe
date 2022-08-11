package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak08 {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int suma = a+b;
		
		if(suma>=10) {
			System.out.println("Osijek");
		}else {
			System.out.println("Edunova");
		}
		
	}

}
