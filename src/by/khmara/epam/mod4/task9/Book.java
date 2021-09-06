package by.khmara.epam.mod4.task9;

import java.time.Year;

public class Book {
	private int id;
	private String title;
	private String[] authors;
	private String publishing;
	private Year year;
	private int pages;
	private double price;
	private Wrapper wrapper;
	
	public Book(int id, String title, String[] authors, String publishing, Year year, int pages, double price,
			Wrapper wrapper) {
		super();
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publishing = publishing;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.wrapper = wrapper;
	}

	public String[] getAuthors() {
		return authors;
	}

	public String getPublishing() {
		return publishing;
	}

	public Year getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}
	
	
	
}
