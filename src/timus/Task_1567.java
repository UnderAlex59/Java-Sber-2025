package timus;

import java.util.Scanner;

public class Task_1567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        Integer price = 0;
        for(Character ch: data.toCharArray()){
            if ('a' <= ch && 'z' >= ch){
                price += ch%3 == 0? 3 : ch%3;
            }
            if (ch.equals('.') || ch.equals(' ')) price++;
            if(ch.equals(',')) price += 2;
            if(ch.equals('!')) price += 3;
        }
        System.out.println(price);
    }
}
