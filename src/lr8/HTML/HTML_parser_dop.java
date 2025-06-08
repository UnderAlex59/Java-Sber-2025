package lr8.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class HTML_parser_dop {
    public static void main(String[] args) {
        int maxRetries = 3;
        int retryDelay = 5;

        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            try {
                Document doc = Jsoup.connect("https://ria.ru/").get();

                Elements newsParent = doc
                        .select("#content > div > div:nth-child(2) > div.section__cell > div.section__content > " +
                                "div:nth-child(1) > div:nth-child(5) > div > div > div > div > div.cell-list__list > div");

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/lr8/HTML/news.txt"))) {
                    for (int i = 0; i < newsParent.size(); i++) {
                        String title = newsParent.get(i)
                                .getElementsByClass("cell-list__item-title")
                                .get(0).childNodes().get(0).toString();
                        String time = newsParent.get(i)
                                .getElementsByClass("cell-info__date")
                                .get(0).childNodes().get(0).toString();

                        System.out.println("Тема: " + title);
                        System.out.println("Время: " + time + "\n");

                        writer.write("Тема: " + title + "\nВремя: " + time + "\n\n");
                    }
                    System.out.println("Данные успешно сохранены в файл news.txt");
                } catch (IOException e) {
                    System.err.println("Ошибка при записи в файл: " + e.getMessage());
                }

                break;

            } catch (IOException e) {
                System.err.println("Ошибка при подключении к сайту (попытка " + attempt + " из " + maxRetries + "): " + e.getMessage());
                if (attempt < maxRetries) {
                    try {
                        TimeUnit.SECONDS.sleep(retryDelay);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        System.err.println("Поток прерван: " + ie.getMessage());
                    }
                } else {
                    System.err.println("Не удалось получить данные после " + maxRetries + " попыток.");
                }
            }
        }
    }
}

