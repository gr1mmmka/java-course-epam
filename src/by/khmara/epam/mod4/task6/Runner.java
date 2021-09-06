package by.khmara.epam.mod4.task6;

/*
 * Составить описание класса для представления времени. Предусмотреть
 * возможности установки времени и изменении его отдельных частей (час,
 * минута,секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимости значений полей, поле установить в значение "0". Создать методы
 * изменения времени на заданное количество секунд, минут, часов.
 */

public class Runner {

	public static void main(String[] args) {
		Time time = new Time(12, 0, 0);

		time.changeTime(1, 3, 10);
		time.changeHours(-2);
		time.changeMinutes(100);
		time.changeSeconds(250);
		
		System.out.println(time);

	}

}
