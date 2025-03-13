package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1644 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int hungry = 2;
        int satisfied = 10;
        for (int i = 0; i < n; i++) {
            String[] str = reader.readLine().split(" ");
            if (str[1].equals("hungry")){
                if (Integer.parseInt(str[0]) > hungry) hungry = Integer.parseInt(str[0]);

            }
            else if (Integer.parseInt(str[0]) < satisfied) satisfied = Integer.parseInt(str[0]);
        }
        if (hungry < satisfied) System.out.println(satisfied);
        else System.out.println("Inconsistent");
        reader.close();
    }
}
