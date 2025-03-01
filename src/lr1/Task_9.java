package lr1;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
        float acc = 0;
        for(int i = -1; i < 2; i++){
            acc += (num + i);
            System.out.println(num+i);
        }
        System.out.println(Math.pow(acc, 2));
    }
}
