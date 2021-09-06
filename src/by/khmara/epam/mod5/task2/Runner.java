package by.khmara.epam.mod5.task2;

/*
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать
 * покупку из нескольких товаров.
 */

public class Runner {

	public static void main(String[] args) {

		Shop apple = new Shop("Apple shop");

		Payment payment = new Payment();

		// добавляем в корзину товары

		payment.addGood(apple.getGoods().get(0), 1);
		payment.addGood(apple.getGoods().get(1), 2);

		System.out.println("To pay: " + payment.getTotalCost());
	}
}
