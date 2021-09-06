package by.khmara.epam.mod4.task11;

import java.util.ArrayList;
import java.util.List;

public class Text {
	private List<Sentence> sentences;
	private String title;

	public Text(String title) {
		this.title = title;
		sentences = new ArrayList<>();
	}

	public void addSentence(Sentence sentence) {
		sentences.add(sentence);
	}

	public List<Sentence> getSentences() {
		return sentences;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		String text = "";
		for (Sentence sentence : sentences) {
			text = text + sentence + " ";
		}
		return text;
	}

}
