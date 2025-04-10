package timus;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] res = new int[3];

        String str;
        for (int i = 0; i < n+1; i++) {
            str = scanner.nextLine().split(" ")[0];
            if (str.equals("Emperor")) res[0] += 1;
            if (str.equals("Little")) res[1] += 1;
            if (str.equals("Macaroni")) res[2] += 1;
        }
        int max = Arrays.stream(res).max().getAsInt();
        if (res[0] == max) System.out.println("Emperor Penguin");
        if (res[1] == max) System.out.println("Little Penguin");
        if (res[2] == max) System.out.println("Macaroni Penguin");

        scanner.close();
    }
}
