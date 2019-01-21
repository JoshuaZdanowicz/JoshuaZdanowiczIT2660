package mycar;

public class Car extends Vehicle {
	
	private String color;
	private int speed = 250;
	
	
	public Car() {
		
		System.out.println("Inside Car Constructor");
	}
	
	public Car(String c) {
		System.out.println("Inside Overloaded Car Constructor.");
		
		color = c;
	}
	
	public void setColor (String c) {
		color = c;
	}
	
	public String getColor () {
		return color;
	}
	
	public void start () {
		System.out.println("Car started.");
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
