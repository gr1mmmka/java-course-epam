package by.khmara.epam.mod5.task5.bean;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Flower> flowers;
	private Bouquet bouquet;
	private Packaging pack;

	public Customer(String name) {
		this.name = name;
		flowers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public Bouquet getBouquet() {
		return bouquet;
	}

	public Packaging getPack() {
		return pack;
	}

	public void setPack(Packaging pack) {
		this.pack = pack;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	public void setBouquet(Bouquet bouquet) {
		this.bouquet = bouquet;
	}

}
