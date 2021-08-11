package javapackage;

public class Lesson19prac {

	public static void main(String[] args) {
		 double number;
		 double exponent;
		 
		 exponent = 1;
		 
		 for(exponent=1; exponent <= 20; exponent = exponent + 1) {
			 number=Math.pow(1.25,  exponent);
			 System.out.println("1.25 to the " + exponent + " power is equal to " + number + ".");
			 
		 }
		 

	}

}
