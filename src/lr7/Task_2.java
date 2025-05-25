package lr7;

import java.io.*;

public class Task_2 {
    public static void main(String[] args) {
        File from = new File("src/lr7/input5.txt");
        File to = new File(from.getParent() + "/input5_copy.txt");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(from));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(to))){
            bufferedReader.transferTo(bufferedWriter);
            System.out.println("Содержимое файла " + from.getName() + " успешно скопировано в файл " + to.getName());
        } catch (IOException e){
            System.out.println("Ошибка при взаимодействии с файлом: " + e.getMessage());
        }
    }
}
