package lr6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr.add(random.nextInt(100));
        }
        System.out.println(arr);
        System.out.println(findMaxVal(arr));
    }

    public static Integer findMaxVal(List<Integer> arr){
        return arr.parallelStream().max(Integer::compare).get();
    }
}
