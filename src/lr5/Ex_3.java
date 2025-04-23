package lr5;

import java.util.List;

public class Ex_3 {
    public static void main(String[] args) {
        String string = "Напишите функцию, Которая принимает на вход список" +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "которые Начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("Строка после разбиения: ");
        strings.stream().forEach(System.out::println);
        System.out.println("Строки после фильтрации: ");
        filterCapitalizedStrings(strings).stream().forEach(System.out::println);
    }

    public static List<String> filterCapitalizedStrings(List<String> list){
        return list.stream().filter(el -> el.startsWith(String.valueOf(el.toUpperCase().charAt(0)))).toList();
    }
}
