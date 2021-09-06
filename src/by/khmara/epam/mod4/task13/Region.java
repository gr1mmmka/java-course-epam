package by.khmara.epam.mod4.task13;

import java.util.List;

public class Region {
	private int id;
	private String name;
	private List<District> districts;

	public Region(int id, String name, List<District> districts) {
		super();
		this.id = id;
		this.name = name;
		this.districts = districts;
	}

	public String getName() {
		return name;
	}

	public List<District> getDistricts() {
		return districts;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", name=" + name + ", districts=" + districts + "]";
	}
	
	
	

}
