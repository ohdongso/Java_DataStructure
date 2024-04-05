package Chapter04;

class AccessControl_3 {
	private int num1, num2, sum;
	private double ave;
	
	AccessControl_3(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}
	
	private int getSum() {
		sum = num1 + num2;
		return sum;
	}
	
	private double getAve() {
		ave = sum / 2;
		return ave;
	}
}

public class _003_AccessControl_3_158Page {
	
	public static void main(String[] args) {
		AccessControl_3 test3 = new AccessControl_3(10, 20);
//		System.out.println("sum = " + test3.getSum());
//		System.out.println("average = " + test3.getAve());
	}
}