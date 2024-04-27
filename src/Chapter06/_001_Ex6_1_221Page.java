package Chapter06;

public class _001_Ex6_1_221Page {
	
	public static void main(String[] args) {
		
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
	public void insertLastNode() {
		
	}
	
	
	
}

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