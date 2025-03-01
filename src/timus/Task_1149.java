package timus;

import java.util.Scanner;

public class Task_1149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(makeSN(n, 1));
    }

    public static String makeAN(int n, int iter){
        if (iter == n) return String.format("sin(%d)",n);
        else if (iter % 2 == 1){
            return String.format("sin(%d-%s)", iter, makeAN(n, iter+1));
        }
        else{
            return String.format("sin(%d+%s)", iter, makeAN(n, iter+1));
        }
    }

    public static String makeSN(int n, int iter){
        if (iter == n){
            return String.format("%s+%d", makeAN(1, 1), n);
        }
        else{
            return String.format("(%s)%s+%d", makeSN(n,iter+1), makeAN(n-iter+1,1), iter);
        }
    }
}
