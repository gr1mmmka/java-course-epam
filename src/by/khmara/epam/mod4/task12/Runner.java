package by.khmara.epam.mod4.task12;

/*
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы
 * ехать, заправляться, менять колесо. Вывести на консоль марку автомобиля.
 */

public class Runner {

	public static void main(String[] args) {
		String audi = "Audi";
		
		Wheel wheel1 = new Wheel(false, 17);
		Wheel wheel2 = new Wheel(true, 17);
		Wheel wheel3 = new Wheel(false, 17);
		Wheel wheel4 = new Wheel(false, 17);

		Engine engine = new Engine(false, 3);
		
		Car car = new Car(audi, engine, new Wheel[] {wheel1, wheel2, wheel3, wheel4});
		
		car.go();
		car.changeWheel();
		car.fill();
		
		car.go();
	}

}
