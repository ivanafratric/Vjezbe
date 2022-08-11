package vjezbanje;

import java.util.Arrays;

public class ForPetlja {
	
	public static void main(String[] args) {
		
		for(int i=0;i<10;i=i+1) {
			System.out.println("Osijek");
		}
		
		for(int i=0;i<10;i+=1) {
			System.out.println(i+1);
		}
		
		for(int i=10;i>0;i=i-1) {
			System.out.println(i);
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		int[] niz = {2,3,2,3,3,2};
		
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
			
		}
		System.out.println(Arrays.toString(niz));
		
		String ime = "Edunova";
		for(int i=0;i<ime.length();i++) {
			System.out.println(ime.charAt(i));
		}
		System.out.println(ime);
		
		int d=10;
		int[][] tablica = new int [d][d];
		for(int i=0;i<d;i++) {
			for(int j=0;j<d;j++) {
				tablica [i][j] = (i+1) * (j+1);
			}
		}
		
		for(int i=0;i<d;i++)
		System.out.println(Arrays.toString(tablica[i]));
		
			
	}

}
