package lr8.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Excel_reader {
    public static void main(String[] args) throws IOException {

        String filePath = "D:\\Java-Sber-2025\\src\\lr8\\Excel\\Excel_writer_ex.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheet("Товары");

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }

        workbook.close();
        inputStream.close();
    }
}

