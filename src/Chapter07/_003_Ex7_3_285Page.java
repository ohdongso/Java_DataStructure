package Chapter07;

interface Stack2 {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class stacknode1 {
	char data;
	stacknode1 link;
}

class LinkedStack1 implements Stack2 {
	private stacknode1 top;
	
	@Override
	public boolean isEmpty() {
		return (top == null);
	}

	@Override
	public void push(char item) {
		stacknode1 newNode = new stacknode1();
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		} else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		} else {
			top = top.link;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Linked Stack is empty!!");
			return 0;
		} else {
			return top.data;
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.printf("Linked Stack is empty!! %n %n");
		} else {
			stacknode1 temp = top;
			System.out.println("Linked Stack>> ");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			} // while�� ��.
			System.out.println();
		}
	} // printStack() �޼��� ��.
}

class OptExp {
	private String exp;
	private int expSize;
	private char testCh, openPair;
	
	// ==> ���⼭ ����
}

public class _003_Ex7_3_285Page {
	
	public static void main(String[] args) {
		
	}
}
