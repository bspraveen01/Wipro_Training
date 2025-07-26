package Day6;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;

import java.io.File;

public class XMLFileData_ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Specify XML file path
            File file = new File("C:\\Users\\SRIRAMPRAVEEN\\Downloads\\data.xml");

            // Set up parser
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the file
            Document doc = builder.parse(file);

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            // Get all <student> elements
            NodeList nodeList = doc.getElementsByTagName("student");

            // Loop through each <student> element
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element student = (Element) node;

                    System.out.println("\nStudent #" + (i + 1));
                    System.out.println("ID: " + student.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("Name: " + student.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Age: " + student.getElementsByTagName("age").item(0).getTextContent());
                    System.out.println("Department: " + student.getElementsByTagName("department").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
