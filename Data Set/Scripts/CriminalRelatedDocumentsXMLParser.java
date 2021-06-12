/***
#
# Authors: Gonçalo Carnaz PhD, Vitor B. Nogueira PhD, Mário Antunes PhD
# Disclamer: This is part of Annotated-Corpus-of-Criminal-Related-Portuguese-Documents dataset 
#            
# Script Purpose: Create the XML files using the defined XML Schema
*/

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.UnsupportedEncodingException;

public class CriminalRelatedDocumentsXMLParser {


    /***
     *  Method: CrimeNewsXMLDeploy
     *  Description: Deploys the XML for Criminal News and PGRLisboa usaing the defined XML Schema
     * @param DocumentID
     * @param DocumentName
     * @param Authors
     * @param PublicationDate
     * @param Title
     * @param NewsText
     * @throws UnsupportedEncodingException
     * @throws TransformerException
     * @throws ParserConfigurationException
     */

    public static void CrimeNewsXMLDeploy(String DocumentID, String  DocumentName, String Authors, String PublicationDate, String Title, String NewsText) throws UnsupportedEncodingException, TransformerException, ParserConfigurationException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();


        Element rootElement = doc.createElement("DocumentID");
        doc.appendChild(rootElement);
        Element DocName = doc.createElement("DocumentName");
        DocName.appendChild(doc.createTextNode(DocumentName));
        rootElement.appendChild(DocName);

        Element DocAuthors = doc.createElement("Authors");
        DocAuthors.appendChild(doc.createTextNode(Authors));
        rootElement.appendChild(DocAuthors);

        Element DocDate = doc.createElement("PublicationDate");
        DocDate.appendChild(doc.createTextNode(PublicationDate));
        rootElement.appendChild(DocDate);

        Element DocTitle = doc.createElement("Title");
        DocTitle.appendChild(doc.createTextNode(Title));
        rootElement.appendChild(DocTitle);

        Element DocNewsText = doc.createElement("NewsText");
        DocNewsText.appendChild(doc.createTextNode(NewsText));
        rootElement.appendChild(DocNewsText);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("output\\news.xml"));
        transformer.transform(source, result);
        System.out.println("File Saved!");
        System.out.println("\nXML DOM Created Successfully..");

    }

    /***
     *  Method: CrimeNewsXMLDeploy
     *  Description: Deploys the XML for Criminal Reports using the defined XML Schema
     * @param DocumentID
     * @param DocumentName
     * @param Authors
     * @param PublicationDate
     * @param cpn
     * @param Title
     * @param DocumentBody
     * @throws UnsupportedEncodingException
     * @throws TransformerException
     * @throws ParserConfigurationException
     */
    public static void CriminalReportsXMLDeploy(String DocumentID, String  DocumentName, String Authors, String PublicationDate, String cpn, String Title, String DocumentBody) throws UnsupportedEncodingException, TransformerException, ParserConfigurationException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element rootElement = doc.createElement("DocumentID");
        doc.appendChild(rootElement);
        Element DocName = doc.createElement("DocumentName");
        DocName.appendChild(doc.createTextNode(DocumentName));
        rootElement.appendChild(DocName);

        Element DocAuthors = doc.createElement("Authors");
        DocAuthors.appendChild(doc.createTextNode(Authors));
        rootElement.appendChild(DocAuthors);

        Element DocDate = doc.createElement("PublicationDate");
        DocDate.appendChild(doc.createTextNode(PublicationDate));
        rootElement.appendChild(DocDate);

        Element Doccpn = doc.createElement("cpn");
        Doccpn.appendChild(doc.createTextNode(cpn));
        rootElement.appendChild(Doccpn);


        Element DocTitle = doc.createElement("Title");
        DocTitle.appendChild(doc.createTextNode(Title));
        rootElement.appendChild(DocTitle);

        Element DocNewsText = doc.createElement("DocumentBody");
        DocNewsText.appendChild(doc.createTextNode(DocumentBody));
        rootElement.appendChild(DocNewsText);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("output\\news.xml"));
        transformer.transform(source, result);
        System.out.println("File Saved!");
        System.out.println("\nXML DOM Created Successfully..");

    }
}
