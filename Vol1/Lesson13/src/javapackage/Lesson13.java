package javapackage;

public class Lesson13 {

	public static void main(String[] args) {
		int num1, num2, num3, num4;
		
		num1=10;
		num2=3;
		num3=5;
		num4=2;
		
		int sum, difference;
		int multiply, divide;
		
		sum=num1+5;
		difference=num3-num2;
		
		
		System.out.println("num1 plus 5 is " + sum + "\nnum3 minus num2 is " + difference);
		
		multiply=num3*num4;
		
		
		System.out.println("\n\nnum3 times num4 is " + multiply);
		
		
		divide=num1/num2;
		System.out.println("num1 divided by num2 is " + divide + "\n\n");

		
		System.out.println("Original value of num1 is" + num1);
		num1=num1*6;
		System.out.println("new value of num1 = " + num1);
	}

}
