package by.khmara.epam.la.controller.impl;

import by.khmara.epam.la.controller.Command;
import by.khmara.epam.la.presentation.TheMostExpensiveViewer;
import by.khmara.epam.la.service.ServiceProvider;
import by.khmara.epam.la.service.ServiceTreasure;

public class FindTreasureCommand implements Command {

	@Override
	public String execute() {
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		ServiceTreasure serviceTreasure = serviceProvider.getServiceTreasure();

		return TheMostExpensiveViewer.viewer(serviceTreasure.getTheMostExpansive().get());
	}

}
