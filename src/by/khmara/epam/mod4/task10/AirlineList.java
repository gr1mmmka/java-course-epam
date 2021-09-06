package by.khmara.epam.mod4.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirlineList {
	private List<Airline> airlines;

	public AirlineList() {
		airlines = new ArrayList<>();
	}

	public void addAirline(Airline airline) {
		airlines.add(airline);
	}

	public void printByDestination(String destination) {
		for (int i = 0; i < airlines.size(); i++) {
			if (airlines.get(i).getDestination().equals(destination)) {
				System.out.println(airlines.get(i));
			}
		}
	}

	public void printByDay(DayOfWeek day) {
		for (int i = 0; i < airlines.size(); i++) {
			if (airlines.get(i).getDay().equals(day)) {
				System.out.println(airlines.get(i));
			}
		}
	}

	public void printByDayAndTime(DayOfWeek day, LocalTime time) {
		for (int i = 0; i < airlines.size(); i++) {
			if (airlines.get(i).getDay().equals(day) && airlines.get(i).getTime().isAfter(time)) {
				System.out.println(airlines.get(i));
			}
		}
	}
}
