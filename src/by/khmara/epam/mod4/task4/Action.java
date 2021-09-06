package by.khmara.epam.mod4.task4;

import java.util.Arrays;
import java.util.Comparator;

public class Action {

	public void sortByNumberOfTrain(Train[] trains) {
		Arrays.sort(trains, new TrainComparatorByNumber());
	}

	public void sortByDestinationAndTime(Train[] trains) {
		Arrays.sort(trains, new TrainComparatorByDestination().thenComparing(new TrainComparatorByDepartureTime()));
	}

	public void printTrainInfo(Train[] trains, int number) {
		boolean isAnyMatch = false;

		for (int i = 0; i < trains.length; i++) {

			if (trains[i].getNumberOfTrain() == number) {
				System.out.println(trains[i]);
				isAnyMatch = true;
			}
		}

		if (isAnyMatch == false) {
			System.out.println("There is no train with this number :(");
		}
	}
}

class TrainComparatorByNumber implements Comparator<Train> {

	@Override
	public int compare(Train o1, Train o2) {

		return o1.getNumberOfTrain() > o2.getNumberOfTrain() ? 1 : -1;
	}

}

class TrainComparatorByDestination implements Comparator<Train> {

	@Override
	public int compare(Train o1, Train o2) {

		return o1.getDestination().compareTo(o2.getDestination());
	}

}

class TrainComparatorByDepartureTime implements Comparator<Train> {

	@Override
	public int compare(Train o1, Train o2) {

		return o1.getDepartureTime().compareTo(o2.getDepartureTime());
	}

}
