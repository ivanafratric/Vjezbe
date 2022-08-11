package vjezbanje;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak03 {
	
	public static void main(String[] args) {
		
		int x,y,i,j=0;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Unesi x"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Unesi y"));
		
		int [][] matrica = new int [x][y];
		
		for(i=0;i<x;i++) {
			for(j=0;j<y;j++) {
				matrica[i][j]=(int)((Math.random()*(9-5))+5);
			}
		}
			
		for(i=0;i<matrica.length;i++) {
			System.out.println(Arrays.toString(matrica[i]));
		}
		
	}

}
