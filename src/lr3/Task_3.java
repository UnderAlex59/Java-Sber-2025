package lr3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Вводите числа, которые хотите записать в массив по одной штуке через Enter\n" +
                "Для окончания ввода введите любую букву/символ");
        in(scanner, arr);
        System.out.print("Вы ввели следующий массив чисел: [");
        out(arr);
        System.out.print("]");
    }

    public static void in(Scanner scanner, List<Integer> acc){
        if (scanner.hasNextInt()){
            acc.add(scanner.nextInt());
            in(scanner, acc);
        }
        else scanner.close();
    }

    public static void out(List<Integer> arr){
        if (arr.size() > 1){
            System.out.print(arr.getFirst() + ", ");
            out(arr.subList(1, arr.size()));
        }
        else System.out.print(arr.getFirst());
    }
}
