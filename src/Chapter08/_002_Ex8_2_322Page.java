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
		front = 0;
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}
	
	public boolean isEmpty() {
		return (front == rear);
	}
	
	public boolean isFull() {
		return (((rear + 1) % this.queueSize) == front);
	}
	
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println("Inserting fail! Array Circular Queue is full!!");
		} else {
			rear = (rear + 1) % this.queueSize;
			itemArray[rear] = item;
			System.out.println("Inserted Item : " + item);
		}
	}
	
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("Deleteing fail! Array Circular Queue is empty!!");
			return 0;
		} else {
			front = (front + 1) % this.queueSize;
			return itemArray[front];
		}
	}


	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Circular Queue is empty!!");
		} else {
			front = (front + 1) % this.queueSize;
		}
	}

	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Array Circular Queue is empty!!");
			return 0;
		} else {
			return itemArray[(front + 1) % this.queueSize];
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Array Circular Queue is empty!!");
		} else {
			System.out.printf("Array Circular Queue>> ");
			for(int i = (front + 1) % this.queueSize; i != (rear + 1) % this.queueSize; i = ++i % this.queueSize) {
				System.out.printf("%c ", itemArray[i]);
			} // for문 끝.
			
			System.out.println();
			System.out.println();
		}
	}
}


public class _002_Ex8_2_322Page {
	
	public static void main(String[] args) {
		int queueSize = 4;
		char deletedItem;
		ArrayCQueue cQ = new  ArrayCQueue(queueSize); // itemArray 배열생성
		
		cQ.enQueue('A'); // rear=1에 A저장, front=0
		cQ.printQueue(); // 1~1 출력
		
		cQ.enQueue('B'); // rear=2에 B저장, front=0
		cQ.printQueue(); // 1~2 출력
		
		deletedItem = cQ.deQueue(); // rear=2, front=1 A를 출력
		if(deletedItem != 0) { // 삭제 후 반환 값이 0이 아니면 출력
			System.out.println("deleted Item : " + deletedItem);
		}
		cQ.printQueue(); // 시작값 2, 종료값 3 ==> B출력
		
		cQ.enQueue('C'); // rear=3에 C저장, front=1, (3 / 4 == 1)면 isFull
		cQ.printQueue(); // 시작값 2, 종료값 4 ==> B, C 출력
		
		cQ.enQueue('D'); // rear=4에 D저장, front=1, (4 / 4 == 1)면 isFull
		cQ.printQueue(); // 시작값 2, 종료값 5 ==> B, C, D출력
		
		cQ.enQueue('E'); // (5 / 4 == 1)면 isFull
		cQ.printQueue();
	}
}