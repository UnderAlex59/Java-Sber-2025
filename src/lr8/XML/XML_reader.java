package lr8.XML;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XML_reader {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr8/XML/XML_writer_ex.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("book");
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Название книги: " +
                            element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Автор: " +
                            element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Год издания: " +
                            element.getElementsByTagName("year").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
