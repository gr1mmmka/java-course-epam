package by.khmara.epam.mod4.task11;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	private List<Word> words;

	public Sentence() {
		words = new ArrayList<>();
	}

	public void addWord(Word word) {
		words.add(word);
	}

	@Override
	public String toString() {
		String sentence ="";
		for (Word word : words) {
			sentence = sentence + word + " ";
		}
		return sentence;
	}

}
