package Chapter06;

public class _001_Ex6_1_221Page {
	
	public static void main(String[] args) {
		
	}
}

class LinkedList {
	
}

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