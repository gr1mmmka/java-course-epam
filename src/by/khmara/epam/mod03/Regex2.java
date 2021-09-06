package by.khmara.epam.mod03;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.
 */

public class Regex2 {

	public static void main(String[] args) {

		String text = "<notes>\r\n" + " <note id = \"1\">\r\n" + " <to>Вася</to>\r\n" + " <from>Света</from>\r\n"
				+ " <heading>Напоминание</heading>\r\n" + " <body>Позвони мне завтра!</body>\r\n" + " </note>\r\n"
				+ " <note id = \"2\">\r\n" + " <to>Петя</to>\r\n" + " <from>Маша</from>\r\n"
				+ " <heading>Важное напоминание</heading>\r\n" + " </note>\r\n" + "</notes>\r\n" + "";

		System.out.println(text + "\n");

		Pattern p = Pattern.compile("(</*[a-zA-Z0-9=\"\\s*]+>\\s*)");
		Matcher m = p.matcher(text);

		ArrayList<String> strings = new ArrayList<String>();

		while (m.find()) {

			StringBuilder x = new StringBuilder();

			if (m.group(1).matches("<[a-zA-Z0-9=\"\\s]*>\\s*")) {

				x.append(m.group(1).trim());

				strings.add(x.toString());

			}

		}

		for (int i = 0; i < strings.size(); i++) {

			String tag = "";

			p = Pattern.compile("([a-zA-Z0-9]+)");
			m = p.matcher(strings.get(i));

			m.find();

			tag = m.group(1);

			StringBuilder b = new StringBuilder(m.group(1));
			b.append(">");
			b.insert(0, "</");

			String b1 = b.toString();

			StringBuilder body = new StringBuilder(text);

			System.out.println("Tag: " + tag);
			System.out.println("Opened tag: " + strings.get(i));
			System.out.println("Closed tag: " + b1);

			if (body.indexOf(b1) > body.indexOf(strings.get(i)) + strings.get(i).length()) {

				System.out.println("Body of tag: "
						+ body.substring(body.indexOf(strings.get(i)) + strings.get(i).length(), body.indexOf(b1)));
			} else {

				System.out.println("Body of tag: "
						+ body.substring(body.indexOf(strings.get(i)) + strings.get(i).length(), body.lastIndexOf(b1)));
			}

			System.out.println("\n======================================================\n");
		}

	}

}
