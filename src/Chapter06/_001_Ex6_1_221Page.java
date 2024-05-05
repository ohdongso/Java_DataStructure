package Chapter06;

public class _001_Ex6_1_221Page {
	
	public static void main(String[] args) {
		// LinkedList ��ü�� �����ϸ� ListNode Ŭ���� Ÿ���Ǻ��� "head"�� null�� �ʱ�ȭ �ȴ�.
		LinkedList L = new LinkedList();
		System.out.println("(1) ���� ����Ʈ�� ��� 3�� �����ϱ�");
		
		// 20240505 ==> �̺κ� �յ�����ؼ� ��Ȯ�� �����ľ� �ʿ�
		// "��"�� ������ �ʵ忡 ������ newNode�� ���� �� head�� ���� null ������, newNode�� head�� ����ش�.
		L.insertLastNode("��"); 
		
		// "��"�� ������ �ʵ忡 ������ newNode�� ���� �� head�� ���� null�� �ƴϱ� ������, temp�� head�� ����ش�.
		// temp�� ��� head�� link�� null�̱� ������, temp(head)�� link�ʵ忡 newNode�� �����Ѵ�.
		L.insertLastNode("��");
		
		// "��"�� ������ �ʵ忡 ������ newNode�� ���� �� head�� ���� null�� �ƴϱ� ������, temp�� head�� ����ش�.
		// temp�� ��� head�� link�� null�� �ƴϱ� ������, temp(head)�� ������ link�ʵ忡 ���ο� newNode�� �����Ѵ�.
		L.insertLastNode("��");
		
		// head�� temp������ ���, �ܼ����Ḯ��Ʈ�� ���� ��� ������, ���� temp data�ʵ尪�� ����ϰ�, 
		// ������� ��ũ�� ����, ������� ��ũ ���� null�� �ƴϸ�, ", " ��� �� ���� ���� �ݺ�
		L.printList(); 
	
	
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
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data); // data�� �Է¹޴� ������ ȣ��
		
		// ���鸮��Ʈ��
		if(head == null) { // LinkedList ��ü������ head�� ���� null�� �ʱ�ȭ �Ǿ� ������ ListNode ��ü�� head�� ��´�.
			// data �Ű������� ��������� �� ListNode��ü�� head�� ��´�.
			this.head = newNode; // head�� Ŭ���� Ÿ���� ListNode��.
		// ���鸮��Ʈ�� �ƴϸ�
		} else {
			ListNode temp = head; // �ӽ� ListNode�� temp�� ������ ���� �� �ִ� head��带 �����Ѵ�.
			while(temp.link != null) {
				temp = temp.link;
			} // while�� ��.
			
			temp.link = newNode;
		}
	}
	
	// ������ ��� ����
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
			} // while ��
			
			pre.link = null;
		}
	}
	
	// ��� Ž��
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
	
	// ��� ������
	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		while(next != null) {
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;
		} // while�� ��
		
		head = current;
	}
	
	// ��� ����ϱ�
	public void printList() {
		ListNode temp = this.head; // head�� ���� ���� ��带 ����Ű�°� ����.
		System.out.printf("L = (");
		while(temp != null) { // �ܼ����Ḯ��Ʈ�� ���� ��� ������
			System.out.printf(temp.getData());
			temp = temp.link; // ������� ��ũ�� ����
			if(temp != null) {
				System.out.printf(", ");
			}
		} // while�� ��.
		System.out.println(")");
	}
	
	
} // LinkedList ��.

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