package by.khmara.epam.mod6.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Notepad {

	private static final File PATH = Path.of("src", "by", "khmara", "epam", "mod6", "task2", "resources", "notes.txt")
			.toFile();
	private List<Note> notes;

	public Notepad() {
		readObjects(getPath());
	}

	public List<Note> findByTopic(Topic topic) {

		return notes.stream().filter(s -> s.getTopic().equals(topic)).toList();
	}

	public List<Note> findByDate(LocalDate date) {

		return notes.stream().filter(s -> s.getDate().equals(date)).toList();
	}

	public List<Note> findByEmail(String email) {

		return notes.stream().filter(s -> s.getEmail().equals(email)).toList();
	}

	public List<Note> findByTopicAndDate(Topic topic, LocalDate date) {

		return notes.stream().filter(s -> s.getTopic().equals(topic) && s.getDate().equals(date)).toList();
	}

	public List<Note> sortNotes(List<Note> notes) {
		return notes.stream().sorted().toList();
	}

	public List<Note> findByWordInText(String word, List<Note> notes) {

		return notes.stream().filter(s -> Pattern.matches(".*" + word + ".*", s.getText())).toList();
	}

	public void addNote(Topic topic, LocalDate date, String email, String text) {

		notes.add(new Note(topic, date, email, text));
		writeObjects(getPath());
	}

	@SuppressWarnings("unchecked")
	private void readObjects(File path) {

		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(path))) {

			notes = (ArrayList<Note>) input.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void writeObjects(File path) {

		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path))) {

			output.writeObject(notes);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Note> getNotes() {
		return List.copyOf(notes);
	}

	public static File getPath() {
		return PATH;
	}

}
