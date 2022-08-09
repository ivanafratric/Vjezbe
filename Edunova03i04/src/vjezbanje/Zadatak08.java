package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak08 {

	public static void main(String[] args) {

		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		if (b<10 || b>20) {
			System.out.println("Broj mora biti između 10 i 20");
		} else {
				for(int i=1;i<=b;i++) {
				for(int j=1;j<=b;j++) {
					System.out.printf("%4d", i * j);							
			}
				System.out.println();
		
		}
	}
	}

}

