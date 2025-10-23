package cote.exam1020;

public class Tire {
	public String  modelName;
	public int maxRotation;
	public int currentRotation;
	
	public Tire(String modelName, int maxRotation) {
		this.modelName = modelName;
		this.maxRotation = maxRotation;
		this.currentRotation = 0;
	}
	
	public boolean roll() {
		currentRotation += 1;
		/*
		 if (currentRotation > maxRotation)
			return false;
		  else
		  	return true;
		 */
		
		return currentRotation <= maxRotation;
	}
}