package restricteddatastructures;


public class StackMethods {
	int top;
	int size;
	int[] stack;
	
	StackMethods()
	{
		top = -1;
		size =10;
		stack = new int[size];
	}
	
public boolean isEmpty()

{
	return top ==-1;
	
}
	
public boolean isFull()

{
	return top == size -1;
}

public int push(int data)
{
	if(isFull())
	{
		 System.out.println("Stack is full!");
	}
	return stack[++top]=data;
}

public int pop()
{
	if(isEmpty())
	{
		 System.out.println("Stack is empty!");
	}
	
	return stack[top--];
}

public int peek()

{
	return stack[top];
}
	



public void display() 

{
	for(int i:stack)	
	{
		System.out.println(i);

	}
	
}
}


