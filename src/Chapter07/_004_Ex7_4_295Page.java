package Chapter07;

class StackNode2 {
	int data;
	StackNode2 link;
}

class LinkedStack2 {
	private StackNode2 top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(int item) {
		StackNode2 newNode = new StackNode2();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		} else {
			int item = top.data;
			top = top.link;
			return item;
		}
	}
}

public class _004_Ex7_4_295Page {
	
	public static void main(String[] args) {
		
	}
}