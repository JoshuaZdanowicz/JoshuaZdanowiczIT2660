package recursion;

public class BubbleSort
{
 
 public int[] bubble_srt(int array[]) {
	 
 }
 
 	 int array [];
	 int i, j, temp = 0;{
		 
	 
		for (i = 0; i < array.length - 1; i++) {
			for (j = 0; j < array.length - 1 - i; j++) {
				
			}
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					
					}
		}}

 
		return array;

	private static void swapNumbers(int i, int j, int[] array) {
	        int temp = array[j];

	        array[j] = array[i];

	        array[i] = temp;
	    }
}