package Chapter07;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		return 0;
	}
	
} // ArrayStack 끝.

public class _001_Ex7_1_269Page {
	
	public static void main(String[] args) {
		
	}
}