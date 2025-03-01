package lr1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = scanner.nextLine();
        System.out.printf("Сколько дней в месяце %s ?\n", month);
        try {
            int day_number = scanner.nextInt();
            if (day_number > 31) throw new Exception();
            switch (day_number){
                case 31 :
                    System.out.printf("В месяце %s %d день", month, day_number);
                    break;
                case 28 :
                case 29 :
                case 30 :
                    System.out.printf("В месяце %s %d дней", month, day_number);
                    break;
                default:
                    System.out.println("В месяце не может быть больше 31 дня и меньше 28 дней");
            }
        }
        catch (InputMismatchException illegalType){
            System.out.println("Введено значение не являющееся типом int");
        }
        catch (Exception ex){
            System.out.println("В месяце не может быть больше 31 дня");
        }
    }
}
