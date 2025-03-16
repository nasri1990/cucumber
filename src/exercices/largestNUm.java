package exercices;

public class largestNUm {

	public static void main(String[] args) {
		/*
		 * getLargest (1, 22, 3) → 22
getLargest (1, 3, 2) → 3
getLargest (33, 2, 1) → 33

		 * */
		
		largestNUm obj1 = new  largestNUm();
		System.out.println("getLargest (1, 22, 3) : "+obj1.Largest(1, 22, 3));
		System.out.println("Largest(1, 3, 2) : "+obj1.Largest(1, 3, 2));
		System.out.println("Largest(33, 2, 1) : "+obj1.Largest(33, 2, 1));

	}
	public int Largest(int a, int b, int c) {
		if(a>b && a>c )
			
		return a;
		
		 else if (b>c )
		return b;
		else 
			return c;
		
		
	}

}
