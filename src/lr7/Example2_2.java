package lr7;

import java.io.*;

public class Example2_2 {
    public static void main(String[] args) {
        String fileName = "src/lr7/example2_file.txt";
        String data;
        String stopString = "/q";
        System.out.println("Введите текст, который хотите записать в файл:\nДля прекращения ввода введите '" + stopString +"'");
        try (FileOutputStream outputStream = new FileOutputStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(data = bufferedReader.readLine()).equals(stopString)){
                outputStream.write((data+"\n").getBytes());
            }
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        if (new File(fileName).delete()) {
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}