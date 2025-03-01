package lr1;

import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;


public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в программу для сложения и вычитания двух чисел!");
        System.out.println("Введите числа, которые хотите сложить/вычесть через пробел: ");
        String[] input = scanner.nextLine().split(" ");
        try{
            System.out.printf("Результат сложения %.2f\n", Stream.of(input).map(Float::parseFloat).reduce((x, y) -> x+y).orElse(0f));
            System.out.printf("Результат вычитания %.2f", Stream.of(input).map(Float::parseFloat).reduce((x, y) -> x-y).orElse(0f));
        }
        catch (Exception ex){
            System.out.printf("'%s' и/или '%s' не является числом", input[0], input[1]);
        }
    }
}


