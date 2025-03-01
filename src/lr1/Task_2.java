package lr1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите ваш возраст: ");
        if (scanner.hasNextInt()){
            int age = scanner.nextInt();
            if (age >= 0){
                System.out.printf("Ваше имя: %s, ваш возраст: %s", name, age);
            }
            else{
                System.out.printf("%s, возраст не может быть меньше 0 лет", name);
            }
        }

    }
}
