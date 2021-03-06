package by.khmara.epam.mod5.task5.main;

import by.khmara.epam.mod5.task5.action.ConsoleAction;
import by.khmara.epam.mod5.task5.bean.Customer;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * •  Корректно спроектируйте и реализуйте предметную область задачи.
 * •  Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
 * проектирования.
 * •  Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * •  для проверки корректности переданных данных можно применить регулярные выражения.
 * •  Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * •  Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 * Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
 * подарок). Составляющими целого подарка являются сладости и упаковка.
 */

/*
 * Приложение непрерывно до момента пока клиент не выберет и не оплатит заказ
 * 
 */
public class Runner {
	
	public static void main(String[] args) {
		Customer customer = new Customer("Anton Khmara");
		
		ConsoleAction c = new ConsoleAction();
		c.start(customer);
	}

}
