package Chapter06;

public class _001_Ex6_1_221Page {
	
	public static void main(String[] args) {
		// LinkedList ��ü�� �����ϸ� ListNode Ŭ���� Ÿ���Ǻ��� "head"�� null�� �ʱ�ȭ �ȴ�.
		LinkedList L = new LinkedList();
		
		System.out.println("(1) ���� ����Ʈ�� ��� 3�� �����ϱ�");
		
		// "��"�� ������ �ʵ忡 ������ newNode�� ���� �� ù ��° ���̱� ������, "��"�� ��� newNode��ü�� head�� ����ش�.
		L.insertLastNode("��");
		
		// "��"�� ������ �ʵ忡 ������ newNode�� ���� �� �� ��° ���̱� ������, temp�� "��"��带 ���
		// temp("��" ���)�� ��ũ�ʵ尡 null�̱� ������, temp("��" ���)�� ��ũ�ʵ忡 newNode("��" ���)�� ��ũ�� �������ش�.
		L.insertLastNode("��");
		
		
		// "��"�� ������ �ʵ忡 ������ newNode�� ���� �� �� ��° ���̱� ������, temp�� "��"��带 ���
		// temp("��" ���)�� ��ũ�ʵ尡 null�� �ƴϱ� ������, 
		// { temp = temp.link } == { temp("��", "��") = temp("��" ���) }�� ��´�.
		// ��������� head�� �� ��° ��� "��"��带 ����Ų��. �׸��� "��"����� link�ʵ忡 newNode("��" ���)�� ��ũ�� �������ش�.
		L.insertLastNode("��");
		
		// ù ��° ������ ���������� ����Ѵ�.
		L.printList(); 
		
		System.out.println("(2) �� ��� �ڿ� �� ��� �����ϱ�");
		
		// head�� ù ��° ��带 ����Ų��.
		// data("��")�� �ش��ϴ� ������ �ʵ尪�� ù ��° ������ ���ؼ� ã�Ƴ���.
		ListNode pre = L.searchNode("��");
		
		if(pre == null) {
			System.out.println("�˻�����>> ã�� �����Ͱ� �����ϴ�.");
		} else {
			// pre�� ���� "��" ��尡 ���� �� �ִ�. �׸��� ���� �� "��" �����͸� �Լ��� �Ű������� �����Ѵ�.
			// ���� ���� �� "��" newNode��ü�� �����Ѵ�. ��ũ�ʵ�� null�� ���� �� �ִ�.
			// "��"����� ��ũ�ʵ忡 "��"����� ��ũ�ʵ� ���� �־��ش�.(���������� ��ũ�ʵ� ���� �־��ش�.)
			// "��"����� ��ũ�ʵ忡 "��"����� ��ũ�ʵ� ���� �־��ش�.(������ �ִ� ��� ���� �ֽ�ȭ�����ش�.)
			L.insertMiddleNode(pre, "��");
			
			// ù ��° ������ ���������� ����Ѵ�. 
			L.printList();
		}
		
		System.out.println("(3) ����Ʈ�� ��带 �������� �ٲٱ�");
		
	}
}

// 1
class LinkedList {
	private ListNode head; // ��� ��ü
	
	public LinkedList() { // �⺻ ������
		head = null; // �⺻������ null�� �ʱ�ȭ
	}
	
	// �߰��� ����
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data); // ���� ���Ե� "��" ��带 �����Ѵ�.
		
		// "��"����� ��ũ�ʵ忡 "��"����� ��ũ�ʵ� ���� �־��ش�.(���������� ��ũ�ʵ� ���� �־��ش�.)
		newNode.link = pre.link; 
		
		// "��"����� ��ũ�ʵ忡 "��"����� ��ũ�ʵ� ���� �־��ش�.(������ �ִ� ��� ���� �ֽ�ȭ�����ش�.)
		pre.link = newNode;
	}
	
	// ������ ��忡 ����
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data); // data�� �Է¹޴� ������ ȣ��
		
		// ���鸮��Ʈ��
		if(head == null) {
			this.head = newNode;
			
		// ���鸮��Ʈ�� �ƴϸ�
		} else {
			ListNode temp = head;
			while(temp.link != null) {
				temp = temp.link;
			} // while�� ��.
			
			temp.link = newNode;
		}
	} // insertLastNode ��.
	
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
		ListNode temp = this.head; // head�� ó�� ����� ��带 ����Ű�� �ִ�.
		System.out.printf("L = (");
		while(temp != null) { // �ܼ����Ḯ��Ʈ�� ���� ��� ������
			System.out.printf(temp.getData()); // ����� ������ ���
			temp = temp.link; // ������� ��ũ�� ����
			if(temp != null) { // ������� ��ũ�� ���� ����� ��ũ�� ���� �� ������ �޸��� ����Ѵ�.
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