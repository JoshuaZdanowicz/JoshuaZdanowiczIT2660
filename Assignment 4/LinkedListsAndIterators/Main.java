package LinkedListsAndIterators;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> gList = new LinkedList<String>();
		gList.add("Rolls");
		gList.add("Eggs");
		gList.add("Bacon");
		gList.add("Sausage");
		gList.add("Milk");
		
		ListIterator<String> iter = gList.listIterator();
		
		if(iter.hasNext()) {
		 iter.next();
		 iter.add("Fruit");
			
		}
		
		iter.next();
		iter.remove();
		
		for (String item: gList) {
			System.out.println(item+"");
		}

	} 

}
