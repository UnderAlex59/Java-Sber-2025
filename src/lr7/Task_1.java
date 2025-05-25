package lr7;

import java.io.*;

public class Task_1 {
    public static void main(String[] args) {
        File file = new File("src/lr7/input5.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            System.out.println("Количество строк в файле " + file.getName() + ": " + bufferedReader.lines().count());
        }
        catch (IOException e){
            System.out.println("Не удалось прочитать файл:" + e.getMessage());
        }
    }
}
