package by.khmara.epam.la.controller.impl;

import java.util.List;
import java.util.Scanner;

import by.khmara.epam.la.bean.Treasure;
import by.khmara.epam.la.controller.Command;
import by.khmara.epam.la.presentation.FIndByPriceViewer;
import by.khmara.epam.la.service.ServiceProvider;
import by.khmara.epam.la.service.ServiceTreasure;

public class FindByPriceCommand implements Command {

	@Override
	public String execute() {

		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		ServiceTreasure serviceTreasure = serviceProvider.getServiceTreasure();

		double price = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Type the price: ");

		while (!sc.hasNext("\\d+")) {
			sc.next();
		}
		price = sc.nextDouble();

		List<Treasure> response = serviceTreasure.getTreasuresByPrice(price);
		
		return FIndByPriceViewer.viewer(response, price);
	}

}
