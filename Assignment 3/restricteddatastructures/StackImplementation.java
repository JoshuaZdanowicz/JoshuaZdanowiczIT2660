package restricteddatastructures;

public class StackImplementation extends StackMethods{

public static void main(String[]args) {
	
	System.out.println("Stack Results:");
	
	StackImplementation st = new StackImplementation();
	st.push(50);
	st.push(5);
	st.push(500);
	st.push(500350);
	st.push(500500);
	st.push(50000);
	
	System.out.println("Booleaan Vaule of Stack Size:");

	
	System.out.println(st.isEmpty());
	System.out.println(st.isFull());
	System.out.println("Maximum Stack Size:");
	System.out.println(st.size);
	System.out.println("1st Peek Result:");
	System.out.println(st.peek());
	System.out.println("Removed Stack Vaule:");
	System.out.println(st.pop());
	System.out.println("2nd Peek Result:"); 
	System.out.println(st.peek());
	System.out.println("Display of Full Stack Size Including Empty/Unused Size:"); 
    st.display();

	}
}