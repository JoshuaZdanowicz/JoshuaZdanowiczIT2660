package mycar;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello Josh");

	Car porsche = new Car("Dark Green");
	
	System.out.println("The porsche color after the contructor is " + porsche.getColor());
	
	porsche.start();
	
	porsche.setColor("Dark Blue");
	System.out.println("The porsche color after the setter is " + porsche.getColor());
	
	System.out.printf("Josh is going "  +  porsche.getSpeed()); System.out.println(" mph");
	
	
	
	}

}
