package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст" );

        int age = scanner.nextInt();

        System.out.printf("Предположительно вы родились в %d году", Integer.parseInt(Year.now().toString()) - age);
    }
}
