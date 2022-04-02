package ua.lviv.lgs.homework;

public class Engine {
	
private int numberOfCylinders;
	
	public Engine() {}

	public Engine(int numberOfCylinders) {
		super();
		this.numberOfCylinders = numberOfCylinders;
	}

	@Override
	public String toString() {
		return "[numberOfCylinders=" + numberOfCylinders + "]";
	}
	

}
