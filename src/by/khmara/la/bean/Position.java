package by.khmara.la.bean;

public class Position {

	private String name;
	private double price;

	public Position(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Position() {
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
		return "Position [name=" + name + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null) {
			return false;
		}

		if (getClass() != o.getClass()) {
			return false;
		}

		Position position = (Position) o;

		return name.equals(position.getName()) ? true : false;
	}

	@Override
	public int hashCode() {

		return 31 * name.hashCode();
	}

}
