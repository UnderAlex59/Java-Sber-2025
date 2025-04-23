package lr5;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "Напишите функцию, Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "которые Начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("Строка после разбиения: ");
        strings.stream().forEach(System.out::println);

        System.out.print("Введите подстроку для поиска: ");
        String substring = scanner.nextLine();

        System.out.println("Строки после фильтрации: ");
        containsSubstring(strings, substring).stream().forEach(System.out::println);
    }

    public static List<String> containsSubstring(List<String> list, String substring){
        return list.stream().filter(el -> el.contains(substring)).toList();
    }
}
