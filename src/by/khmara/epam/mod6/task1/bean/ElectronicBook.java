package by.khmara.epam.mod6.task1.bean;

import java.time.Year;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ElectronicBook extends Book {
	private String source;

	public ElectronicBook(String name, String author, Year ageOfPublishing, String source) {
		super(name, author, ageOfPublishing);
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		Pattern pattern = Pattern.compile("");
		Matcher matcher = pattern.matcher(source);

		if (matcher.find()) {
			this.source = source;
		}
	}
	

}
