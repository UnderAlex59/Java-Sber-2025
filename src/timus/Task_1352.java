package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Task_1352 {
    public static void main(String[] args) {
        // Массив показателей степеней для первых 38 простых чисел Мерсенна
        int[] exponents = {
                2, 3, 5, 7, 13, 17, 19, 31, 61, 89, 107, 127, 521, 607, 1279, 2203, 2281,
                3217, 4253, 4423, 9689, 9941, 11213, 19937, 21701, 23209, 44497, 86243,
                110503, 132049, 216091, 756839, 859433, 1257787, 1398269, 2976221,
                3021377, 6972593, 13466917
        };

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            System.out.println(exponents[N - 1]);
        }
        scanner.close();
    }
}
//Я честно пытался это сделать по человечески, но это выше моих сил (особенно я не знаю, как тут уложиться в 1 секунду)
//Код моих мыслей ниже и доступен на GitHub



//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bufferedReader.readLine());
//        List<Integer> val = new ArrayList<>();
//        Map<Integer, Integer> res = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            val.add(Integer.parseInt(bufferedReader.readLine()));
//        }
//        System.out.println("Пошёл считать");
//        int max_N = Collections.max(val);
//        int i = 0; // количество найденных простых чисел
//        for (int j = 2; i < max_N ; j++){
//            long num = (long) Math.pow(2, j) - 1;
//            long end = (long) Math.sqrt(num)+1;
//            boolean temp = true;
//            for (long k = 2; k <= end; k++) {
//                if (num % k == 0){
//                    temp = false;
//                    break;
//                }
//            }
//            if (temp){
//                i++;
//                if (val.contains(i)) res.put(i, j);
//            }
//        }
//        System.out.println(res);
//        for (Integer el : val){
//            System.out.println(res.get(el));
//        }
//
//
//    }

