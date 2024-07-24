package Chapter07;

import java.util.Arrays;

interface Stack {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class ArrayStack implements Stack {
	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) { // 생성자
		top = -1; // stack의 index의 시작 값은 -1이다.
		this.stackSize = stackSize; // 스택 크기
		itemArray = new char[this.stackSize]; // 스택 배열 생성
	}
	
	@Override
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == this.stackSize - 1);
	}
	
	@Override
	public void push(char item) {
		if(isFull()) {
			System.out.println("Inserting fail! Array Stack is full!!");
		} else {
			itemArray[++top] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
			return 0;
		} else {
			return itemArray[top--];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
		} else {
			top--;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty!!");
			return 0;
		} else {
			return itemArray[top];
		}
	}
	
	public void printStack() {
		if(isEmpty())
			System.out.println("Array Stack is empty!! %n %n");
		else {
			System.out.printf("Array Stack>> ");
			for(int i = 0; i <= top; i++)
				System.out.printf("%c ", itemArray[i]);
			System.out.println(); System.out.println();
		}
	}

	public char[] getItemArray() {
		return itemArray;
	}
} // ArrayStack 끝.

public class _001_Ex7_1_269Page {
	
	public static void main(String[] args) {
		int stackSize = 5;
		char deletedItem;
		ArrayStack S = new ArrayStack(stackSize);
		
		S.push('A');
		S.printStack();
		
		S.push('B');
		S.printStack();
		
		S.push('C');
		S.printStack();
		
		deletedItem = S.pop();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		S.printStack();
		
		// top의 위치면 변경되서, pop을 했다고 하기에는 어려움이 있다.
		System.out.println(Arrays.toString(S.getItemArray()));
	}
}