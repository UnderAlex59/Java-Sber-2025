package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.print("Введите число, которое хотите проверит ьв качестве делителя: ");
        int del = scanner.nextInt();
        System.out.println("\nМассив arr: " + Arrays.toString(arr));

        int[] arr_res = filterNumber(arr, del);

        System.out.println("Отфильтрованный массив: " + Arrays.toString(arr_res));
    }

    public static int[] filterNumber(int[] arr, int del){
        return Arrays.stream(arr).filter(el -> el%del == 0).toArray();
    }
}
