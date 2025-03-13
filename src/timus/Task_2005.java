package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Task_2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            String[] str = reader.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        int two_three_four = arr[0][1]+arr[1][2]+arr[2][3]+arr[3][4];
        int three_two_four = arr[0][2]+arr[2][1]+arr[1][3]+arr[3][4];
        int three_four_two = arr[0][2]+arr[2][3]+arr[3][1]+arr[1][4];
        int four_three_two = arr[0][3]+arr[3][2]+arr[2][1]+arr[1][4];
        int[] res = {two_three_four, three_two_four, three_four_two, four_three_two};
        int min = Arrays.stream(res).min().getAsInt();
        for (int i = 0; i < 4; i++) {
            if(res[i] == min){
                System.out.println(min);
                if (i ==0) System.out.println("1 2 3 4 5");
                if (i ==1) System.out.println("1 3 2 4 5");
                if (i ==2) System.out.println("1 3 4 2 5");
                if (i ==3) System.out.println("1 4 3 2 5");
                break;
            }
        }
        reader.close();
    }
}
