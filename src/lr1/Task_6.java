package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите через пробел своё имя и год рождения" );

        String[] input = scanner.nextLine().split(" ");

        System.out.printf("Уважаемый товарищ %s, ваш возраст: %d",input[0], Integer.parseInt(Year.now().toString()) - Integer.parseInt(input[1]));
    }
}
