package lr2;
import java.util.*;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер желаемого массива");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        int min_val = Arrays.stream(arr).min().orElse(-1);
        if(min_val == -1) System.out.println("Что-то пошло не так...");
        else{
            List<Integer> min_val_id = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (arr[i] == min_val) min_val_id.add(i);
            }
            System.out.printf("Минимальное значение в массиве: %s\n", min_val);
            if(min_val_id.size() == 1) System.out.printf("Минимальное значение расположено на позиции %d\n",min_val_id.get(0));
            else System.out.printf("Минимальные значения расположены на позициях %s",min_val_id.toString());
        }
        scanner.close();
    }
}
