package lr5;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex_4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println("Список до преобразования: " + list.toString());
        System.out.println("Список после возведения в квадрат: " + squareList(list).toString());

    }

    public static List<Integer> squareList(List<Integer> list){
        return list.stream().map(el -> el * el).toList();
    }
}
