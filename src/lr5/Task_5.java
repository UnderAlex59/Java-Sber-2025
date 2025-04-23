package lr5;

import java.util.List;
import java.util.Scanner;


public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "Напиш1ите функцию, Кото1рая прин1имает на вхо1д спис1ок " +
                "строк и возвр1ащает новый список, Соде1ржащий тольк1о те ст1роки, " +
                "к1оторые Начи1нают1ся с большо1й буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("Строка после разбиения: ");
        strings.stream().forEach(System.out::println);


        System.out.println("Строки после фильтрации: ");
        filterLettersString(strings).stream().forEach(System.out::println);
    }

    public static List<String> filterLettersString(List<String> list){
        return list.stream().filter(el -> {
            return el.chars().filter(Character::isAlphabetic).count() == el.length();
        }).toList();

    }
}
