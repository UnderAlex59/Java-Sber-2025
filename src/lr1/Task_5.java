package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год своего рождения: ");

        int year = scanner.nextInt();

        System.out.printf("Ваш возраст: %d", Integer.parseInt(Year.now().toString()) - year);
    }
}
