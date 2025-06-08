package lr8.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JSON_product {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr8/JSON/JSON_product.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("products");

            for (Object o : jsonArray) {
                JSONObject product = (JSONObject) o;
                System.out.println("Текущий элемент: product");
                System.out.println("Название продукта: " + product.get("title"));
                System.out.println("Производитель: " + product.get("manufacture"));
                System.out.println("Цена (руб): " + product.get("cost"));
            }

            boolean input;
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("Хотите выполнить поиск продуктов в списке по производителю? (Да/Нет)");
                input = scanner.nextLine().equalsIgnoreCase("да");
                if (input){
                    System.out.println("Продукты какого производителя хотите найти?: ");
                    String search = scanner.nextLine();
                    for(Object o: jsonArray){
                        JSONObject product = (JSONObject) o;
                        String manufacture_obj = (String) product.get("manufacture");
                        if (manufacture_obj.equalsIgnoreCase(search)) {
                            System.out.println("Продукты произведенные " + search);
                            System.out.println("Название продукта: " + product.get("title"));
                            System.out.println("Производитель: " + product.get("manufacture"));
                            System.out.println("Цена (руб): " + product.get("cost"));
                        }
                    }
                }
            }while(input);

            do {
                System.out.println("Хотите добавить новый продукт в список? (Да/Нет)");
                input = scanner.nextLine().equalsIgnoreCase("да");
                if (input) {
                    try {
                        System.out.println("Название продукта: ");
                        String title = scanner.nextLine();
                        System.out.println("Производитель: ");
                        String manufacture = scanner.nextLine();
                        System.out.println("Цена (руб): ");
                        float cost = Float.parseFloat(scanner.nextLine());
                        JSONObject newProduct = new JSONObject();
                        newProduct.put("title", title);
                        newProduct.put("manufacture", manufacture);
                        newProduct.put("cost", cost);
                        jsonArray.add(newProduct);
                        JSONObject products = new JSONObject();
                        products.put("products",jsonArray);
                        try (FileWriter file = new FileWriter("src/lr8/JSON/JSON_product.json")) {
                            file.write(products.toJSONString());
                            System.out.println("Продукт успешно добавлен");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("Цена должна вводиться в виде числа");
                    }
                }
            }while(input);

            do {
                System.out.println("Хотите удалить продукт по названию? (Да/Нет)");
                input = scanner.nextLine().equalsIgnoreCase("да");
                if (input) {
                    System.out.println("Введите название товара, который хотите удалить: ");
                    String title = scanner.nextLine();
                    Iterator iterator = jsonArray.iterator();
                    while (iterator.hasNext()) {
                        JSONObject book = (JSONObject) iterator.next();
                        if (title.equals(book.get("title"))) {
                            iterator.remove();
                        }}
                    JSONObject products = new JSONObject();
                    products.put("products",jsonArray);
                    try (FileWriter file = new FileWriter("src/lr8/JSON/JSON_product.json")) {
                        file.write(products.toJSONString());
                        System.out.println("Товар успешно удален");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } while (input);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
