package Chapter06;

public class _001_Ex6_1_221Page {
	
	public static void main(String[] args) {
		
	}
}

// 1
class LinkedList {
	private ListNode head; // ��� ��ü
	
	public LinkedList() { // ������
		head = null; // �⺻������ null�� �ʱ�ȭ
	}
	
	// �߰��� ����
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data); // ���� ���Ե� ����� ������
		
		// ���� �� ����� ��ũ �ʵ忡 pre(������ ��ġ�� �տ� �ִ� �����ڳ�� ����������)�� ����.
		newNode.link = pre.link; 
		
		// ���Ե� ������ ����� ��ũ�ʵ忡�� ���� �� ����� ���������� �����Ѵ�.
		pre.link = newNode;
	}
	
	// ������ ��忡 ����
	public void insertLastNode() {
		
	}
	
	
	
}

// 2
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