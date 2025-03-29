package lr3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_6 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long start = System.currentTimeMillis();
        while (arrayList.size() != 1){
            del(arrayList);
        }
        long end = System.currentTimeMillis();
        System.out.println("Время удаления элементов из ArrayList: " + (end-start));
        System.out.println(arrayList);

        start = System.currentTimeMillis();
        while (linkedList.size() != 1){
            del(linkedList);
        }
        end = System.currentTimeMillis();
        System.out.println("Время удаления элементов из LinkedList: " + (end-start));
        System.out.println(linkedList);
    }

    public static void del(List<Integer> arr){
        for (int i = arr.size()%2 == 0 ? arr.size()-1 : arr.size()-2; i >= 0; i-=2) {
            arr.remove(i);
        }
    }
}
