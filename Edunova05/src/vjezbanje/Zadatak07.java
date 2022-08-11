package vjezbanje;

import javax.swing.JOptionPane;

public class Zadatak07 {
	
	public static void main(String[] args) {
		
		String s;
		
		while(true) {
			s=JOptionPane.showInputDialog("Unesi minimalno 3 znaka");
			if(s.length()<3) {
				JOptionPane.showInputDialog("Minimalno 3 znaka");
				continue;
			}
			break;
		}
		System.out.println(s);
		
	}

}
