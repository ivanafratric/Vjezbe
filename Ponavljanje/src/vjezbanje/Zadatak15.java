package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak15 {
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 10 i 20"));
			
		if(x<10 || x>20) {
			System.out.println("Greška");
		} else {		
				for(int i=1;i<=x;i++) {
				for(int j=1;j<=x;j++) {
					System.out.printf("%4d", i * j);
				}
			System.out.println();
		}
							
		}
		
	}
}
