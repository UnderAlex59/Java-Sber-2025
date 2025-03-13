package timus;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int in = Integer.parseInt(scanner.nextLine());
            if(in == 0) break;
            int[] res = new int[in+1];
            res = MAX(in, 0, res);
            System.out.println(Arrays.stream(res).max().getAsInt());
        }
    }

    static int[] MAX(int n, int iter, int[] res){
        if (iter > n) return res;
        if(iter == 0) {
            res[0] = 0;
            MAX(n,iter+1, res);
        }
        if(iter == 1){
            res[1] = 1;
            MAX(n,iter+1, res);
        }
        if(iter % 2 == 0){
            res[iter] = res[iter/2];
            MAX(n,iter+1, res);
        }
        else {
            res[iter] = res[(iter-1)/2] + res[((iter-1)/2)+1];
            MAX(n,iter+1, res);
        }
        return res;

    }
}
