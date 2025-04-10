package lr4;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        try{
            for (int i = 0; i < 5; i++) {
                int temp = Integer.parseInt(scanner.nextLine());
                if (temp > 0){
                    arr.add(temp);
                }
            }
            int sum = arr.stream().reduce((x,y) -> x+y).get();
            System.out.println("Среднее значение всех положительных введенных чисел: " + sum/arr.size());
        }
        catch (NumberFormatException ex){
            System.out.println("Ввод строки вместо числа или несоответствие числового типа данных");
        }
        catch(NoSuchElementException ex2){
            System.out.println("Положительные элементы отсутствуют");
        }
        finally {
            scanner.close();
        }



    }
}
