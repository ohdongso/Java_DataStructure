package Chapter08;

public class _001_Ex8_1_313Page {
	
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
		
		/*	 	
		 	- head�� LinkedList�� ù ��°(����)��带 ����Ų��.
		 	- next�� ù ��° ������ ������ ������ ����Ų��.
		 	- current�� ������ �Ǿ�� �� next ��带 ��� ��ũ�ʵ忡 pre�� �ִ´�.
		 	- pre�� �������� current��尡 �����Ѿ��� ���� ��ũ�ʵ� ��带 �ǹ��Ѵ�.
		 	
			- ���� ��� ���� ==> (��, ��, ��, ��)
			- ù ��° ��尡 �� ��° ����ڸ��� ����, �� ��°�� �����Ѿ� �� ��� ��ũ�ʵ� ���� ������.(link:null) (��, ��, ��, "��")
			- ù ��° ��尡 �� ��° ����ڸ��� ����, �� ��°�� �����Ѿ� �� ��° ��� ��ũ�ʵ� ���� ������.(link:"��") (��, ��, "��", "��")
			- ù ��° ��尡 �� ��° ����ڸ��� ����, �� ��°�� �����Ѿ� �� ��° ��� ��ũ�ʵ� ���� ������.(link:"��") (��, "��", "��", "��")
			- ù ��° ��尡 ù ��° ����ڸ��� ����, ù ��°�� �����Ѿ� �� ��° ��� ��ũ�ʵ� ���� ������.(link:"��") ("��", "��", "��", "��")
		 	
			1, ���� LinkedList���� (��, ��, ��, ��) ������ ��尡 ���� �� �ִ�.
		 	2, next�� head("��")�� �־��ش�.
		 	3, next�� null�� �ƴϸ�, pre(null)�� current(null) ������ �����Ѵ�.
		 	4, current(null)������ next("��")��带 �����Ѵ�.
		 	5, next���� next�� ���� �����("��")�� �����Ѵ�.
			6, current("��")����� ��ũ�ʵ忡�� pre(null)�� �����Ѵ�.
			
			7, ���� LinkedList���� (��, ��, ��, "��") ������ ��尡 ���� �� �ִ�.
			8, next�� null�� �ƴϸ�, pre(null)�� current("��") ������ �����Ѵ�.
			9, current("��")������ next("��")��带 �����Ѵ�.
			10, next���� next�� ���� �����("��")�� �����Ѵ�.
			11, current("��")����� ��ũ�ʵ忡�� pre("��")�� �����Ѵ�.
			
			12, ���� LinkedList���� (��, ��, "��", "��") ������ ��尡 ���� �� �ִ�.
			13, next�� null�� �ƴϸ�, pre("��")�� current("��") ������ �����Ѵ�.
			14, current("��")������ next("��")��带 �����Ѵ�.
			15, next���� next�� ���� �����("��")�� �����Ѵ�.
			16, current("��")����� ��ũ�ʵ忡�� pre("��")�� �����Ѵ�.
			
			17, ���� LinkedList���� (��, "��", "��", "��") ������ ��尡 ���� �� �ִ�.
			18, next�� null�� �ƴϸ�, pre("��")�� current("��") ������ �����Ѵ�.
			19, current("��")������ next("��")��带 �����Ѵ�.
			20, next���� next�� ���� �����(null)�� �����Ѵ�.
			21, current("��")����� ��ũ�ʵ忡�� pre("��")�� �����Ѵ�.
			
			22, ���� LinkedList���� ("��", "��", "��", "��") ������ ��尡 ���� �� �ִ�.
			23, next�� null�̱� ������, head(ù ��° ����ǹ�)�� current ��带 ���� �� �ش�.	
		} // while�� ��
		    
		 */
		L.reverseList();
		L.printList();
		
		System.out.println("(4) ����Ʈ�� ������ ��� �����ϱ�");
		/*
		 	- ���� ��� ==> (��, ��, ��, ��)
			- head�� LinkedList�� ù ��°(����)��带 ����Ų��.
			- pre�� ��ũ�ʵ尡 null�� ��带 ã�Ƴ��� ����, 
			- temp��
			
			1, head�� null�̸� ���鸮��Ʈ�� ������ �Լ��� return �Ѵ�.
			2, head�� ��ũ�ʵ� ���� null�̸� ����Ʈ�� ���� 1���ۿ� ���ٴ� ���̰�, head�� null�� �������ְ� printList()�� ȣ���� �ش�.
			3, ����Ʈ�� 2�� �̻��� ���� �ִٸ�, ó�� �ѹ� "pre"���� head(ù ��° ���)�� "temp"���� head.link(�� ��° ���)�� �����Ѵ�.
			4, temp.link(�� ��° ���)�� null�� �ƴϸ� "pre"(ù��°���)���� "temp"(�ι�°���)�� ����ְ� 
			   "temp"(�ι�°���)���� "temp.link"(����°���)�� ����ش�.
			5, temp.link(�� ��° ���)�� null�� �ƴϸ� "pre"(�ι�°���)���� "temp"(����°���)�� ����ְ�
			   "temp"(����°���)���� "temp.link"(�׹�°���)�� ����ش�.
			6, temp.link(�ټ� ��° ���)�� null�̱� ������ while���� ����ǰ�, 
			   "pre.link"(����°��帵ũ�ʵ� ��, �׹�°����� �ּ� ��)�� null�� �����ϰ� ������ ��带 �������ش�.
		 */
		L.deleteLastNode();
		L.printList();
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
		ListNode next = head; // ���� "��"�����Ͱ� ���� �� �ִ�.
		ListNode current = null;
		ListNode pre = null;
		
		while(next != null) { // ���鸮��Ʈ�� �ƴϸ�
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