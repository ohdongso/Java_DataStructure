package Chapter07;

class OperatePoly {
	// index_X는 각 항의 포인터 역할을 한다.
	// 
	private int degree_A = 0, degree_B = 0, degree_C = 0, index_A = 0, index_B = 0, index_C = 0;
	private int expo_A, expo_B;
	private float coef_A, coef_B, coef_C;
	
	
	// 메서드, 다항식 객체2개를 받는다.
	public Polynomial addPoly(Polynomial A, Polynomial B) {
		degree_A = A.getDegree(); // 각항 최고 지수 값 저장
		degree_B = B.getDegree(); // 각항 최고 지수 값 저장
		expo_A = degree_A;
		expo_B = degree_B;
		
		// 최고 지수 값을 C에 저장
		if(degree_A >= degree_B) {
			degree_C = degree_A;
		} else {
			degree_C = degree_B; // 두 번째항 4가 저장
		}
		
		// 계산합계가 저장될 C객체 생성, 생성자로 최고 지수값을 전달
		Polynomial C = new Polynomial(degree_C);
		
		
		while(index_A <= degree_A && index_B <= degree_B) {
			if(expo_A > expo_B) {
				C.setCoef(index_C++, A.getCoef(index_A++));
				expo_A--;
			} else if(expo_A == expo_B) {
				C.setCoef(index_C++, A.getCoef(index_A++)+B.getCoef(index_B++));
				
				expo_A--; expo_B--;
			} else {
				C.setCoef(index_C++, B.getCoef(index_B++));
				expo_B--;
			}
		} // while문 끝.
		return C;
	}
}


class Polynomial {
	private int degree;
	private float coef[] = new float[20];

	// 매개변수 2개 받아서 멤버변수 초기화
	Polynomial(int degree, float coef[]) {
		this.degree = degree;
		this.coef = coef;
	}
	
	Polynomial(int degree) {
		this.degree = degree;
		for(int i = 0; i <= degree; i++) {
			this.coef[i] = 0;
		}
	}
	
	// 다항식의 최고 차항 숫자를 반환
	public int getDegree() {
		return this.degree;
	}
	
	public float getCoef(int i) {
		return this.coef[i];
	}
	
	public float setCoef(int i, float coef) {
		return this.coef[i] = coef;
	}
	
	public void printPoly() {
		int temp = this.degree;
		for(int i = 0; i <= this.degree; i++) {
			System.out.printf("%3.0fx^%d", this.coef[i], temp--);
		}
		System.out.println();
	}
}

public class _004_Ex5_4_188Page {
	
	public static void main(String[] args) {
		float a[] = new float[] {4,3,5,0}; // 계수 배열화
		float b[] = new float[] {3,1,0,2,1}; // 계수 배열화
		
		Polynomial A = new Polynomial(3, a); // 최고 값 지수와 다항식 전달
		Polynomial B = new Polynomial(4, b); // 최고 값 지수와 다항식 전달
		OperatePoly optPoly = new OperatePoly();
		Polynomial C = optPoly.addPoly(A, B);
		
		System.out.printf("A(x)="); A.printPoly();
		System.out.printf("B(x)="); B.printPoly();
		System.out.printf("C(x)="); C.printPoly();
	}
} 