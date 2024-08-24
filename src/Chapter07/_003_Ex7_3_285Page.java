package Chapter07;

interface Stack2 {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class stacknode1 {
	char data;
	stacknode1 link;
}

class LinkedStack1 implements Stack2 {
	private stacknode1 top;
	
	@Override
	public boolean isEmpty() {
		return (top == null);
	}

	@Override
	public void push(char item) {
		stacknode1 newNode = new stacknode1();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		// System.out.println("Inserted Item : " + item);
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		} else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		} else {
			top = top.link;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Linked Stack is empty!!");
			return 0;
		} else {
			return top.data;
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.printf("Linked Stack is empty!! %n %n");
		} else {
			stacknode1 temp = top;
			System.out.println("Linked Stack>> ");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			} // while�� ��.
			System.out.println();
		}
	} // printStack() �޼��� ��.
}

class OptExp {
	private String exp;
	private int expSize;
	private char testCh, openPair;
	
	public boolean testPair(String exp) {
		this.exp = exp;
		LinkedStack1 S = new LinkedStack1();
		expSize = this.exp.length();
		for(int i = 0; i < expSize; i++) { // 0~10
			testCh = this.exp.charAt(i);
			switch(testCh) {
				case '(' :
				case '{' :
				case '[' :
					S.push(testCh); break;
				case ')' :
				case '}' :
				case ']' :
					if(S.isEmpty()) {
						return false;
					} else {
						openPair = S.pop();
						if((openPair == '(' && testCh != ')') || 
						   (openPair == '{' && testCh != '}') ||
						   (openPair == '[' && testCh != ']')) {
							return false;
						} else {
							break;								
						}
					}
			} // switch�� ��.
		} // for�� ��.
		
		if(S.isEmpty()) {
			return true;
		} else {
			return false;
		}
	} // testPair() �޼��� ��.
	
	public char[] toPostFix(String infix) {
		char testCh;
		exp = infix;
		int expSize = 10;
		int j = 0;
		char postfix[] = new char[expSize];
		LinkedStack1 S = new LinkedStack1();
		
		for(int i = 0; i <= expSize; i++) {
			testCh = this.exp.charAt(i);
			switch(testCh) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				// ���ڸ� ������ �迭�� ��´�.
				postfix[j++] = testCh; break;
			
			case '+' :
			case '-' :
			case '*' :
			case '/' :
				// ��ȣ�� stack�� Ǫ���Ѵ�.
				S.push(testCh); break;
				// ������ȣ�� ���ڰ� ����� �迭�� ��ȣ�� �߰��Ѵ�.
			case ')' : postfix[j++] = S.pop(); break;
			
			default:
			} // switch�� ��.
		} // for�� ��.
		postfix[j] = S.pop();
		return postfix;
	} // toPostFix() �޼���
}

public class _003_Ex7_3_285Page {
	
	public static void main(String[] args) {
		OptExp opt = new OptExp(); // �������, testPair, toPostfix
		String exp = "(3*5)-(6/2)";
		char postfix[];
		int value;
		System.out.println(exp);
		
		if(opt.testPair(exp)) {
			System.out.println("��ȣ ����!");
		} else {
			System.out.println("��ȣ Ʋ��!!!");
		}
		
		System.out.printf("\n����ǥ��� : ");
		postfix = opt.toPostFix(exp);
		System.out.println(postfix);
	}
}