package Chapter07;

interface Stack1 {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class StackNode { // 노드 클래스
	char data;
	StackNode link; // 객체
}

class LinkedStack implements Stack1 {
	private StackNode top; // 최상위 노드객체
	
	@Override
	public boolean isEmpty() { // top이 null이면 true를 반환한다.
		return (top == null);
	}

	@Override
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item; // 새로들어온 노드 객체를 데이터에 저장
		newNode.link = top; // 기존에 최상위 노드객체를 링크에 저장
		top = newNode; // 새로운 노드를 top에 저장
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
				System.out.printf("\t %c \n", temp.data); // top의 데이터 출력
				temp = temp.link; // temp에 그 다음 노드 객체를 저장
			} // while문 끝.
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
