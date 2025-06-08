package lr8.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HTML_parser_2 {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://ria.ru/").get();

            Elements newsParent = doc
                    .select("#content > div > div:nth-child(2) > div.section__cell > div.section__content > " +
                            "div:nth-child(1) > div:nth-child(5) > div > div > div > div > div.cell-list__list > div");

            for (int i = 0; i < newsParent.size(); i++) {
                    System.out.println("Тема: " +
                            (newsParent.get(i))
                                    .getElementsByClass("cell-list__item-title")
                                    .get(0).childNodes().get(0));
                    System.out.println("Время: " +
                            (newsParent.get(i))
                                    .getElementsByClass("cell-info__date")
                                    .get(0).childNodes().get(0) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
