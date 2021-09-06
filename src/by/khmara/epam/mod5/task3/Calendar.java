package by.khmara.epam.mod5.task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private int year;
	private List<Holiday> holidays;
	private Holiday holiday;

	public Calendar(int year) {
		this.year = year;
		holidays = new ArrayList<>();
		holiday = new Holiday();

	}

	public List<Holiday> getHolidays() {
		return holidays;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return holidays.toString();
	}

	private class Holiday {

		private String name;
		private LocalDate date;

		private Holiday() {
			addWeekend(year);
			addHoliday();
		}

		public Holiday(String name, LocalDate date) {
			this.name = name;
			this.date = date;
		}

		public void addHoliday() {
			Holiday newYear1 = new Holiday("New year", LocalDate.of(Calendar.this.getYear(), 1, 1));
			Holiday newYear2 = new Holiday("New year", LocalDate.of(Calendar.this.getYear(), 1, 2));
			Holiday defendersOfTheFatherlandDay = new Holiday("Defenders of the Fatherland Day",
					LocalDate.of(Calendar.this.getYear(), 2, 23));
			Holiday womenDay = new Holiday("Women's day", LocalDate.of(Calendar.this.getYear(), 3, 8));
			Holiday laborDay = new Holiday("Labor Day", LocalDate.of(Calendar.this.getYear(), 5, 1));
			Holiday dayOfTheOctoberRevolution = new Holiday("Day of the October Revolution",
					LocalDate.of(Calendar.this.getYear(), 11, 7));

			holidays.add(dayOfTheOctoberRevolution);
			holidays.add(laborDay);
			holidays.add(womenDay);
			holidays.add(defendersOfTheFatherlandDay);
			holidays.add(newYear2);
			holidays.add(newYear1);
		}

		private void addWeekend(int year) {
			LocalDate date = LocalDate.of(year, 11, 1);

			while (date.getYear() == year) {
				if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
					holidays.add(new Holiday("Saturday", date));

				} else if (date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
					holidays.add(new Holiday("Sunday", date));

				}
				date = date.plusDays(1);
			}
		}

		@Override
		public String toString() {
			return date + " " + name;
		}

	}
}
