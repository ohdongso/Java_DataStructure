package Chapter08;

interface Queue1 {
	boolean isEmpty();
	void enQueue(char item);
	char deQueue();
	void delete();
	char peek();
}

class QNode {
	char data;
	QNode link;
}

class LinkedQueue implements Queue1 {
	QNode front;
	QNode rear;
	
	public LinkedQueue() {
		// ==> 여기서 부터
	}
	
	public boolean isEmpty() {
		return false;
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

public class _003_Ex8_3_331Page {
	
	public static void main(String[] args) {
		
	}
}