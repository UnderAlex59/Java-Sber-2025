package lr1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите название дня недели: ");
        String day = scanner.nextLine();
        System.out.println("ведите название текущего месяца ");
        String month = scanner.nextLine();
        System.out.println("ведите текущую дату (номер дня в месяце): ");
        try {
            int day_number = scanner.nextInt();
            if (day_number > 31) throw new Exception();
            System.out.printf("День недели: %s, дата: %s, месяц: %s", day, day_number, month);
        }
        catch (InputMismatchException illegalType){
            System.out.println("Введено значение не являющееся типом int");
        }
        catch (Exception ex){
            System.out.println("В месяце не может быть больше 31 дня");
        }
    }
}
