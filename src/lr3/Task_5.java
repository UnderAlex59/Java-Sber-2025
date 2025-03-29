package lr3;

import java.util.HashMap;
import java.util.Map;

public class Task_5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Дон");
        map.put(1, "Екатеринбург");
        map.put(2, "Казань");
        map.put(3, "Новгород");
        map.put(4, "Рязань");
        map.put(5, "Саратов");
        map.put(6, "Сыктывкар");
        map.put(7, "Петербург");
        map.put(8, "Рим");
        map.put(9, "Лань");
        System.out.println("Строки у которых ключ больше 5: ");
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            if (entry.getKey() > 5){
                System.out.printf("Ключт - %d, строка - \"%s\"\n", entry.getKey(), entry.getValue());
            }
        }
        System.out.printf("Строка \"%s\" имеет ключ 0\n", map.get(0));


        int res = 1;
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            if (entry.getValue().length() > 5){
                res *= entry.getKey();
            }
        }
        System.out.printf("Произведение всех ключей, где длина строки больше 5, равно %d", res);

    }
}
