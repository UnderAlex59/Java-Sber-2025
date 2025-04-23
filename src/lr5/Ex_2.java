package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массивов: ");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(50);
            arr2[i] = random.nextInt(50);
        }
        System.out.println("\nМассив arr1: " + Arrays.toString(arr1));
        System.out.println("\nМассив arr2: " + Arrays.toString(arr2));

        int[] arr_res = arrIntersection(arr1, arr2);

        System.out.println("Отфильтрованный массив: " + Arrays.toString(arr_res));
    }

    public static int[] arrIntersection(int[] arr1, int[] arr2){
        return Arrays.stream(arr1)
                .filter(el -> Arrays.stream(arr2)
                        .anyMatch(el2 -> el == el2))
                .toArray();
    }
}
