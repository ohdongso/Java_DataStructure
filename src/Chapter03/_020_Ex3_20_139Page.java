package Chapter03;

public class _020_Ex3_20_139Page {
	
	public static void main(String[] args) {
		int a = 10, b = 0, result;
		
		try {
			result = a / b;
			System.out.println(result);
		} catch (java.lang.ArithmeticException exp) {
			System.out.println("잘못된 산술연산입니다!");
		} finally {
			System.out.println("실행 끝..");
		} // try - catch문 끝	
	}
}