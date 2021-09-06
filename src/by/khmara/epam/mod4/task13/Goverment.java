package by.khmara.epam.mod4.task13;

import java.util.List;

public class Goverment {
	private String name;
	private List<Region> regions;

	public Goverment(String name, List<Region> regions) {
		super();
		this.name = name;
		this.regions = regions;
	}

	//выводит в консоль столицу 
	
	public void printCapital() {
		for (int i = 0; i < regions.size(); i++) {
			for (int j = 0; j < regions.get(i).getDistricts().size(); j++) {
				if (regions.get(i).getDistricts().get(j).getCity().isCapital()) {
					System.out.println(regions.get(i).getDistricts().get(j).getCity());
				}
			}
		}
	}

	//выводит в консоль количество областей
	
	public void printCountOfRegions() {
		System.out.println(regions.size());
	}

	//выводит в консоль общую плозадь государства
	
	public void printTotalSquare() {
		double totalSquare = 0;

		for (int i = 0; i < regions.size(); i++) {
			for (int j = 0; j < regions.get(i).getDistricts().size(); j++) {
				totalSquare += regions.get(i).getDistricts().get(j).getSquare();
			}
		}

		System.out.println(totalSquare);
	}
	
	// выводит в консоль областные центры государства
	
	public void printRegionsCenter() {
		for (int i = 0; i < regions.size(); i++) {
			for (int j = 0; j < regions.get(i).getDistricts().size(); j++) {
				if (regions.get(i).getDistricts().get(j).getCity().isRegionCenter()) {
					System.out.println("Center of " + regions.get(i).getName() + " is "
							+ regions.get(i).getDistricts().get(j).getCity());

				}

			}
		}
	}

	@Override
	public String toString() {
		return "Goverment [name=" + name + "]";
	}

}
