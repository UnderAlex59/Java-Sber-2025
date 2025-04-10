package lr4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int[][] matrix = new int [5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = random.nextInt(0, 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        try{

            int i = scanner.nextInt();

            for (int j = 0; j < 5; j++) {
                System.out.println(matrix[j][i]);
            }
        }
        catch(InputMismatchException ex1){
            System.out.println("Ввод строки вместо числа");
        }
        catch(ArrayIndexOutOfBoundsException ex2){
            System.out.println("Нет столбца с таким номером");
        }
        finally {
            scanner.close();
        }

    }
}
