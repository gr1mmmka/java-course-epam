package by.khmara.epam.la.controller.impl;

import java.util.Map;

import by.khmara.epam.la.bean.Treasure;
import by.khmara.epam.la.controller.Command;
import by.khmara.epam.la.presentation.TreasuresViewer;
import by.khmara.epam.la.service.ServiceProvider;

public class ViewAllCommand implements Command {

	@Override
	public String execute() {


		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		Map<Treasure, Integer> treasures = serviceProvider.getServiceTreasure().getTreasures();
		
		
		return TreasuresViewer.viewer(treasures);
	}

}
