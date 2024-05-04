package Chapter06;

public class _001_Ex6_1_221Page {
	
	public static void main(String[] args) {
		// LinkedList 객체를 생성하면 ListNode 클래스 타입의변수 "head"에 null로 초기화 된다.
		LinkedList L = new LinkedList();
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
		
		L.insertLastNode("월"); 
		L.insertLastNode("수"); 
		L.insertLastNode("일");

		
		
			
		L.printList(); // *에러발생 확인 필요*, insertLastNode메서드 생성자 호출시 매개변수 누락문제.      
	}
}

// 1
class LinkedList {
	private ListNode head; // 노드 객체
	
	public LinkedList() { // 생성자
		head = null; // 기본생성자 null로 초기화
	}
	
	// 중간에 삽입
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data); // 새로 삽입될 노드의 데이터
		
		// 삽입 될 노드의 링크 필드에 pre(삽입할 위치의 앞에 있는 선행자노드 참조번지를)를 저장.
		newNode.link = pre.link; 
		
		// 삽입될 선행자 노드의 링크필드에는 삽입 될 노드의 참조번지를 저장한다.
		pre.link = newNode;
	}
	
	// 마지막 노드에 삽입
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data); // data를 입력받는 생성자 호출
		
		// 공백리스트면
		if(head == null) { // LinkedList 객체생성시 head의 값이 null로 초기화 되어 있으면 ListNode 객체를 head에 담는다.
			this.head = newNode; // head의 클래스 타입이 ListNode다.
		// 공백리스트가 아니면
		} else {
			ListNode temp = head;
			while(temp.link != null) {
				temp = temp.link;
				temp.link = newNode;
			} // while문 끝.
		}
	}
	
	// 마지막 노드 삭제
	public void deleteLastNode() {
		ListNode pre, temp;
		if(head == null) {
			return;
		}
		
		if(head.link == null) {
			head = null;
		} else {
			pre = head;
			temp = head.link;
			while(temp.link != null) {
				pre = temp;
				temp = temp.link;
			} // while 문
			
			pre.link = null;
		}
	}
	
	// 노드 탐색
	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		while(temp != null) {
			if(data == temp.getData()) {
				return temp;
			} else {
				temp = temp.link;
			}
		}
		return temp;
	}
	
	// 노드 뒤집기
	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		while(next != null) {
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;
		} // while문 끝
		
		head = current;
	}
	
	// 노드 출력하기
	public void printList() {
		ListNode temp = this.head;
		System.out.printf("L = (");
		while(temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp != null) {
				System.out.printf(", ");
			}
		} // while문 끝.
		System.out.println(")");
	}
} // LinkedList 끝.

// 2
class ListNode {
	private String data;
	public ListNode link;
	
	// 기본 생성자
	public ListNode() { 
		this.data = null;
		this.link = null;
	}
	
	// data필드 입력받는 생성자
	public ListNode(String data) {
		this.data = data;
		this.link = null;
	}
	
	// data필드, link노드를 입력받는 생성자
	public ListNode(String data, ListNode link) {
		this.data = data;
		this.link = link;
	}
	
	// ListNode객체의 data필드를 반환하는 함수
	public String getData() {
		return this.data;
	}
}