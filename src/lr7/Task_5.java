package lr7;

import java.io.*;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу, в который хотите записать текст: ");
        File file = new File(scanner.nextLine());
        Integer charCount = 0;
            String data;
            String stopString = "/q";
            System.out.println("Введите текст, который хотите записать в файл:\nДля прекращения ввода введите '" + stopString +"'");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
                while(!(data = bufferedReader.readLine()).equals(stopString)){
                    charCount += data.length();
                    writer.write(data+"\n");
                }
                System.out.println("Данные записаны в файл: " + file);
                System.out.println("Всего символов записано: " + charCount);
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
            }
    }
}
