package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.print("Введите минимально допустимое значение в массиве: ");
        int mibVal = scanner.nextInt();
        System.out.println("\nМассив arr: " + Arrays.toString(arr));

        int[] arr_res = filterNumber(arr, mibVal);

        System.out.println("Отфильтрованный массив: " + Arrays.toString(arr_res));
    }

    public static int[] filterNumber(int[] arr, int mibVal){
        return Arrays.stream(arr).filter(el -> el > mibVal).toArray();
    }
}
