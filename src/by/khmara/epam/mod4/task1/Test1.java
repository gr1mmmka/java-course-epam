package by.khmara.epam.mod4.task1;

public class Test1 {

	private static int x = 10;
	private static int y = 8;

	public void printVariables() {
		System.out.println("X=" + x + ";Y=" + y);
	}

	public int sumOfVariables() {
		return (x + y);
	}

	public int maxOfVariables() {
		return Math.max(y, x);
	}

	public void setX(int x) {
		Test1.x = x;
	}

	public void setY(int y) {
		Test1.y = y;
	}

}
