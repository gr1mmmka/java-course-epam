package by.khmara.epam.mod5.task5.bean;

public enum Packaging {

	NON_PACKAGING(0d), PAPER_PACKAGING(1.5);

	private double cost;

	Packaging(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

}
