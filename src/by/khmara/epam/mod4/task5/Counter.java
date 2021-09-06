package by.khmara.epam.mod4.task5;

public class Counter {
	private int min = 0;
	private int max = 10;
	private int value;

	public Counter() {

	}

	public Counter(int value) {
		if (value >= min && value <= max) {
			this.value = value;
		} else {
			this.value = 0;
		}
	}

	public void increase() {
		if (value < max) {
			value++;
		} else {
			value = min;
		}
	}

	public void decrease() {
		if (value > min) {
			value--;
		} else {
			value = max;
		}
	}

	public int getValue() {
		return value;
	}

}
