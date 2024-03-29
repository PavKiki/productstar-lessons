package ru.productstar.android.methods.circle;

/**
 * Заполните этот класс в соответсвии с заданием из лекции.
 */
public class Circle {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Radius cannot be less than 0");
		}
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
}