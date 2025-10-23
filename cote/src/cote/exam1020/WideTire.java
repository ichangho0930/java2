package cote.exam1020;

public class WideTire extends Tire{
	public int width;
	
	public WideTire(String modelName, int maxRotation, int width) {
		super(modelName, maxRotation);
		this.width = width;
	}
}
