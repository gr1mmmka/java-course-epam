package by.khmara.epam.mod6.task3.parser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import by.khmara.epam.mod6.task3.entity.Student;

public final class SaxParser {

	private SaxParser() {

	}

	public static List<Student> getStudents(File path) {

		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = null;
		StudentHandler handler = null;

		try {
			saxParser = saxParserFactory.newSAXParser();
			handler = new StudentHandler();
			saxParser.parse(path, handler);

		} catch (ParserConfigurationException | IOException | SAXException e) {
			e.printStackTrace();
		}
		return handler.getStudents();
	}

}
