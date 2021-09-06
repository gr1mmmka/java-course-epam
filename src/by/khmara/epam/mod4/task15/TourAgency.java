package by.khmara.epam.mod4.task15;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TourAgency {
	private String name;
	private List<Tour> tours;

	public TourAgency(String name, List<Tour> tours) {

		this.name = name;
		this.tours = tours;
	}

	// ищет путевки по транспорту

	public void findTourByTransport(Transport transport) {
		for (int i = 0; i < tours.size(); i++) {
			if (tours.get(i).getTransport().equals(transport)) {
				System.out.println(tours.get(i));
			}
		}
	}

	// ищет путевки по питанию
	
	public void findTourByFood(Food food) {
		for (int i = 0; i < tours.size(); i++) {
			if (tours.get(i).getFood().equals(food)) {
				System.out.println(tours.get(i));
			}
		}
	}

	// сортирует путевки по количеству дней
	
	public void sortToursByDays() {
		Collections.sort(tours, new TourComparatorByDays());
	}

	public String getName() {
		return name;
	}

	public List<Tour> getTours() {
		return tours;
	}

	class TourComparatorByDays implements Comparator<Tour> {

		@Override
		public int compare(Tour o1, Tour o2) {

			return Integer.compare(o1.getDays(), o2.getDays());
		}

	}

}
