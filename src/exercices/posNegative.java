package exercices;

public class posNegative {
	/*posNeg (1, -1, false) → true
posNeg (-1, 1, false) → true
posNeg (-4, -5, true) → true

	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		posNegative obj= new posNegative();
	System.out.println("posNeg (1, -1, false) :"+obj.posneg(1, -1, false));
	System.out.println("posNeg (-1, 1, false) :"+obj.posneg(-1, 1, false));
	System.out.println("posNeg (-4, -5, true) :"+obj.posneg(-4, -5, true));

	}
	public boolean posneg(int a, int b, boolean c) {
		if(a<0 && b>0 && c==true )
		{
			return true;
		}
		else if (a>0 && b<0 && c==false)
		{
			return true;
		}
		else if(a<0 && b<0 && c==false)
		{
			return true;
		}
		else
			return false;
		
		
			
		
		
	}

}
