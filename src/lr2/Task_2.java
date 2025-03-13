package lr2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько строк должно быть в массиве?");
        int line = scanner.nextInt();
        System.out.println("Сколько столбцов должно быт ьв массиве?");
        int column = scanner.nextInt();
        int[][] arr = new int[line][column];
        for (int i = 0; i < line; i++) {
            int j = 0;
            while (j < column){
                if (i%2 == 0) arr[i][j] = column*i+j+1;
                else arr[i][column-1-j] = column*i+j+1;
                j++;
            }
        }
        for (int i = 0; i < line; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        scanner.close();
    }
}
