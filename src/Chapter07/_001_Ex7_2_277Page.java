package Chapter07;

interface Stack1 {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class StackNode { // ��� Ŭ����
	char data;
	StackNode link; // ��ü
}

class LinkedStack implements Stack1 {
	private StackNode top; // �ֻ��� ��尴ü
	
	@Override
	public boolean isEmpty() { // top�� null�̸� true�� ��ȯ�Ѵ�.
		return (top == null);
	}

	@Override
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item; // ���ε��� ��� ��ü�� �����Ϳ� ����
		newNode.link = top; // ������ �ֻ��� ��尴ü�� ��ũ�� ����
		top = newNode; // ���ο� ��带 top�� ����
		System.out.println("Inserted Item : " + item);
	}
	
	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting Fail! Linked Stack is empty!!");
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
			StackNode temp = top;
			System.out.println("Linked Stack>> ");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data); // top�� ������ ���
				temp = temp.link; // temp�� �� ���� ��� ��ü�� ����
			} // while�� ��.
			System.out.println();
		}
	}
}

public class _001_Ex7_2_277Page {
	public static void main(String[] args) {
		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		LS.push('A');
		LS.printStack();
		
		LS.push('B');
		LS.printStack();
		
		LS.push('C');
		LS.printStack();
		
		deletedItem = LS.pop();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		LS.printStack();
	}
}
