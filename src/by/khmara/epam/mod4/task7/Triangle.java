package by.khmara.epam.mod4.task7;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {

	private boolean isExist = true;
	private double sideA;
	private double sideB;
	private double sideC;
	private double ax, ay, bx, by, cx, cy;

	public Triangle(double sideA, double sideB, double sideC) {
		if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		} else {
			isExist = false;
			System.out.println("Triangle with such side doesn't exist :(");
		}
	}

	public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
		this.sideA = sqrt(pow((ax - bx), 2) + pow((ay - by), 2));
		this.sideB = sqrt(pow((cx - bx), 2) + pow((cy - by), 2));
		this.sideC = sqrt(pow((ax - cx), 2) + pow((ay - cy), 2));

		if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {
			this.ax = ax;
			this.ay = ay;
			this.bx = bx;
			this.by = by;
			this.cx = cx;
			this.cy = cy;
		} else {
			isExist = false;
			System.out.println("Triangle with such side doesn't exist :(");
		}
	}

	public double getPerimeter() {
		if(!isExist) {
			return 0;
		}
		
		return sideA + sideB + sideC;
	}

	public double getSquare() {
		if(!isExist) {
			return 0;
		}
		double p = getPerimeter() / 2;

		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

	public double[] intersectionOfMedians() {
		if(!isExist) {
			return null;
		}
		
		double[] cordinates = new double[2];
		double x, y;

		x = (this.ax + this.bx + this.cx) / 3;
		cordinates[0] = x;

		y = (this.ay + this.by + this.cy) / 3;
		cordinates[1] = y;

		return cordinates;
	}
}
