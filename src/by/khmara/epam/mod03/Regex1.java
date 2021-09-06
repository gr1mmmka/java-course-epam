package by.khmara.epam.mod03;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.
 */

public class Regex1 {

	public static void main(String[] args) {

		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Habitant morbi tristique senectus et netus et malesuada. Faucibus in ornare quam viverra orci sagittis eu volutpat. Eget est lorem ipsum dolor sit amet consectetur adipiscing elit. In hac habitasse platea dictumst vestibulum rhoncus est pellentesque. Sapien et ligula ullamcorper malesuada proin libero nunc. Faucibus purus in massa tempor nec feugiat nisl pretium. Suspendisse in est ante in nibh. Diam quam nulla porttitor massa. Nisl condimentum id venenatis a condimentum vitae sapien. Consectetur adipiscing elit ut aliquam purus sit amet luctus venenatis. Vitae turpis massa sed elementum tempus egestas sed sed risus. Amet justo donec enim diam. Massa massa ultricies mi quis hendrerit dolor. Diam phasellus vestibulum lorem sed risus ultricies tristique nulla aliquet. Diam vulputate ut pharetra sit amet aliquam id diam. Nisl pretium fusce id velit ut. Sollicitudin aliquam ultrices sagittis orci a scelerisque purus semper eget. Nulla aliquet porttitor lacus luctus accumsan tortor.\n"
				+ "\n"
				+ "Viverra nibh cras pulvinar mattis nunc. Diam quis enim lobortis scelerisque fermentum dui. Sit amet mauris commodo quis imperdiet. Iaculis urna id volutpat lacus laoreet non. Blandit cursus risus at ultrices mi tempus. Aliquet porttitor lacus luctus accumsan tortor posuere ac ut consequat. Gravida cum sociis natoque penatibus. Sagittis nisl rhoncus mattis rhoncus. Tellus orci ac auctor augue. Id diam maecenas ultricies mi. Dictum fusce ut placerat orci nulla pellentesque. Amet massa vitae tortor condimentum lacinia quis vel.\n"
				+ "\n"
				+ "Diam volutpat commodo sed egestas egestas. Lacus vel facilisis volutpat est. Mi sit amet mauris commodo. Amet est placerat in egestas. Fusce ut placerat orci nulla pellentesque dignissim enim. Lacus luctus accumsan tortor posuere ac. In cursus turpis massa tincidunt. Viverra suspendisse potenti nullam ac tortor vitae purus faucibus ornare. Ac tortor dignissim convallis aenean. Risus nec feugiat in fermentum posuere urna. Amet consectetur adipiscing elit ut. Ut tellus elementum sagittis vitae et leo duis ut. Auctor urna nunc id cursus metus aliquam. Varius vel pharetra vel turpis nunc eget. Etiam dignissim diam quis enim lobortis scelerisque.";

		System.out.println(text);
		System.out.print("\n"
				+ "=================================================================================================================="
				+ "\n" + "\n");

		for (String x : sortByParagraphs(text)) {
			if (!x.isEmpty()) {
				System.out.println(x + "\n");
			}
		}

		printTextByCountOfWords(text);

		printTextByMatches(text);

	}

	// split text into paragraphs and then into sentences; sort by length
	// of words and print
	// which are in them

	public static void printTextByCountOfWords(String text) {

		String[] paragraphs = text.split("\\n");

		for (int j = 0; j < paragraphs.length; j++) {

			String[] sentences = paragraphs[j].split("[\\.|\\!|\\?]\\s+");

			for (int i = 0; i < sentences.length; i++) {

				String snt = sortByWords(sentences[i]);

				System.out.print(snt);
			}

			System.out.println("");
		}

	}

	// split text into paragraphs and then into sentences; sort by matches and
	// alphabet and print
	// which are in them

