package recursion;

public class RecursionClass {

	public static void main(String[] args) {
		
		RecursionClass recursionTool = new RecursionClass();
		
		recursionTool.calculateSquaresToPrint(10);
		
		
		System.out.println("GET TRIANGULAR NUMBER");
		
		System.out.println("Recursion Triangular Number: " + recursionTool.getTriangularNumR(6));
		
		System.out.println("\nGET FACTORIAL");
		
		System.out.println("Factorial: " + recursionTool.getFactorial(3));
		
	}
	
	
	
	// Calculate triangular number using recursion
	
	public int getTriangularNumR(int number){
		
		System.out.println("Method " + number);
		
		if(number == 1){
			
			System.out.println("Returned 1");
			
			return 1;
			
		} else {
			
			int result = number + getTriangularNumR(number - 1);
			
			System.out.print("Return " + result);
			
			System.out.println(" : " + number + " + getFactorial(" + number + " - 1)");
			
			return result;
			
		}
		
	}
	
	// Returns the factorial of a number
	// factorial(3) = 3 * 2 * 1
	
	public int getFactorial(int number){
		
		System.out.println("Method " + number);
		
		if(number == 1){
			
			System.out.println("Returned 1");
			
			return 1;
			
		} else {
			
			int result = number * getFactorial(number - 1);
			
			System.out.print("Return " + result);
			
			System.out.println(" : " + number + " * getFactorial(" + number + " - 1)");
			
			return result;
			
		}
		
	}
	
	
	// USED TO DEMONSTRATE TRIANGULAR NUMBERS --------------------
	
	// Draws the number of squares that are passed in horizontally 
	
		public void drawSquares(int howManySquares){
			
			for(int i = 0; i < howManySquares; i++) System.out.print(" --  ");
			
			System.out.println();
				
			for(int i = 0; i < howManySquares; i++) System.out.print("|" + howManySquares + " | ");
			
			System.out.println();
				
			for(int i = 0; i < howManySquares; i++) System.out.print(" --  ");
				
			System.out.println("\n");
			
		}
		
		// Outputs the number of squares to print to represent a triangle
		
		public void calculateSquaresToPrint(int number){
			
			for(int i = 1; i <= number; i++){
				
				for(int j = 1; j < i; j++){
				
					drawSquares(j);
				
				
				}
				
				System.out.println("Triangular Number: " + calcTriangularNum(i));
				
			}
			
		}
		
		public double calcTriangularNum(int number){
			
			return .5 * number * (1 + number);
			
		}


	}


