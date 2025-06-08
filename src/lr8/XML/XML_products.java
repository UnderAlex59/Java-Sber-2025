package lr8.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class XML_products {
    public static void main(String[] args) {
        try {
            System.out.println("Ваш список покупок:\n");
            File inputFile = new File("D:\\Java-Sber-2025\\src\\lr8\\XML\\XML_product.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("product");
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Название продукта: " +
                            element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Производитель: " +
                            element.getElementsByTagName("manufacturer").item(0).getTextContent());
                    System.out.println("Стоимость (в руб): " +
                            element.getElementsByTagName("cost").item(0).getTextContent());
                }
            }
            Scanner scanner = new Scanner(System.in);
            boolean input;
            do{
                System.out.println("Хотите добавить ещё продукты? (Да/Нет)");
                input = scanner.nextLine().equalsIgnoreCase("да");
                if (input){
                    try{
                        System.out.println("Введите название товара");
                        String new_title = scanner.nextLine();
                        System.out.println("Введите производителя товара");
                        String new_manufacture = scanner.nextLine();
                        System.out.println("Введите стоимость товара");
                        float new_cost = Float.parseFloat(scanner.nextLine());

                        Element products = doc.getDocumentElement();

                        Element product = doc.createElement("product");
                        Element title = doc.createElement("title");
                        title.appendChild(doc.createTextNode(new_title));
                        product.appendChild(title);

                        Element manufacture = doc.createElement("manufacturer");
                        manufacture.appendChild(doc.createTextNode(new_manufacture));
                        product.appendChild(manufacture);

                        Element cost = doc.createElement("cost");
                        cost.appendChild(doc.createTextNode(String.valueOf(new_cost)));
                        product.appendChild(cost);

                        products.appendChild(product);

                        Transformer transformer = TransformerFactory.newInstance().newTransformer();
                        transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
                        transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
                        DOMSource source = new DOMSource(doc);
                        StreamResult result = new StreamResult(new File("D:\\Java-Sber-2025\\src\\lr8\\XML\\XML_product.xml"));
                        transformer.transform(source, result);
                    } catch (NumberFormatException ex) {
                        System.out.print("Должно быть введено число: " + ex.getMessage() + "\n");
                    }
                }
            } while (input);

            do{
                System.out.println("Хотите найти товары из списка продуктов по производителю? (Да/Нет)");
                input = scanner.nextLine().equalsIgnoreCase("да");
                if (input){
                    System.out.println("Продукты какого производителя показать?");
                    String search_manufactire = scanner.nextLine();
                    nList = doc.getElementsByTagName("product");
                    List<Node> nodeList = new ArrayList<>();
                    for (int i = 0; i < nList.getLength(); i++) {
                        nodeList.add(nList.item(i));
                    }
                    List<Node> res =  nodeList.stream().filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                            .map(node -> (Element) node)
                            .filter(product -> product.getElementsByTagName("manufacturer").item(0).getTextContent().equalsIgnoreCase(search_manufactire))
                            .collect(Collectors.toList());
                    for (int i = 0; i < res.size(); i++) {
                        Node node = res.get(i);
                        System.out.println("\nТекущий элемент: " + node.getNodeName());
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element element = (Element) node;
                            System.out.println("Название продукта: " +
                                    element.getElementsByTagName("title").item(0).getTextContent());
                            System.out.println("Производитель: " +
                                    element.getElementsByTagName("manufacturer").item(0).getTextContent());
                            System.out.println("Стоимость (в руб): " +
                                    element.getElementsByTagName("cost").item(0).getTextContent());
                        }
                    }
                }
            } while (input);
            System.out.println("Хотите удалить продукт из списка по названию? (Да/Нет)");
            input = scanner.nextLine().equalsIgnoreCase("да");
            if(input){
                System.out.print("Введите название продукта: ");
                String del_title = scanner.nextLine();
                NodeList list = doc.getElementsByTagName("title");

                List<Node> nodeList = new ArrayList<>();
                for (int i = 0; i < list.getLength(); i++) {
                    nodeList.add(list.item(i));
                }
                Optional<Node> del_el_opt = nodeList.stream()
                        .filter(elem -> elem.getTextContent().equalsIgnoreCase(del_title))
                        .findAny();
                Node del_el= del_el_opt.orElse(null);

                if (del_el != null){
                    del_el = del_el.getParentNode();
                    Node parrent = del_el.getParentNode();
                    parrent.removeChild(del_el);
                    System.out.println("Удален из писка продукт: ");
                    Element delete_el = (Element) del_el;
                    System.out.println("Название продукта: " +
                            delete_el.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Производитель: " +
                            delete_el.getElementsByTagName("manufacturer").item(0).getTextContent());
                    System.out.println("Стоимость (в руб): " +
                            delete_el.getElementsByTagName("cost").item(0).getTextContent());
                    Transformer transformer = TransformerFactory.newInstance().newTransformer();
                    transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
                    transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult(new File("D:\\Java-Sber-2025\\src\\lr8\\XML\\XML_product.xml"));
                    transformer.transform(source, result);
                } else System.out.println("Не найден продукт с названием " + del_title);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
