package ua.lviv.lgs.homework;

public class Wheels {
	
	private int wheelRadius;
	private String material;
	
	public Wheels() {

	}
	
	public Wheels(int wheelRadius, String material) {
		super();
		this.wheelRadius = wheelRadius;
		this.material = material;
	}

	@Override
	public String toString() {
		return "[wheelRadius=" + wheelRadius + ", material=" + material + "]";
	}
	

}
