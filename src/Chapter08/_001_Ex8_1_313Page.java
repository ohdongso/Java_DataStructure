package Chapter08;

public class _001_Ex8_1_313Page {
	
	public static void main(String[] args) {
		// LinkedList 객체를 생성하면 ListNode 클래스 타입의변수 "head"에 null로 초기화 된다.
		LinkedList L = new LinkedList();
		
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
		
		// "월"을 데이터 필드에 저장한 newNode를 생성 후 첫 번째 값이기 때문에, "월"이 담긴 newNode객체를 head에 담아준다.
		L.insertLastNode("월");
		
		// "수"를 데이터 필드에 저장한 newNode를 생성 후 두 번째 값이기 때문에, temp에 "월"노드를 담고
		// temp("월" 노드)의 링크필드가 null이기 때문에, temp("월" 노드)의 링크필드에 newNode("수" 노드)의 링크를 저장해준다.
		L.insertLastNode("수");
		
		// "일"을 데이터 필드에 저장한 newNode를 생성 후 세 번째 값이기 때문에, temp에 "월"노드를 담고
		// temp("월" 노드)의 링크필드가 null이 아니기 때문에, 
		// { temp = temp.link } == { temp("월", "수") = temp("수" 노드) }를 담는다.
		// 결과적으로 head는 두 번째 담긴 "수"노드를 가리킨다. 그리고 "수"노드의 link필드에 newNode("일" 노드)의 링크를 저장해준다.
		L.insertLastNode("일");
		
		// 첫 번째 노드부터 순차적으로 출력한다.
		L.printList(); 
		
		System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기");
		
		// head는 첫 번째 노드를 가리킨다.
		// data("수")에 해당하는 데이터 필드값을 첫 번째 노드부터 비교해서 찾아낸다.
		ListNode pre = L.searchNode("수");
		
		if(pre == null) {
			System.out.println("검색실패>> 찾는 데이터가 없습니다.");
		} else {
			// pre는 현재 "수" 노드가 저장 돼 있다. 그리고 저장 할 "금" 데이터를 함수의 매개변수로 전달한다.
			// 새로 삽일 할 "금" newNode객체를 생성한다. 링크필드는 null로 저장 돼 있다.
			// "금"노드의 링크필드에 "수"노드의 링크필드 값을 넣어준다.(마지막값의 링크필드 값을 넣어준다.)
			// "수"노드의 링크필드에 "금"노드의 링크필드 값을 넣어준다.(기존에 있던 노드 값을 최신화시켜준다.)
			L.insertMiddleNode(pre, "금");
			
			// 첫 번째 노드부터 순차적으로 출력한다. 
			L.printList();
		}
		
		System.out.println("(3) 리스트의 노드를 역순으로 바꾸기");
		
		/*	 	
		 	- head는 LinkedList의 첫 번째(시작)노드를 가리킨다.
		 	- next는 첫 번째 노드부터 마지막 노드까지 가리킨다.
		 	- current는 리버스 되어야 할 next 노드를 담고 링크필드에 pre를 넣는다.
		 	- pre는 리버스된 current노드가 가리켜야할 다음 링크필드 노드를 의미한다.
		 	
			- 기존 노드 정렬 ==> (월, 수, 금, 일)
			- 첫 번째 노드가 네 번째 노드자리로 가서, 네 번째가 가리켜야 될 노드 링크필드 값을 가진다.(link:null) (수, 금, 일, "월")
			- 첫 번째 노드가 세 번째 노드자리로 가서, 세 번째가 가리켜야 될 번째 노드 링크필드 값을 가진다.(link:"월") (금, 일, "수", "월")
			- 첫 번째 노드가 두 번째 노드자리로 가서, 두 번째가 가리켜야 될 번째 노드 링크필드 값을 가진다.(link:"수") (일, "금", "수", "월")
			- 첫 번째 노드가 첫 번째 노드자리로 가서, 첫 번째가 가리켜야 될 번째 노드 링크필드 값을 가진다.(link:"금") ("일", "금", "수", "월")
		 	
			1, 현재 LinkedList에는 (월, 수, 금, 일) 순서로 노드가 저장 돼 있다.
		 	2, next에 head("월")을 넣어준다.
		 	3, next가 null이 아니면, pre(null)에 current(null) 변수를 삽입한다.
		 	4, current(null)변수에 next("월")노드를 삽입한다.
		 	5, next에는 next의 다음 노드인("수")를 저장한다.
			6, current("월")노드의 링크필드에는 pre(null)를 저장한다.
			
			7, 현재 LinkedList에는 (수, 금, 일, "월") 순서로 노드가 저장 돼 있다.
			8, next가 null이 아니면, pre(null)에 current("월") 변수를 삽입한다.
			9, current("월")변수에 next("수")노드를 삽입한다.
			10, next에는 next의 다음 노드인("금")를 저장한다.
			11, current("수")노드의 링크필드에는 pre("월")를 저장한다.
			
			12, 현재 LinkedList에는 (금, 일, "수", "월") 순서로 노드가 저장 돼 있다.
			13, next가 null이 아니면, pre("월")에 current("수") 변수를 삽입한다.
			14, current("수")변수에 next("금")노드를 삽입한다.
			15, next에는 next의 다음 노드인("일")를 저장한다.
			16, current("금")노드의 링크필드에는 pre("수")를 저장한다.
			
			17, 현재 LinkedList에는 (일, "금", "수", "월") 순서로 노드가 저장 돼 있다.
			18, next가 null이 아니면, pre("수")에 current("금") 변수를 삽입한다.
			19, current("금")변수에 next("일")노드를 삽입한다.
			20, next에는 next의 다음 노드인(null)를 저장한다.
			21, current("금")노드의 링크필드에는 pre("금")를 저장한다.
			
			22, 현재 LinkedList에는 ("일", "금", "수", "월") 순서로 노드가 저장 돼 있다.
			23, next가 null이기 때문에, head(첫 번째 노드의미)에 current 노드를 저장 해 준다.	
		} // while문 끝
		    
		 */
		L.reverseList();
		L.printList();
		
		System.out.println("(4) 리스트의 마지막 노드 삭제하기");
		/*
		 	- 현재 노드 ==> (일, 금, 수, 월)
			- head는 LinkedList의 첫 번째(시작)노드를 가리킨다.
			- pre는 링크필드가 null인 노드를 찾아내는 순간, 
			- temp는
			
			1, head가 null이면 공백리스트기 때문에 함수를 return 한다.
			2, head의 링크필드 값이 null이면 리스트에 값이 1개밖에 없다는 뜻이고, head에 null을 대입해주고 printList()를 호출해 준다.
			3, 리스트에 2개 이상의 값이 있다면, 처음 한번 "pre"에는 head(첫 번째 노드)를 "temp"에는 head.link(두 번째 노드)를 저장한다.
			4, temp.link(세 번째 노드)가 null이 아니면 "pre"(첫번째노드)에는 "temp"(두번째노드)를 담아주고 
			   "temp"(두번째노드)에는 "temp.link"(세번째노드)를 담아준다.
			5, temp.link(네 번째 노드)가 null이 아니면 "pre"(두번째노드)에는 "temp"(세번째노드)를 담아주고
			   "temp"(세번째노드)에는 "temp.link"(네번째노드)를 담아준다.
			6, temp.link(다섯 번째 노드)는 null이기 때문에 while문이 종료되고, 
			   "pre.link"(세번째노드링크필드 값, 네번째노드의 주소 값)에 null을 저장하고 마지막 노드를 삭제해준다.
		 */
		L.deleteLastNode();
		L.printList();
	}
}

