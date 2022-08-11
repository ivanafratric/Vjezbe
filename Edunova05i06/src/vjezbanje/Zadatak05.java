package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak05 {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int min = a < b ? a : b;
		int max = a > b ? a : b;
		
		boolean prim;
		for (int i=min;i<=max;i++) {
			
			prim = true;
			for (int c=2;c<i;c++) {
				if (i%c==0) {
					prim = false;
					break;
				}
			}
			
			if(prim) {
				System.out.println(i);
			}
		}
				
		
	}

}
