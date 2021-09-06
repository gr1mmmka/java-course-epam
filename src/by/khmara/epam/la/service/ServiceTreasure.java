package by.khmara.epam.la.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import by.khmara.epam.la.bean.Treasure;

public interface ServiceTreasure {
	
	//all treasures in the cave and count of them
	
	Map<Treasure, Integer> getTreasures();
	
	// the most expensive treasure
	
	Optional<Treasure> getTheMostExpansive();
	
	// get treasures by price
	
	List<Treasure> getTreasuresByPrice(double price);
	
	
}
