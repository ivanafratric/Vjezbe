package vjezbanje;

import java.util.Arrays;

public class JednodimenzionalniNizovi {

	public static void main(String[] args) {

		int t1=2;
		int t2=-1;
		//...
		int t12=6;
		
		int[] temp;
		temp = new int[12];
		
		temp[0]=2;
		temp[1]=-1;
		temp[temp.length-1]=6;
		
		System.out.println(Arrays.toString(temp));
		
		int boje[] = new int[4];
		boje[1]=7;
		System.out.println(boje[1]);
		
		int[] vrijednosti = {2,5,8,6,3,4,2,2,3,9,7};
		
		System.out.println(vrijednosti[0] + ", " + vrijednosti[vrijednosti.length-1]);
		
		System.out.println(vrijednosti[0]);
		System.out.println(",");
		System.out.println(vrijednosti[vrijednosti.length-1]);
		
		System.out.println(Arrays.toString(vrijednosti));
		
		}
}
