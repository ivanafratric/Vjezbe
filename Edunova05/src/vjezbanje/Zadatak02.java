package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak02 {
	
	public static void main(String[] args) {
		
		int i=0;
		int suma=0;
		
		while(i!=-1) {
			i = Integer.parseInt(JOptionPane.showInputDialog("broj"));
			suma+=i;
		}
		
		System.out.println(suma+1);		
	}

}
