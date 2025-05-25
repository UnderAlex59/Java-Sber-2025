package lr7;

import java.io.*;

public class Example3_2 {
    public static void main(String[] args) {
        String fileName = "src/lr7/example3_file.txt";
        String data;
        String stopString = "/q";
        System.out.println("Введите текст, который хотите записать в файл:\nДля прекращения ввода введите '" + stopString +"'");
        try (FileWriter writer = new FileWriter(fileName);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while(!(data = bufferedReader.readLine()).equals(stopString)){
                writer.write(data + "\n");
            }
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileReader reader = new FileReader(fileName)) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
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
