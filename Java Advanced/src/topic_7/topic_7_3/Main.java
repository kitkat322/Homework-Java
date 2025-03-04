//Створіть клас, використовуючи SAXParser, де опишіть ієрархію XML файлу. Необхідно, щоб проект створював XML-файл
// і будував дерево (місто, назва вулиці, будинок). У місті використовуйте аттрибут (наприклад, <city size=”big>Kiev</city>).

package topic_7.topic_7_3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;
import java.io.IOException;


public class Main {
        public static void main(String[] args) {
            String filePath = "C:\\Users\\Ritun\\IdeaProjects\\Java Advanced\\src\\topic_7\\topic_7_3\\city.xml";
            createXML(filePath);
            parseXML(filePath);
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

        //метод, який за допомогою SAX-парсеру буде читати вміст XML-файлу
        private static void parseXML(String filePath) {
            try {
                SAXParserFactory factory = SAXParserFactory.newInstance(); //створення фабрики парсерів
                SAXParser saxParser = factory.newSAXParser();              //отримання SAX-парсеру
                DefaultHandler handler = new DefaultHandler() {            //створення анонімного класу обробника подій
                    boolean isStreet = false;
                    boolean isHouse = false;

                    //метод, який розпізнає теги
                    @Override
                    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                        if (qName.equalsIgnoreCase("city")) {                      //розпізнавання тегу city
                            System.out.println("City: " + attributes.getValue("size")); //вивід атрибуту елементу city
                        } else if (qName.equalsIgnoreCase("street")) {             //розпізнавання тегу street
                            isStreet = true;                                                   //зміна флагу isStreet на true для подальшого використання цього значення у методі characters()
                        } else if (qName.equalsIgnoreCase("house")) {              //розпізнавання тегу house
                            isHouse = true;                                                    ////зміна флагу isHouse на true для подальшого використання цього значення у методі characters()
                        }
                    }

                    //метод, який виводить назви тегів, орієнтуючись на поля isStreet та isHouse
                    @Override
                    public void characters(char[] ch, int start, int length) throws SAXException {
                        if (isStreet) {
                            System.out.println("Street: " + new String(ch, start, length));
                            isStreet = false;
                        } else if (isHouse) {
                            System.out.println("House: " + new String(ch, start, length));
                            isHouse = false;
                        }
                    }
                };

                //відкривання парсером XML-файлу та початок його обробки за допомогою handler
                saxParser.parse(new File(filePath), handler);
            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
            }
        }
}
