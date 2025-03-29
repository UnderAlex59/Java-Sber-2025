package lr3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.print("Введите целое число в 10 системе счисления, которое хотите преобразовать в двоичную систему: ");
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        List<Integer> res = new ArrayList<>();
        negative_binary(val, res);
        if (val < 0){
            System.out.println("Представление отрицательного числа" + val + " в дополнительном коде: " + res);
        }
        else System.out.println("Представление неотрицательного числа" + val + " в дополнительном коде: " + res);
        scanner.close();
    }

    public static void binary(int x, List<Integer> acc){
        if (x > 1){
            binary(x/2, acc);
            acc.add(x%2);
        }
        else acc.add(x);
    }
    //Функция представляет неотрицательные числа, как обычно, а отрицательные числа в дополнительном коде
    public static void negative_binary(int x, List<Integer> acc){
        if (x >= 0){
            binary(x, acc);
            acc.addFirst(0);
        }
        else{
            binary(-x, acc);
            acc.addFirst(0);
            for (int i = 0; i < acc.size(); i++){
                acc.set(i, acc.get(i) == 1 ? 0:1);
            }
        }
    }
}
