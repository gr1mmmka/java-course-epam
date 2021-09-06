package by.khmara.epam.mod5.task4.bean;

import java.util.ArrayList;

public abstract class Hero {

	private String name;
	private int damage;
	private ArrayList<Treasure> bag;

	public Hero(String name, int damage) {
		bag = new ArrayList<>();
		this.name = name;
		this.damage = damage;
	}

	public abstract void atack(Dragon dragon);

	public ArrayList<Treasure> getBag() {
		return bag;
	}

	public void setBag(ArrayList<Treasure> bag) {
		this.bag = bag;
	}

	public String getName() {
		return name;
	}

	public int getDamage() {
		return damage;
	}

}
