package by.khmara.epam.mod6.task2;

import java.io.Serializable;
import java.time.LocalDate;

public class Note implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6237383753768961024L;
	private Topic topic;
	private LocalDate date;
	private String email;
	private String text;
	
	public Note(Topic topic, LocalDate date, String email, String text) {
		
		this.topic = topic;
		this.date = date;
		this.email = email;
		this.text = text;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "topic= " + topic + ", date=" + date + ", email=" + email + ", text=" + text;
	}
	
	
	
}
