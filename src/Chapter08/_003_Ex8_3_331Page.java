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
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}

	public void enQueue(char item) {
		QNode newNode = new QNode();
		newNode.data = item;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
		
		System.out.println("Inserted Item : " + item);
	}

	public char deQueue() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
			return 0;
		} else {
			char item = front.data;
			front = front.link;
			if(front == null) {
				rear = null;
			}
			
			return item;
		} // else ³¡.
	}

	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
		} else {
			front = front.link;
			if(front == null) {
				rear = null;
			}
		}
	}

	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Linked Queue is empty!!");
			return 0;
		} else {
			return front.data;
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.printf("Linked Queue is empty!! %n %n");
		} else {
			QNode temp = front;
			System.out.printf("Linked Queue>> ");
			
			while(temp != null) {
				System.out.printf("%c ", temp.data);
				temp = temp.link;
			} // while¹® ³¡.
			System.out.println();
		}
	}
}

public class _003_Ex8_3_331Page {
	
	public static void main(String[] args) {
		
	}
}