package lr2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите текст для шифрования");
        Scanner scanner = new Scanner(System.in);
        char[] text = scanner.nextLine().toCharArray();
        System.out.println("Введите ключ для шифрования");
        int key = Integer.parseInt(scanner.nextLine());
        doCesar(text,key);
        System.out.println("Текст после преобразования: " + String.valueOf(text));
        while(true){
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")){
                System.out.println("До свидания!");
                break;
            }
            else if (answer.equalsIgnoreCase("y")) {
                System.out.println("Результат обратного преобразования: " + String.valueOf(doCesar(text, -key)));
                break;
            }
            else System.out.println("Введите корректный ответ");
        }
        scanner.close();

    }

    public static char[] doCesar(char[] text, int key){
        for (int i = 0; i < text.length; i++) {
            char c = text[i];
            int min, max;
            //Предполагается, что шифруем только буквы алфавита
            if (c >= 'A' && c <= 'Z'){
                min = 'A';
                max = 'Z';
            }
            else if (c >= 'a' && c <= 'z'){
                min = 'a';
                max = 'z';
            }
            else if (c >= 'А' && c <= 'Я'){
                min = 'А';
                max = 'Я';
            }
            else if (c >= 'а' && c <= 'я'){
                min = 'а';
                max = 'я';
            }
            else{
                //Если встретили  обычный символ, то пропустим его
                continue;
            }
            if (c + key <= max && c + key >= min) text[i] = (char)(c+key);
            else if (c+key > max){
                text[i] = (char)(min - 1 + (c+key-max));
            }
            else if (c+key < min){
                text[i] = (char)(max + 1 - (min-c-key));
            }

        }
        return text;
    }
}
