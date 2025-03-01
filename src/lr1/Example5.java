package lr1;

import java.util.Scanner;

public class Example5 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите имя: ");
		String name = scanner.nextLine();
		
		System.out.println("Введите возраст: ");
		int age = scanner.nextInt();
		
		System.out.println("Введите рост: ");
		float height = scanner.nextFloat();

		System.out.printf("Имя: %s, Возраст: %d, Рост: %.2f", name, age, height);
        scanner.close();

		
	}
	
}