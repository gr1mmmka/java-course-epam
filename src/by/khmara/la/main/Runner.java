package by.khmara.la.main;

import by.khmara.la.controller.Controller;
import by.khmara.la.controller.ControllerProvider;

public class Runner {

	public static void main(String[] args) {

		// menu logination-registration

		String login = "anton";
		String password = "218941";

		Controller controllerWarehouse = ControllerProvider.getInstance().getWarehouseController();

		String request;
		request = "logination " + "login=" + login + " password=" + password;

		String response = controllerWarehouse.doAction(request);

		String result;
		result = response.split("\s+")[0];

		if (result.equals("0")) {
			System.out.println(response.split("\s+")[1]);

			// main menu
		} else {
			
			// menu logination-registration
		}

	}

}
