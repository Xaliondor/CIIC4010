//MyComplexNumbers

import java.util.Scanner;
public class MyComplexNumber {
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
			
			double realA,
				realC,
				imgB,
				imgD,
				add,
				mult;
			
			System.out.println("For a+bi and c+di");
			
			System.out.print("Enter a : ");
			realA = keyboard.nextDouble();
			System.out.print("Enter bi : ");
			imgB = keyboard.nextDouble();
			System.out.print("Enter c : ");
			realC = keyboard.nextDouble();
			System.out.print("Enter di : ");
			imgD = keyboard.nextDouble();
			
			add = (realA + imgB) + (realC + imgD);
			
			mult = (realA + imgB)*(realC + imgD);			
			
			System.out.println("The addition of the complex numbers is: " + add);
			System.out.println("The multiplication of the complex numbers is: " + mult);
	}
}
