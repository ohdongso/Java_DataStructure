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
	
	public ArrayStack(int stackSize) { // ������
		top = -1; // stack�� index�� ���� ���� -1�̴�.
		this.stackSize = stackSize; // ���� ũ��
		itemArray = new char[this.stackSize]; // ���� �迭 ����
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
	
} // ArrayStack ��.

public class _001_Ex7_1_269Page {
	
	public static void main(String[] args) {
		
	}
}