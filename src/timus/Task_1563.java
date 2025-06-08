package timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            if (map.containsKey(name)) map.put(name, map.get(name)+1);
            else map.put(name, 1);
        }
        int res = 0;
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() > 1) res += entry.getValue()-1;
        }
        System.out.println(res);
    }
}
