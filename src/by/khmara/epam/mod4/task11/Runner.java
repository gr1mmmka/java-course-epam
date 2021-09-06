package by.khmara.epam.mod4.task11;

public class Runner {

	public static void main(String[] args) {
		
		String title = "Biography";
		
		Word word1 = new Word("My");
		Word word2 = new Word("name");
		Word word3 = new Word("is");
		Word word4 = new Word("Anton.");
		Sentence s1 = new Sentence();
		s1.addWord(word1);
		s1.addWord(word2);
		s1.addWord(word3);
		s1.addWord(word4);
		
		Word word5 = new Word("I");
		Word word6 = new Word("am");
		Word word7 = new Word("really");
		Word word8 = new Word("fond");
		Word word9 = new Word("of");
		Word word10 = new Word("Java!");
		Sentence s2 = new Sentence();
		s2.addWord(word5);
		s2.addWord(word6);
		s2.addWord(word7);
		s2.addWord(word8);
		s2.addWord(word9);
		s2.addWord(word10);
		
		Text text = new Text(title);
		text.addSentence(s1);
		text.addSentence(s2);

		System.out.println(text.getTitle());
		System.out.println(text);
		
		
		
	}

}
