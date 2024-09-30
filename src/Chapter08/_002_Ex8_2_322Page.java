package Chapter08;

interface Queue {
	boolean isEmpty();
	void enQueue(char item);
	char deQueue();
	void delete();
	char peek();
}

class ArrayCQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public ArrayCQueue(int queueSize) {
		
	}
	
	public boolean isEmpty() {
		
		return false;
	}
	
	public boolean isFull() {
		return true;
	}
	
	public void enQueue(char item) {
	
	}

	public char deQueue() {
		
		return 0;
	}


	public void delete() {
		
	}

	public char peek() {
	
		return 0;
	}
	
	public void printQueue() {
		
	}
}


public class _002_Ex8_2_322Page {
	
	public static void main(String[] args) {
		
	}
}