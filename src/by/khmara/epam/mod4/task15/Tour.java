package by.khmara.epam.mod4.task15;

public class Tour {
	private String destination;
	private Type tourType;
	private Transport transport;
	private Food food;
	private int days;
	private double price;

	public Tour(String destination, Type tourType, Transport transport, Food food, int days, double price) {

		this.destination = destination;
		this.tourType = tourType;
		this.transport = transport;
		this.food = food;
		this.days = days;
		this.price = price;
	}

	public String getDestination() {
		return destination;
	}

	public Type getTourType() {
		return tourType;
	}

	public Transport getTransport() {
		return transport;
	}

	public Food getFood() {
		return food;
	}

	public int getDays() {
		return days;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Tour [destination=" + destination + ", tourType=" + tourType + ", transport=" + transport + ", food="
				+ food + ", days=" + days + ", price=" + price + "]";
	}

}
