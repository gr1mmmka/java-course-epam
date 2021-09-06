package by.khmara.epam.mod5.task2;

import java.util.HashMap;
import java.util.Map;

import by.khmara.epam.mod5.task2.Shop.Good;

public class Payment {

	private int id;
	private Cart cart;

	public Payment() {
		cart = new Cart();
		id++;
	}
	
	public void addGood(Good good, Integer count) {
		cart.goods.put(good, count);
	}

	public double getTotalCost() {
		double totalCost = 0;

		for (Map.Entry<Good, Integer> map : cart.goods.entrySet()) {
			totalCost += map.getKey().getPrice() * map.getValue();
		}
		return totalCost;
	}

	public class Cart {

		private Map<Good, Integer> goods;

		public Cart() {

			goods = new HashMap<>();
		}

		public Map<Good, Integer> getGoods() {
			return goods;
		}

	}

}
