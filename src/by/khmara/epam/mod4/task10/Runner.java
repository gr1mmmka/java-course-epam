package by.khmara.epam.mod4.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Runner {

	public static void main(String[] args) {

		AirlineList airlines = new AirlineList();

		airlines.addAirline(new Airline("Minsk", 131, Type.CHARTER, LocalTime.of(18, 00), DayOfWeek.MONDAY));
		airlines.addAirline(new Airline("Riga", 144, Type.LOW_COST, LocalTime.of(11, 30), DayOfWeek.SUNDAY));
		airlines.addAirline(new Airline("Prague", 912, Type.PREMIUM, LocalTime.of(07, 45), DayOfWeek.FRIDAY));
		airlines.addAirline(new Airline("Lviv", 777, Type.CHARTER, LocalTime.of(10, 00), DayOfWeek.SATURDAY));
		airlines.addAirline(new Airline("Moscow", 817, Type.CHARTER, LocalTime.of(19, 00), DayOfWeek.MONDAY));
		
		airlines.printByDayAndTime(DayOfWeek.MONDAY, LocalTime.of(15, 00));
	}

}
