package by.khmara.epam.mod6.task1.main;

import by.khmara.epam.mod6.task1.console.Authorization;

/*
 * Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
 * Общие требования к заданию: 
 * • Система учитывает книги как в электронном, так
 * и в бумажном варианте. 
 * • Существующие роли: пользователь, администратор. 
 * • Пользователь может просматривать книги в каталоге книг, осуществлять поиск
 * книг в каталоге. 
 * • Администратор может модифицировать каталог.
 * • **При просмотре каталога желательно реализовать
 * постраничный просмотр 
 * • Каталог книг хранится в текстовом файле. 
 * • Данные аутентификации пользователей хранятся в текстовом
 * файле. Пароль не хранится в открытом виде
 * 
 */

public class Runner {

	public static void main(String[] args) {

		Authorization a = new Authorization();
		a.welcome();

	}

}
