package exercices;

public class MonkeyStatus {

	public static void main(String[] args) {
		
		MonkeyStatus obj1 = new MonkeyStatus();
		MonkeyStatus obj2 = new MonkeyStatus();
		MonkeyStatus obj3 = new MonkeyStatus();
		boolean areWeInTrouble1= obj1.monkeyTrouble(true, true);
		boolean areWeInTrouble2= obj2.monkeyTrouble(true, false);
		boolean areWeInTrouble3= obj2.monkeyTrouble(false, false);
	
		System.out.println(" are we in troble :"+areWeInTrouble1);
		System.out.println(" are we in trouble :"+areWeInTrouble2);
		System.out.println("are we in trouble :"+areWeInTrouble3);
	}
	public boolean monkeyTrouble(boolean aSmile ,Boolean bSmile) 
	{
		
		if(aSmile== true && bSmile== true)
		{
			return true ;
			
		}
		else if  (aSmile== false && bSmile== false)
		{
			return true ;
		}
		else
		{
			return false;
		}
		
	}

}
