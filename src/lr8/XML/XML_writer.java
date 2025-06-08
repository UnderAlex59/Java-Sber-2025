package lr8.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XML_writer {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = factory.newDocumentBuilder();

            // Создаем корневой элемент
            Document doc = docBuilder.newDocument();
            Element root = doc.createElement("library");
            doc.appendChild(root);

            // Добавляем первую книгу
            Element book1 = doc.createElement("book");
            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("Война и мир"));
            book1.appendChild(title1);

            Element author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode("Толстой"));
            book1.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("1869"));
            book1.appendChild(year1);

            root.appendChild(book1);

            // Добавляем вторую книгу
            Element book2 = doc.createElement("book");
            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Мастер и Маргарита"));
            book2.appendChild(title2);

            Element author2 = doc.createElement("author");
            author2.appendChild(doc.createTextNode("Булгаков"));
            book2.appendChild(author2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("1940"));
            book2.appendChild(year2);

            root.appendChild(book2);

            // Запись в XML-файл
            javax.xml.transform.TransformerFactory transformerFactory = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/lr8/XML/XML_writer_ex.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

