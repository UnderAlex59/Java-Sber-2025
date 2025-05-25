package lr7;

import java.io.File;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла, размер которого хотите просмотреть: ");
        File file = new File(scanner.nextLine());
        if (file.exists()){
            System.out.println("Размер файла "+file.getName() + " составляет " + file.length() + " Байт");
        }
        else System.out.println("Файл " + file.getName() + " не найден");
        scanner.close();
    }
}
