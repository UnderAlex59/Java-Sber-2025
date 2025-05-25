package lr7;

import java.io.*;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data;
        Integer count = 0;
        System.out.println("Введите путь к файлу, в котором хотите искать слово: ");
        File file = new File(scanner.nextLine());
        if(file.exists()){
            System.out.println("введите слово, которое хотите найти: ");
            String searcString = scanner.nextLine();
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                PrintWriter printWriter = new PrintWriter(System.out)){
                while((data = bufferedReader.readLine()) != null){
                    if (data.contains(searcString)){
                        printWriter.println(data);
                        count++;
                    }
                }
                printWriter.println(count > 0 ? "Всего строк с искомым словом: " + count : "Совпадений не найдено");
            }
            catch (IOException e){
                System.out.println("Проблемы при работе с файлом: " + e.getMessage());
            }
        } else System.out.println("Файл " + file.getName() + " не найден");
    }
}
