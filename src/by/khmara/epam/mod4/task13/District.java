package by.khmara.epam.mod4.task13;

public class District {
	private String name;
	private City city;
	private double square;

	public District(String name, City city, double square) {
		super();
		this.name = name;
		this.city = city;
		this.square = square;
	}

	public String getName() {
		return name;
	}

	public City getCity() {
		return city;
	}

	public double getSquare() {
		return square;
	}

}