// 1
class LinkedList {
	private ListNode head; // 노드 객체
	
	public LinkedList() { // 기본 생성자
		head = null; // 기본생성자 null로 초기화
	}
	
	// 중간에 삽입
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data); // 새로 삽입될 "금" 노드를 생성한다.
		
		// "금"노드의 링크필드에 "수"노드의 링크필드 값을 넣어준다.(마지막값의 링크필드 값을 넣어준다.)
		newNode.link = pre.link; 
		
		// "수"노드의 링크필드에 "금"노드의 링크필드 값을 넣어준다.(기존에 있던 노드 값을 최신화시켜준다.)
		pre.link = newNode;
	}
	
	// 마지막 노드에 삽입
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data); // data를 입력받는 생성자 호출
		
		// 공백리스트면
		if(head == null) {
			this.head = newNode;
			
		// 공백리스트가 아니면
		} else {
			ListNode temp = head;
			while(temp.link != null) {
				temp = temp.link;
			} // while문 끝.
			
			temp.link = newNode;
		}
	} // insertLastNode 끝.
	
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
		ListNode next = head; // 현재 "월"데이터가 저장 돼 있다.
		ListNode current = null;
		ListNode pre = null;
		
		while(next != null) { // 공백리스트가 아니면
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;
		} // while문 끝
		
		head = current;
	}
	
	// 노드 출력하기
	public void printList() {
		ListNode temp = this.head; // head는 처음 저장된 노드를 가리키고 있다.
		System.out.printf("L = (");
		while(temp != null) { // 단순연결리스트에 값이 들어 있으면
			System.out.printf(temp.getData()); // 노드의 데이터 출력
			temp = temp.link; // 다음노드 링크를 저장
			if(temp != null) { // 다음노드 링크가 현재 노드의 링크에 저장 돼 있으면 콤마를 출력한다.
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