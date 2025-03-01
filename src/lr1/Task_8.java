package lr1;

import java.util.Scanner;
import java.util.stream.Stream;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро подаловать в программу для сложения двух чисел!\nВведите числа, которые хотите сложить через пробел: ");
        String[] input = scanner.nextLine().split(" ");
        try{
            System.out.printf("Результат сложения %f", Stream.of(input).map(Float::parseFloat).reduce((x,y) -> x+y).orElse(0f));
        }
        catch (Exception ex){
            System.out.printf("'%s' и/или '%s' не является числом", input[0], input[1]);
        }
    }
}
