package vjezbanje;

public class MathKlasa {
	
	public static void main(String[] args) {
		
		int i=0;
		while(true) {
			i = (int)(Math.random()*100);
			if(i>=1 && i<=10) {
				System.out.println(i);
				break;
			}
		}
		
		int sb = (int)((Math.random()*(10-1))+1);
		System.out.println(sb);
		
		int a=2;
		int b=8;
		int c=50;
		int d=-9;
		
		System.out.println("Max: " + (Math.max(a, c)));
		System.out.println("Min: " + Math.min(d, b));
		System.out.println("Korijen: " + Math.sqrt(a));
		System.out.println("Abs: " + Math.abs(d));
		System.out.println("Nasumičan broj: " + Math.random());		
		
	}

}
