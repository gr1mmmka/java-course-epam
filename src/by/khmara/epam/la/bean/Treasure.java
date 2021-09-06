package by.khmara.epam.la.bean;

import java.io.Serializable;

public class Treasure implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private double price;

	public Treasure() {

	}

	public Treasure(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", price= " + price + "$";
	}

	@Override
	public int hashCode() {

		return name.hashCode() + 31 * (int) price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null)
			return false;

		if (getClass() != o.getClass())
			return false;

		Treasure treasure = (Treasure) o;
		if (price != treasure.getPrice())
			return false;

		return name.equals(treasure.getName());
	}

}
