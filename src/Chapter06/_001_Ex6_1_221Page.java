package Chapter06;

public class _001_Ex6_1_221Page {
	
	public static void main(String[] args) {
		// LinkedList 객체를 생성하면 ListNode 클래스 타입의변수 "head"에 null로 초기화 된다.
		LinkedList L = new LinkedList();
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
		
		// 20240505 ==> 이부분 손디버깅해서 정확한 로직파악 필요
		// "월"을 데이터 필드에 저장한 newNode를 생성 후 head가 현재 null 때문에, newNode를 head에 담아준다.
		L.insertLastNode("월"); 
		
		// "수"를 데이터 필드에 저장한 newNode를 생성 후 head가 현재 null이 아니기 때문에, temp에 head를 담아준다.
		// temp에 담긴 head의 link는 null이기 때문에, temp(head)의 link필드에 newNode를 저장한다.
		L.insertLastNode("수");
		
		// "일"을 데이터 필드에 저장한 newNode를 생성 후 head가 현재 null이 아니기 때문에, temp에 head를 담아준다.
		// temp에 담긴 head의 link는 null이 아니기 때문에, temp(head)의 기존에 link필드에 새로운 newNode를 저장한다.
		L.insertLastNode("일");
		
		// head를 temp변수에 담고, 단순연결리스트에 값이 들어 있으면, 현재 temp data필드값을 출력하고, 
		// 다음노드 링크를 저장, 다음노드 링크 값이 null이 아니면, ", " 출력 후 위의 과정 반복
		L.printList(); 
	
	
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
			// data 매개변수가 멤버변수로 들어간 ListNode객체를 head에 담는다.
			this.head = newNode; // head의 클래스 타입이 ListNode다.
		// 공백리스트가 아니면
		} else {
			ListNode temp = head; // 임시 ListNode인 temp에 기존에 저장 돼 있는 head노드를 저장한다.
			while(temp.link != null) {
				temp = temp.link;
			} // while문 끝.
			
			temp.link = newNode;
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
		ListNode temp = this.head; // head는 제일 앞의 노드를 가리키는거 같네.
		System.out.printf("L = (");
		while(temp != null) { // 단순연결리스트에 값이 들어 있으면
			System.out.printf(temp.getData());
			temp = temp.link; // 다음노드 링크를 저장
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