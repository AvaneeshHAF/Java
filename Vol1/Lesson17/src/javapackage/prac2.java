package javapackage;

public class prac2 {

	public static void main(String[] args) {
		int inches, counter = 0;
		double foot;
		
		
		
		for(inches = 1; inches <= 20; inches = inches+1) {
			
			foot = inches/12.0;
			
			if(inches==1)System.out.println(inches + " inch is equal to " + foot + " feet.");
			
			
			if(inches>1)System.out.println(inches + " inches is equal to " + foot + " feet.");
			
			counter++;
			if(counter == 4) {
				System.out.println();
				counter=0;
			}
			
			
			
			
			
			
			
		}

			
		
			
			

	}

}
