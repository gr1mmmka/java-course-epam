package by.khmara.epam.mod6.task3.parser;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.khmara.epam.mod6.task3.entity.Student;

public class StudentHandler extends DefaultHandler {

	private boolean hasId = false;
	private boolean hasAge = false;
	private boolean hasName = false;
	private boolean hasGroupNumber = false;

	private List<Student> students = null;
	private Student student = null;

	public List<Student> getStudents() {
		return students;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("Student")) {
			student = new Student();
			
			if (students == null)
				students = new ArrayList<>();
			
		} else if (qName.equalsIgnoreCase("id")) {
			hasId = true;
		} else if (qName.equalsIgnoreCase("age")) {
			hasAge = true;
		} else if (qName.equalsIgnoreCase("name")) {
			hasName = true;
		} else if (qName.equalsIgnoreCase("group-number")) {
			hasGroupNumber = true;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {

		if (qName.equalsIgnoreCase("Student")) {
			students.add(student);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

		if (hasId) {
			student.setId(Integer.parseInt(new String(ch, start, length)));
			hasId = false;
		} else if (hasAge) {
			student.setAge(Integer.parseInt(new String(ch, start, length)));
			hasAge = false;
		} else if (hasName) {
			student.setName(new String(ch, start, length));
			hasName = false;
		} else if (hasGroupNumber) {
			student.setGroupNumber(new String(ch, start, length));
			hasGroupNumber = false;
		}
	}

}
