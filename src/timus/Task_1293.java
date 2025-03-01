package timus;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1293 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print(2 * Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).reduce((x,y) -> x*y).orElse(0));
        scanner.close();
    }
}