	public static void printTextByMatches(String text) {

		String[] paragraphs = text.split("\\n");

		for (int j = 0; j < paragraphs.length; j++) {

			String[] sentences = paragraphs[j].split("[\\.|\\!|\\?]\\s+");

			for (int i = 0; i < sentences.length; i++) {

				String snt = sortByMatches("a", sentences[i]);

				System.out.print(snt);
			}

			System.out.println("");
		}

	}

	// sort paragraphs by count of sentences are in them

	public static String[] sortByParagraphs(String text) {

		int countMax;

		Pattern p = Pattern.compile("\\.|\\!|\\?");

		String[] paragraph = text.split("\\\n");

		int[] cs = new int[paragraph.length];

		for (int i = 0; i < paragraph.length; i++) {

			countMax = 0;
			Matcher m = p.matcher(paragraph[i]);

			while (m.find()) {
				countMax++;
			}

			cs[i] = countMax;

		}

		for (int j = 0; j < cs.length; j++) {
			int temp;
			String str = "";

			for (int k = 0; k < cs.length; k++) {

				if (cs[j] < cs[k]) {

					temp = cs[j];
					cs[j] = cs[k];
					cs[k] = temp;

					str = paragraph[j];
					paragraph[j] = paragraph[k];
					paragraph[k] = str;

				}
			}
		}

		return paragraph;
	}

	// sort sentences by length of words

	public static String sortByWords(String text) {

		String[] words = text.split(" ");

		int[] cw = new int[words.length];

		for (int i = 0; i < words.length; i++) {

			cw[i] = words[i].length();

		}

		for (int j = 0; j < cw.length; j++) {
			int temp;
			String str = "";

			for (int k = 0; k < cw.length; k++) {

				if (cw[j] < cw[k]) {

					temp = cw[j];
					cw[j] = cw[k];
					cw[k] = temp;

					str = words[j];
					words[j] = words[k];
					words[k] = str;

				}
			}
		}

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			int index = -1;

			if (words[i].contains(".")) {
				index = i;
			}

			if (i == words.length - 1 && !words[i].isEmpty()) {

				str.append(words[i].trim() + ". ");

			} else {

				str.append(words[i]);
				str.append(" ");

			}

			if (index != -1) {
				str.deleteCharAt(str.length() - 2);
			}
		}

		return str.toString();
	}

	// sort words in sentences by matches and by alphabet

	public static String sortByMatches(String s, String text) {

		String[] words = text.split(" ");

		int[] cw = new int[words.length];

		int count = 0;

		for (int i = 0; i < words.length; i++) {

			Pattern p = Pattern.compile(s);
			Matcher m = p.matcher(words[i]);

			while (m.find()) {
				count++;
			}

			cw[i] = count;

			count = 0;

		}

		for (int j = 0; j < cw.length; j++) {
			int temp;
			String str = "";

			for (int k = 0; k < cw.length; k++) {

				if (cw[j] < cw[k]) {

					temp = cw[j];
					cw[j] = cw[k];
					cw[k] = temp;

					str = words[j];
					words[j] = words[k];
					words[k] = str;

				} else if (cw[j] == cw[k]) {

					String var = "";

					String[] words2 = new String[2];
					words2[0] = words[j].toLowerCase();
					words2[1] = words[k].toLowerCase();
					var = words[k].toLowerCase();

					Arrays.sort(words2);

					if (words2[0].equals(var)) {

						temp = cw[j];
						cw[j] = cw[k];
						cw[k] = temp;

						str = words[j];
						words[j] = words[k];
						words[k] = str;
					}

				}
			}
		}

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			int index = -1;

			if (words[i].contains(".")) {
				index = i;
			}

			if (i == words.length - 1 && !words[i].isEmpty()) {

				str.append(words[i].trim() + ". ");

			} else {

				str.append(words[i]);
				str.append(" ");

			}

			if (index != -1) {
				str.deleteCharAt(str.length() - 1);
			}
		}

		return str.toString();

	}

}
