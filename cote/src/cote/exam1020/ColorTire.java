package cote.exam1020;

public class ColorTire extends Tire {
	public String color;
	
	public ColorTire(String modelName, int maxRotation, String color) {
		super(modelName, maxRotation);
		this.color = color;
	}
}