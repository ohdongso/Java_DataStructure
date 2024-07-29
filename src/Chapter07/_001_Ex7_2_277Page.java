package Chapter07;

interface Stack1 {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class StackNode {
	char data;
	StackNode link;
}

class LinkeStack implements Stack1 {
	private StackNode top;
	
	@Override
	public boolean isEmpty() {	
		return false;
	}

	@Override
	public void push(char item) {
	}

	@Override
	public char pop() {	
		return 0;
	}

	@Override
	public void delete() {
	}

	@Override
	public char peek() {
		return 0;
	}
}

public class _001_Ex7_2_277Page {
	public static void main(String[] args) {
		
	}
}