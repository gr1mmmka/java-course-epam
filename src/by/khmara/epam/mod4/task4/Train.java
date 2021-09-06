package by.khmara.epam.mod4.task4;

import java.time.LocalDateTime;

public class Train {
	private String destination;
	private int numberOfTrain;
	private LocalDateTime departureTime;

	public Train(String destination, int numberOfTrain, LocalDateTime departureTime) {
		super();
		this.destination = destination;
		this.numberOfTrain = numberOfTrain;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public int getNumberOfTrain() {
		return numberOfTrain;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	@Override
	public String toString() {
		return "Train: " + destination + ", №=" + numberOfTrain + ", " + departureTime;
	}

}
