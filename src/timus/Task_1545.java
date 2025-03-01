package timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1545 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            int N = Integer.parseInt(scanner.nextLine());
            List<String> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(scanner.nextLine());
            }
            String symbol = scanner.nextLine();
            arr.stream().filter(x -> x.startsWith(symbol)).forEach(System.out::println);
        }
    }
}
