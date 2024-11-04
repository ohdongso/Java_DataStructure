package Chapter08;

class DQNode {
	char data;
	DQNode rlink;
	DQNode llink;
}

class DQueue {
	DQNode front;
	DQNode rear;
	
	public DQueue() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void insertFront(char item) {
		
	}
	
	public void insertRear(char item) {
		
	}
	
	public char deleteFront() {
		return '0';
	}
	
	public char deleteRear() {
		return '0';
	}
	
	public void removeFront() {
		
	}
	
	public void removeRear() {
		
	}
	
	public char peekFront() {
		return '0';
	}
	
	public char peekRear() {
		return '0';
	}
	
	public void printDQueue() {
		
	}
}

public class _004_Ex8_4_339Page {
	
	public static void main(String[] args) {
		
	}
}