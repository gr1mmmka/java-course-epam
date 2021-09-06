package by.khmara.epam.mod5.task1;

public class File {

	private String name;
	private String extension;
	private Directory directory;

	public File(String name, String extension, Directory directory) {

		this.name = name;
		this.extension = extension;
		this.directory = directory;
	}

	public void changeName(String newName) {
		int index = -1;

		for (int i = 0; i < directory.getFiles().size(); i++) {
			if (name.equals(directory.getFiles().get(i).getName())) {
				index = i;
			}
		}
		if (index >= 0) {
			name = newName;
			directory.getFiles().get(index).setName(newName);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	@Override
	public boolean equals(Object obj) {
		File file = (File) obj;

		return name.equals(file.getName());
	}

	@Override
	public String toString() {
		return name + "." + extension;
	}

}
