package by.khmara.epam.mod5.task2;

import java.util.List;

public class Shop {

	private String name;
	private List<Good> goods;

	public Shop(String name) {
		goods = List.of(new Good("iphone XR", 750), new Good("case", 10), new Good("charger", 50), new Good("USB", 10),
				new Good("safety glass", 10), new Good("sticer", 2));
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Good> getGoods() {
		return goods;
	}

	protected class Good {

		private String name;
		private double price;

		public Good(String name, double price) {

			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public boolean equals(Object obj) {
			Good good = (Good) obj;
			return name.equals(good.getName());
		}

		@Override
		public String toString() {
			return "Good [name=" + name + ", price=" + price + "]";
		}

	}
}
