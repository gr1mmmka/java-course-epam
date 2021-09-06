package by.khmara.epam.mod4.task10;

import java.time.LocalTime;
import java.time.DayOfWeek;

public class Airline {
	private String destination;
	private int flightNumber;
	private Type airlineType;
	private LocalTime time;
	private DayOfWeek day;

	public Airline(String destination, int flightNumber, Type airlineType, LocalTime time, DayOfWeek day) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airlineType = airlineType;
		this.time = time;
		this.day = day;
	}

	public String getDestination() {
		return destination;
	}

	public LocalTime getTime() {
		return time;
	}

	public DayOfWeek getDay() {
		return day;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", airlineType=" + airlineType
				+ ", time=" + time + ", day=" + day + "]\n";
	}
	
	

}
