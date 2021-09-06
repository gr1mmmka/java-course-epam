package by.khmara.epam.mod4.task4;

import java.time.LocalDateTime;
import java.util.Arrays;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер
 * поезда, время отправления. Создайте данные в массив из пяти элементов типа
 * Train, добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен
 * пользователем. Добавьте возможность сортировки массива по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по
 * времени отправления.
 */

public class Runner {

	public static void main(String[] args) {

		Train[] trains = new Train[] { new Train("Minsk", 120, LocalDateTime.of(2021, 07, 23, 10, 10)),
				new Train("Gomel", 03, LocalDateTime.of(2021, 07, 20, 11, 15)),
				new Train("Krakov", 777, LocalDateTime.of(2021, 07, 21, 14, 30)),
				new Train("Minsk", 100, LocalDateTime.of(2021, 07, 22, 13, 45)),
				new Train("Riga", 104, LocalDateTime.of(2021, 07, 22, 15, 05))

		};

		Action action = new Action();
		action.sortByNumberOfTrain(trains);
		System.out.println(Arrays.toString(trains));

		action.printTrainInfo(trains, 3);

		action.sortByDestinationAndTime(trains);
		System.out.println(Arrays.toString(trains));

	}

}
