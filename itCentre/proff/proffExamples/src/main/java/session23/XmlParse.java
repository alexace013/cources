package session23;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 22.05.15
 */
public class XmlParse {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            f.setValidating(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("persons.xml"));
//            System.out.println(doc.getElementById("first"));
            System.out.println(doc.getDocumentElement().getFirstChild().getNodeType() == Node.DOCUMENT_TYPE_NODE);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
