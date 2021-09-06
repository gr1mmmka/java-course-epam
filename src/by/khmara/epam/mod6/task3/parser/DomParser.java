package by.khmara.epam.mod6.task3.parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.khmara.epam.mod6.task3.entity.Student;

public final class DomParser {
	private static DocumentBuilderFactory dbFactory;
	private static Document document;

	private DomParser() {

	}

	public static void editStudent(int id, Student student, File path) {
		try {
			dbFactory = DocumentBuilderFactory.newInstance();
			document = dbFactory.newDocumentBuilder().parse(path);
		} catch (SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		NodeList nodes = document.getElementsByTagName("student");
		Element element = null;

		for (int i = 0; i < nodes.getLength(); i++) {
			element = (Element) nodes.item(i);

			if (Integer.parseInt(element.getElementsByTagName("id").item(0).getFirstChild().getTextContent()) == id) {
				Node age = element.getElementsByTagName("age").item(0).getFirstChild();
				age.setNodeValue(new String(String.valueOf(student.getAge())));

				Node name = element.getElementsByTagName("name").item(0).getFirstChild();
				name.setNodeValue(new String(String.valueOf(student.getName())));

				Node group = element.getElementsByTagName("group-number").item(0).getFirstChild();
				group.setNodeValue(new String(String.valueOf(student.getGroupNumber())));
			}
		}

		try {

			writeXml(document, path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void addStudent(Student student, File path) {

		try {
			dbFactory = DocumentBuilderFactory.newInstance();
			document = dbFactory.newDocumentBuilder().parse(path);
		} catch (SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		NodeList nodes = document.getElementsByTagName("students");
		Node node = nodes.item(0);

		Element newStudent = document.createElement("student");

		Element newId = document.createElement("id");
		newId.setTextContent(new String(String.valueOf(student.getId())));

		Element newAge = document.createElement("age");
		newAge.setTextContent(new String(String.valueOf(student.getAge())));

		Element newName = document.createElement("name");
		newName.setTextContent(new String(student.getName()));

		Element newGroupNumber = document.createElement("group-number");
		newGroupNumber.setTextContent(new String(student.getGroupNumber()));

		newStudent.appendChild(newId);
		newStudent.appendChild(newAge);
		newStudent.appendChild(newName);
		newStudent.appendChild(newGroupNumber);
		node.appendChild(newStudent);

		try {

			writeXml(document, path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void writeXml(Document document, File path) throws TransformerException {

		document.getDocumentElement().normalize();

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);

		StreamResult result = new StreamResult(path);
		transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
		transformer.transform(source, result);
	}

	public static List<Student> getStudents(File path) {
		List<Student> students = new ArrayList<Student>();

		try {
			dbFactory = DocumentBuilderFactory.newInstance();
			document = dbFactory.newDocumentBuilder().parse(path);

			NodeList nodes = document.getElementsByTagName("student");
			for (int i = 0; i < nodes.getLength(); i++) {
				students.add(getStudent(nodes.item(i)));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return students;
	}

	private static Student getStudent(Node item) {
		Student student = new Student();

		if (item.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) item;

			student.setId(Integer.parseInt(getTagValue("id", element)));
			student.setAge(Integer.parseInt(getTagValue("age", element)));
			student.setName(getTagValue("name", element));
			student.setGroupNumber(getTagValue("group-number", element));
		}
		return student;
	}

	private static String getTagValue(String name, Element element) {

		NodeList nodeList = element.getElementsByTagName(name).item(0).getChildNodes();
		Node node = nodeList.item(0);

		return node.getNodeValue();
	}

}
