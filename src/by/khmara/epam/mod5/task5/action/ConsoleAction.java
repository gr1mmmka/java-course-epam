package by.khmara.epam.mod5.task5.action;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

import by.khmara.epam.mod5.task5.bean.Bouquet;
import by.khmara.epam.mod5.task5.bean.Customer;
import by.khmara.epam.mod5.task5.bean.FlowerShop;
import by.khmara.epam.mod5.task5.bean.Packaging;

public class ConsoleAction {
	private FlowerShop blooming = new FlowerShop("Blooming");

	public void start(Customer customer) {
		System.out.println(
				"Hello! Choose what do you want:\n\n1.Look at range of flowers\n2.Choose type of packaging\n3.Collect a bouquet\n4.Pay for order");

		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			Pattern pattern = Pattern.compile("[1-4]");
			while (!sc.hasNext(pattern)) {
				sc.next();
			}
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				printRangeOfFlowers(customer);
				break;
			case 2:
				choosePackaging(customer);
				break;
			case 3:
				collectBouquet(customer);
				break;
			case 4:
				totalCost(customer);
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void choosePackaging(Customer customer) {
		System.out.println(Arrays.toString(Packaging.values()));

		System.out.println("\nChoose 1 or 2?");

		int choice;
		Pattern pattern = Pattern.compile("[1-2]");

		try (Scanner sc = new Scanner(System.in)) {
			while (!sc.hasNext(pattern)) {
				sc.nextInt();
			}

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				customer.setPack(Packaging.NON_PACKAGING);
				break;
			case 2:
				customer.setPack(Packaging.PAPER_PACKAGING);
				break;
			}
			mainMenu(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void printRangeOfFlowers(Customer customer) {
		System.out.println(blooming.getRange());
		mainMenu(customer);

	}

	private void printCustomerFlowers(Customer customer) {
		System.out.println(customer.getFlowers());
		collectMenu(customer);

	}

	private void collectBouquet(Customer customer) {
		System.out.println("\nWrite some flower from the available: ");
		System.out.println(blooming.getRange());
		String flower;
		Pattern pattern = Pattern.compile("[a-zA-Z]+");

		try (Scanner sc = new Scanner(System.in)) {

			while (!sc.hasNext(pattern)) {
				sc.next();
			}

			flower = sc.next();

			for (int i = 0; i < blooming.getRange().size(); i++) {
				if (flower.equalsIgnoreCase(blooming.getRange().get(i).getName())) {
					customer.getFlowers().add(blooming.getRange().get(i));
					System.out.println(blooming.getRange().get(i) + " added.");
				}
			}
			collectMenu(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void mainMenu(Customer customer) {
		System.out.println(
				"\nChoose what do you want:\n\n1.Look at range of flowers\n2.Choose type of packaging\n3.Collect a bouquet");

		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			Pattern pattern = Pattern.compile("[1-3]");
			while (!sc.hasNext(pattern)) {
				sc.next();
			}
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				printRangeOfFlowers(customer);
				break;
			case 2:
				choosePackaging(customer);
				break;
			case 3:
				collectBouquet(customer);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void collectMenu(Customer customer) {
		System.out.println(
				"\n\n1.Add another flower\n2.Check flowers in your bouquet\n3.Pay for bouquet\n4.Back to the main menu");

		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			Pattern pattern = Pattern.compile("[1-4]");
			while (!sc.hasNext(pattern)) {
				sc.next();
			}
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				collectBouquet(customer);
				break;
			case 2:
				printCustomerFlowers(customer);
				break;
			case 3:
				totalCost(customer);
				break;
			case 4:
				mainMenu(customer);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void totalCost(Customer customer) {
		if (customer.getFlowers() == null || customer.getPack() == null) {
			System.out.println("\nChoose type of packaging and 1 or more flowers to complete the order");
			mainMenu(customer);
		} else {
			Bouquet customerBouquet = new Bouquet(customer.getFlowers(), customer.getPack());

			System.out.println("\nYou bouquet is " + customerBouquet);
			System.out.println("Total cost of your bouquet: "
					+ (customer.getFlowers().stream().map(flower -> flower.getCost()).reduce(0d, (a, b) -> a + b)
							+ customer.getPack().getCost())
					+ "$");
		}
	}
}
