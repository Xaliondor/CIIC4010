import java.util.Scanner;

public class StudentNameID {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
				
			int id;
			
			String Name;
				
			System.out.print("Enter your name : ");				
			Name = keyboard.nextLine();
			System.out.print("Enter your ID: ");
			id = keyboard.nextInt();
				
			System.out.println("********************");	
			System.out.println("*                  *");
			System.out.println("*" + Name + "*");
			System.out.println("*                  *");
			System.out.println("*" + id + "*");
			System.out.println("*                  *");
			System.out.println("********************");
	}
}
