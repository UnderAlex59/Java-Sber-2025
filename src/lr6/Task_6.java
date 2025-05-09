package lr6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_6 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr.add(random.nextInt(100));
        }
        System.out.println(arr);
        System.out.println(sumElemArr(arr));
        System.out.println(arr.stream().reduce(Integer::sum).get());
    }


    public static Integer sumElemArr(List<Integer> arr){
        return arr.parallelStream().reduce(Integer::sum).get();
    }
}
