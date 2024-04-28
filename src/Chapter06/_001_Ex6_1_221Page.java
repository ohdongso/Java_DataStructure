package Chapter06;

public class _001_Ex6_1_221Page {
	
	public static void main(String[] args) {
		// ==> 여기서부터 시작
		
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
		ListNode newNode = new ListNode();
		if(head == null) {
			this.head = newNode;
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