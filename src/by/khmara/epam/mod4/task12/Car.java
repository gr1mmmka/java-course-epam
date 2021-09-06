package by.khmara.epam.mod4.task12;

public class Car {
	private String brand;
	private Engine engine;
	private Wheel[] wheels;
	private boolean isReady;
	
	public Car(String brand, Engine engine, Wheel[] wheels) {
		super();
		this.brand = brand;
		this.engine = engine;
		this.wheels = wheels;

	}
	
	// проверяет исправны ли колеса в машине
	
	public boolean isWheelsReady() {
		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i].isBroken()) {
				return false;
			}
		}
		return true;
	}
	
	//проверяет заправлена машина или нет
	
	public boolean isCarFilled() {
		return engine.isFilled();
	}

	// машина едет
	
	public void go() {
		if (isWheelsReady() && isCarFilled()) {
			System.out.println("Car is going...");
		}
		if (!isCarFilled()) {
			System.out.println("Low level of fuel...");
		}
		if (!isWheelsReady()) {
			System.out.println("change wheels...");
		}

	}

	//заправка топлива
	
	public void fill() {
		System.out.println("Car is filled");
		engine.setFilled(true);
	}
	
	//замена колес

	public void changeWheel() {
		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i].isBroken()) {
				System.out.println("Wheel №" + i + " is repaired");
				wheels[i].setBroken(false);
			}
		}
	}

	//вывести в консоль название машины
	
	public void printBrand() {
		System.out.println(brand);
	}
}
