package lr1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String lastName = scanner.nextLine();
        System.out.println("Введите имя: ");
        String firstName = scanner.nextLine();
        System.out.println("Введите отчество: ");
        String middleName = scanner.nextLine();
        System.out.printf("Hello %s %s %s", lastName, firstName, middleName);
    }
}
