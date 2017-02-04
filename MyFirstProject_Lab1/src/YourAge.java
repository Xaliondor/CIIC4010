//Converts age in months to age in years and months

import java.util.Scanner;
public class YourAge 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
			
			double inputage,
				ageyear,
				agemonth,
				ageyeardec,
				dec;
			
			System.out.print("Enter age in months : ");
			inputage = keyboard.nextInt();
			
			ageyeardec = inputage/12;
			ageyear = Math.floor(ageyeardec);
			dec = ageyeardec - ageyear;
			agemonth = dec*12;
			
			System.out.println("Your Age in Year and Months is: " + ageyear + " Years and " + agemonth + " Months");		
	}
}
