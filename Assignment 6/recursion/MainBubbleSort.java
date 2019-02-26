package recursion;

public class MainBubbleSort  {

	 public static void main(String[] args) {
	 System.out.print("Recursion using Bubble Sort Algorithms\n\n");

	 // Array of integers
	 int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };

	 MainBubbleSort sort = new MainBubbleSort();

	 // Print the initial unsorted array
	 System.out.print("Initial Unsorted Array\n");
	 printNumbers(input);
	 // Sort the array
	 int[] output = sort.bubble_srt(input);

	 // Print the final sorted array
	 System.out.print("Final Sorted Array\n");
	 printNumbers(output);

	 }

	 private int[] bubble_srt(int[] input) {
		// TODO Auto-generated method stub
		return null;
	}

	// Method to output an array of integers
	 public static void printNumbers(int[] input) {
	 for (int i = 0; i < input.length; i++) {
	 System.out.print(input[i] + ", ");
	 }
	 System.out.println("\n");
	 }
	}