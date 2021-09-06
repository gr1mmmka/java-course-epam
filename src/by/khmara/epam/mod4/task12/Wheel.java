package by.khmara.epam.mod4.task12;

public class Wheel {
	private boolean isBroken;
	private int diameter;

	public Wheel(boolean isBroken, int diameter) {
		super();
		this.isBroken = isBroken;
		this.diameter = diameter;
	}

	public boolean isBroken() {
		return isBroken;
	}

	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

}
