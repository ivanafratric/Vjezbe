package vjezbanje;

public class InkrementDekrement {

	public static void main(String[] args) {

		int i=1;
		
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		
		System.out.println(i--);
		System.out.println(i);
		System.out.println(--i);
		
		int t=2, k=7;
		
		t+=++t -k--; // 3-7=-4, t=-2, k=6
		System.out.println("t= " + t + ", k= " + k);
		
		k=t++; // k=-2, t=-1
		System.out.println("t= " + t + ", k= " + k);
		
		System.out.println(k+t);
	}

}
