package timus;

import java.util.Scanner;

public class Task_1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int res = 0;
        int N = scanner.nextInt();
        if (N >= 1){
            for (int i = 1; i <= N; i++) {
                res+=i;
            }
        }
        else {
            for (int i = 1; i >= N ; i--) {
                res += i;
            }
        }
        System.out.println(res);

    }
}
