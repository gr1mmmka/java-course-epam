package by.khmara.epam.mod6.task1.bean;

import java.time.Year;

public class Book {
	private String name;
	private String author;
	private Year ageOfPublishing;

	public Book(String name, String author, Year ageOfPublishing) {

		this.name = name;
		this.author = author;
		this.ageOfPublishing = ageOfPublishing;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Year getAgeOfPublishing() {
		return ageOfPublishing;
	}

	public void setAgeOfPublishing(Year ageOfPublishing) {
		this.ageOfPublishing = ageOfPublishing;
	}

	@Override
	public String toString() {
		return name + ", " + author + ", " + ageOfPublishing + "year";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Book book = (Book) obj;
		return book.getName().equals(name) && book.getAgeOfPublishing().equals(ageOfPublishing);
	}

}
