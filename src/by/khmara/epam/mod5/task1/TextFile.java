package by.khmara.epam.mod5.task1;

import java.util.ArrayList;
import java.util.List;

public class TextFile extends File {

	private List<String> content;

	public TextFile(String name, String extension, Directory directory) {
		super(name, extension, directory);
		content = new ArrayList<>();
		content.add("default text");

	}

	public void addContent(String s) {
		content.add(s);
	}

	public void printContent() {
		for (String s : content) {
			System.out.print(s + " ");
		}
	}

}
