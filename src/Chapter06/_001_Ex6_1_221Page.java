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
	
	// �⺻ ������
	public ListNode() { 
		this.data = null;
		this.link = null;
	}
	
	// data�ʵ� �Է¹޴� ������
	public ListNode(String data) {
		this.data = data;
		this.link = null;
	}
	
	// data�ʵ�, link��带 �Է¹޴� ������
	public ListNode(String data, ListNode link) {
		this.data = data;
		this.link = link;
	}
	
	// ListNode��ü�� data�ʵ带 ��ȯ�ϴ� �Լ�
	public String getData() {
		return this.data;
	}
}