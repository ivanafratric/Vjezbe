package vjezbanje;

public class Zadatak16a {
	
	public static void main(String[] args) {
		
		int [] niz = {5,5,8,6,-6,8,-1,0,9,0};
		
		int najmanji = Integer.MAX_VALUE;
		
		for(int i=0;i>niz.length;i++) {
			if(i<najmanji) {
				najmanji=i;
			}
		}
		System.out.println(najmanji);
	}

}
