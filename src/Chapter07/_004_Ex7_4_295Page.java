package Chapter07;

class StackNode2 {
	int data;
	StackNode2 link;
}

class LinkedStack2 {
	private StackNode2 top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(int item) {
		StackNode2 newNode = new StackNode2();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		} else {
			int item = top.data;
			top = top.link;
			return item;
		}
	}
}

class OptExp2 {
	private String exp;
	
	public int evalPostfix(String postfix) {
		LinkedStack2 S = new LinkedStack2();
		exp = postfix;
		int opr1, opr2, value;
		char testCh;
		for(int i = 0; i < 7; i++) {
			testCh = exp.charAt(i);
			if(testCh != '+' && testCh != '-' && testCh != '*' && testCh != '/') {
				value = testCh - '0';
				S.push(value);
			} else {
				opr2 = S.pop();
				opr1 = S.pop();
				switch(testCh) {
					case '+' : S.push(opr1 + opr2); break;
					case '-' : S.push(opr1 - opr2); break;
					case '*' : S.push(opr1 * opr2); break;
					case '/' : S.push(opr1 / opr2); break;
				} // switch 끝.
			}
		}
		return S.pop();
	}
}

public class _004_Ex7_4_295Page {
	
	public static void main(String[] args) {
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";
		System.out.printf("\n후위표기식 : %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n 연산결과 = %d \n", result);
	}
}