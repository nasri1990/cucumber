package exercices;

public class SumOf {
	/*
	 * sumOf (15) ------- > 60
sumOf (10) ------- > 33
sumOf (3) ------- > 3
sumOf (5) ------- > 8
sumOf (8) ------- > 14

	 * 
	 * */

	public static void main(String[] args) {
		SumOf obj = new SumOf();
		
	System.out.println("sumOf (15) is : "+obj.sumOf(15));
	System.out.println("sumOf (10) is : "+obj.sumOf(10));
	System.out.println("sumOf (3) is : "+obj.sumOf(3));
	System.out.println("sumOf (5) is : "+obj.sumOf(5));
	System.out.println("sumOf (8) is : "+obj.sumOf(8));
		

	}
	
	public int  sumOf(int numValue) {
		int  sum=0  ;
		for(int i = 0; i<=numValue; i++)
		{
			
			if(i%3==0 || i%5==0)
			{
				 sum+= i;
			}
			
			
		}
		return sum;
		
	
		
		
		
		
	}

}
