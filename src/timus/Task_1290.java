package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task_1290 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n == 0) return;
        int max = 0;
        int[] count = new int[25001];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());
            count[num]++;
            if(num > max) max = num;
        }

        int[] res = new int[max];
        for (int i = max; i > 0; i--) {
            if (count[i] != 0) {
                for (int j = 0; j < i; j++) {
                    res[j] += count[i];
                }
            }
        }
        int max2= res[0];
        int max3 = 0;
        int[] temp = new int[max2+1];
        for (int i = 0; i < max; i++) {
            int num = res[i];
            temp[num] +=1;
            if (num > max3) max3 = num;
        }

        int[] res3 = new int[max3];
        for (int i = max3; i > 0; i--) {
            if (temp[i] != 0) {
                for (int j = 0; j < i; j++) {
                    res3[j] += temp[i];
                }
            }
        }

        for (int i = 0; i < max3; i++) {
            System.out.println(res3[i]);
        }
        reader.close();
    }
}

