package lr4;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte[] arr = new byte[5];

        try{
            for (int i = 0; i < 5; i++) {
                arr[i] = scanner.nextByte();
            }
            byte res = 0;

            for (int i = 0; i < 5; i++) {
                if ((int)res + (int)arr[i] > 126 || (int)res + (int)arr[i] < -127)
                    throw new Exception("Вычисленное значение за границами диапазона типа");
                res += arr[i];
            }
            System.out.println(res);
        }
        catch (InputMismatchException ex){
            System.out.println("Ввод строки вместо числа или ввод значение за границами диапазона типа");
        }
        catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
        finally {
            scanner.close();
        }

    }
}
