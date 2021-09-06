package by.khmara.epam.mod4.task13;

public class City {
	private String name;
	private boolean isCapital;
	private boolean isRegionCenter;
	private double square;

	public City(String name, double square) {
		super();
		this.name = name;
		this.square = square;
	}
	
	public City(String name, boolean isRegionCenter, double square) {
		super();
		this.name = name;
		this.isRegionCenter = isRegionCenter;
		this.square = square;
	}

	public City(String name, boolean isCapital, boolean isRegionCenter, double square) {
		super();
		this.name = name;
		this.isCapital = isCapital;
		this.isRegionCenter = isRegionCenter;
		this.square = square;
	}

	public String getName() {
		return name;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public boolean isRegionCenter() {
		return isRegionCenter;
	}

	public double getSquare() {
		return square;
	}

	@Override
	public String toString() {
		return name;
	}

}
