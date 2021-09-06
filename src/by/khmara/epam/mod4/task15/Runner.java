package by.khmara.epam.mod4.task15;

import java.util.ArrayList;
import java.util.List;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Runner {

	public static void main(String[] args) {

		Tour tour1 = new Tour("Paris", Type.SHOPPING, Transport.BUS, Food.BED_AND_BREAKFAST, 10, 1200);
		Tour tour2 = new Tour("Madrid", Type.VACATION, Transport.AIRCRAFT, Food.ALL_INCLUSIVE, 12, 1400);
		Tour tour3 = new Tour("USA", Type.CRUISE, Transport.AIRCRAFT, Food.ALL_INCLUSIVE, 15, 1700);
		Tour tour4 = new Tour("Canada", Type.TREATMENT, Transport.AIRCRAFT, Food.BED_AND_BREAKFAST, 15, 1950);
		Tour tour5 = new Tour("Riga", Type.SHOPPING, Transport.CAR, Food.FULL_BOARD, 7, 540);
		Tour tour6 = new Tour("Lviv", Type.SHOPPING, Transport.BUS, Food.HALF_BOARD, 7, 320);
		Tour tour7 = new Tour("Sant-Petersburg", Type.EXCURSION, Transport.CAR, Food.BED_AND_BREAKFAST, 3, 410);

		List<Tour> tours = new ArrayList<>();
		tours.add(tour1);
		tours.add(tour2);
		tours.add(tour3);
		tours.add(tour4);
		tours.add(tour5);
		tours.add(tour6);
		tours.add(tour7);

		TourAgency travelAgency = new TourAgency("Travel the world", tours);
		travelAgency.findTourByTransport(Transport.BUS);

		travelAgency.sortToursByDays();
		System.out.println(tours);
	}

}
