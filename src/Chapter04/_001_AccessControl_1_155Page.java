package Chapter04;

class AccessControl_1 {
	int num1, num2, sum;
	double ave;
	
	public AccessControl_1(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}
	
	int getSum() {
		sum = num1 + num2;
		return sum;
	}
	
	double getAve() {
		ave = sum / 2.0;
		return ave;
	}
}

public class _001_AccessControl_1_155Page {
	
	public static void main(String[] args) {
		AccessControl_1 test1 = new AccessControl_1(10, 20);
		System.out.println("sum = " + test1.getSum());
		System.out.println("average = " + test1.getAve());
	}
}