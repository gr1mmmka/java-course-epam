package by.khmara.epam.la.service.impl;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import by.khmara.epam.la.bean.Treasure;
import by.khmara.epam.la.dao.DAOProvider;
import by.khmara.epam.la.dao.DAOTreasure;
import by.khmara.epam.la.service.ServiceTreasure;

public class ServiceTreasureImpl implements ServiceTreasure {

	private final DAOProvider provider = DAOProvider.getInstance();
	private final DAOTreasure daoTreasure = provider.getSqlTreasureDAO();

	@Override
	public Map<Treasure, Integer> getTreasures() {

		List<String> lines = daoTreasure.getTreasures();
		Map<Treasure, Integer> treasures = new HashMap<>();

		for (int i = 0; i < lines.size(); i++) {
			String name = lines.get(i).split(";")[0];
			double price = Double.parseDouble(lines.get(i).split(";")[1]);

			Treasure treasure = new Treasure(name, price);

			if (treasures.containsKey(treasure)) {
				treasures.put(treasure, treasures.get(treasure) + 1);
			} else {
				treasures.put(treasure, 1);
			}

		}

		return treasures;
	}

	@Override
	public Optional<Treasure> getTheMostExpansive() {

		Optional<Treasure> treasure = getTreasures().keySet().stream().max(new TreasureComparator());
		return treasure;
	}

	@Override
	public List<Treasure> getTreasuresByPrice(double price) {
		
		List<Treasure> treasures = getTreasures().keySet().stream()
				.filter(t -> t.getPrice() < price).toList();
		return treasures;
	}

	private class TreasureComparator implements Comparator<Treasure> {

		@Override
		public int compare(Treasure o1, Treasure o2) {

			return Double.compare(o1.getPrice(), o2.getPrice());
		}

	}

}
