package topic_7.topic_7_4;

//Завдання 4
//Використовуючи JAXB, виконати завдання №3.

//Завдання 3
//Створіть клас, використовуючи SAXParser, де опишіть ієрархію XML файлу. Необхідно, щоб проект створював XML-файл
// і будував дерево (місто, назва вулиці, будинок). У місті використовуйте аттрибут (наприклад, <city size=”big>Kiev</city>).

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Ritun\\IdeaProjects\\Java Advanced\\src\\topic_7\\topic_7_4\\city2.xml";
        createXML(filePath);
        //parseXML(filePath);
    }

    //метод, який буде створювати та наповнювати XML-файл
    private static void createXML(String filePath) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); //створення фабрики для будівника XML-документу
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();               //створення парсеру
            Document doc = dBuilder.newDocument();                                   //створення нового XML-документу

            Element rootElement = doc.createElement("city");                //створення кореневого елементу
            rootElement.setAttribute("size", "big");                    //додавння атрибуту елементу
            rootElement.setTextContent("Kiev");                                      //встановлення тексту всередині елементу city
            doc.appendChild(rootElement);                                            //доавання елементу city в документ в якості кореневого вузла

            Element street = doc.createElement("street");                   //створення елементу street
            street.setTextContent("Khreshchatyk");                                   //встановлення тексту всередині елементу street
            rootElement.appendChild(street);                                         //доавання елементу street в якості дочірнього елементу кореневого елементу

            Element house = doc.createElement("house");                      //створення елементу house
            house.setTextContent("10");                                               //встановлення тексту всередині елементу house
            street.appendChild(house);                                                //доавання елементу house в якості дочірнього елементу street

            TransformerFactory transformerFactory = TransformerFactory.newInstance(); //створення фабрики трансформерів
            Transformer transformer = transformerFactory.newTransformer();            //отримання трансформеру, що буде перетворювати doc у файл
            DOMSource source = new DOMSource(doc);                                    //перетворення doc в джерело даних
            StreamResult result = new StreamResult(new File(filePath));               //вказування на місце, куди треба зберегти XML
            transformer.transform(source, result);                                    //виконання запису у файл

            System.out.println("XML-файл успешно создан.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
