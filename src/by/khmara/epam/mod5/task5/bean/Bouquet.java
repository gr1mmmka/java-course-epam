package by.khmara.epam.mod5.task5.bean;

import java.util.List;

public class Bouquet {
	private List<Flower> flowers;
	private Packaging pack;

	public Bouquet(List<Flower> flowers, Packaging pack) {

		this.flowers = flowers;
		this.pack = pack;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public Packaging getPack() {
		return pack;
	}

	@Override
	public String toString() {
		return "[flowers=" + flowers + ", pack=" + pack + "]";
	}
	
	

}
