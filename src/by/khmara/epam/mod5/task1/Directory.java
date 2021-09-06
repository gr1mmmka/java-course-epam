package by.khmara.epam.mod5.task1;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	private List<String> fileLocation;
	private List<File> files;

	public Directory(List<String> fileLocation) {
		files = new ArrayList<>();
		this.fileLocation = fileLocation;
	}

	public boolean createFile(File file) {
		if (files.contains(file)) {
			System.out.println("File with the same name already exists");
			return false;
		} else {
			files.add(new File(file.getName(), file.getExtension(), file.getDirectory()));
			return true;
		}
	}

	public void deleteFile(File file) {

		files.remove(file);

	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (String s : fileLocation) {
			str.append(s);
			str.append("/");
		}

		return "Directory is " + str;
	}

}
