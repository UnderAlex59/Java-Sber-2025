package timus;

import java.util.Scanner;

public class Task_2100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 2;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            if(scanner.nextLine().contains("+")){
                count += 2;
            }
            else count++;
        }
        System.out.println(count == 13 ? (count+1)*100 : count * 100);
    }
}
