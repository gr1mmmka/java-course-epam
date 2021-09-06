package by.khmara.epam.mod5.task4.bean;

import java.util.Objects;

public class Treasure {
	private String name;
	private int cost;

	public Treasure(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "name=" + name + ", cost=" + cost;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	@Override
	public boolean equals(Object obj) {
		Treasure t = (Treasure) obj;
		return t.getName().equals(name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, cost);
	}

}
