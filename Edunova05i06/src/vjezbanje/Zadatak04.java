package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak04 {
	
	public static void main(String[] args) {
		
		int i=0;
		int suma=0;
		
		i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		while(i>0) {
			suma+=i%10;
			i=i/10;
		}
		
		System.out.println(suma);
		
	}

}
