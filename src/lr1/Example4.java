package lr1;

import java.util.Scanner;

public class Example4 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		
		if (scanner.hasNextInt()){
			System.out.println("Your number is " + scanner.nextInt());
		}
		else {
			System.out.println("Your input is not Integer value");
		}
		
		scanner.close();
		
	}
	
}