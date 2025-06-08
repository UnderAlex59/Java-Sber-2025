package lr8.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Excel_reader_dop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean retry = true;

        while (retry) {
            System.out.print("Введите путь к файлу (или нажмите Enter для использования пути по умолчанию): ");
            String userPath = scanner.nextLine().trim();
            String filePath = userPath.isEmpty() ?
                    "D:\\Java-Sber-2025\\src\\lr8\\Excel\\Excel_writer_ex.xlsx" :
                    userPath;

            try (FileInputStream inputStream = new FileInputStream(filePath);
                 XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

                XSSFSheet sheet = workbook.getSheet("Товары");
                if (sheet == null) {
                    System.err.println("Лист с именем 'Товары' не найден в файле.");
                    System.out.println("Доступные листы:");
                    for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                        System.out.println("  - " + workbook.getSheetName(i));
                    }
                    throw new IOException("Запрошенный лист не найден.");
                }

                System.out.println("Содержимое листа 'Товары':");
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }

                retry = false;

            } catch (IOException e) {
                System.err.println("Ошибка при работе с файлом: " + e.getMessage());
                System.out.println("Рекомендации:");
                System.out.println("  - Проверьте, что файл существует и путь указан верно.");
                System.out.println("  - Убедитесь, что файл не открыт в другой программе.");
                System.out.println("  - Проверьте, что файл имеет формат .xlsx.");
                System.out.println("  - Проверьте наличие листа с именем 'Товары'.");

                System.out.print("\nХотите повторить попытку? (y/n): ");
                String answer = scanner.nextLine().trim().toLowerCase();
                if (!answer.equals("y")) {
                    retry = false;
                }
            }
        }
        scanner.close();
        System.out.println("Программа завершена.");
    }
}
