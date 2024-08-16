package Chapter07;

interface Stack2 {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class StackNode1 {
	char data;
	StackNode1 link;
}

class LinkedStack1 implements Stack2 {

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
}

class OptExp {
	private String exp;
	private int expSize;
	private char testCh, openPair;
}

public class _003_Ex7_3_285Page {
	
	public static void main(String[] args) {
		
	}
}
