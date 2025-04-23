package lr5;

import java.util.List;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "Напишите функцию, Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "которые Начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("Строка после разбиения: ");
        strings.stream().forEach(System.out::println);

        System.out.print("Введите минимально допустимую длину строк: ");
        int substring = scanner.nextInt();

        System.out.println("Строки после фильтрации: ");
        filterLengthString(strings, substring).stream().forEach(System.out::println);
    }

    public static List<String> filterLengthString(List<String> list, int maxLen){
        return list.stream().filter(el -> el.length() > maxLen).toList();
    }
}
