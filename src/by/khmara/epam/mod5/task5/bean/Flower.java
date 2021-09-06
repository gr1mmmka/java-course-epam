package by.khmara.epam.mod5.task5.bean;

public class Flower {
	private String name;
	private int length;
	private double cost;

	public Flower(String name, double cost) {

		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return name + " for " + cost + "$";
	}

	public String getName() {
		return name;
	}

	public int getLength() {
		return length;
	}

	public double getCost() {
		return cost;
	}

}
