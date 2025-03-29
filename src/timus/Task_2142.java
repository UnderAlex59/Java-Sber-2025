package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_2142 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] have_str = bufferedReader.readLine().split(" ");
        String[] need_str = bufferedReader.readLine().split(" ");

        List<Integer> have = new ArrayList<>();
        List<Integer> need = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            have.add(Integer.parseInt(have_str[i]));
            need.add(Integer.parseInt(need_str[i]));
        }
        for (int i = 0; i < 2; i++) {
            if (have.get(i) >= need.get(i)){
                need.set(2, need.get(2) - (have.get(i) - need.get(i)));
                need.set(i, 0);
            }
            else{
                if (have.get(2) >= need.get(i) - have.get(i)){
                    have.set(2, have.get(2) - (need.get(i) - have.get(i)));
                    need.set(i, 0);
                }
                else {
                    System.out.println("There are no miracles in life");
                    return;
                }

            }
        }
        if (have.get(2) >= need.get(2)) System.out.println("It is a kind of magic");
        else System.out.println("There are no miracles in life");
    }
}
