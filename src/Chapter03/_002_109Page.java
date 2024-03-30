package Chapter03;

public class _002_109Page {

	public static void main(String[] args) {
//		int i_arr2[][] = new int[2][3];
		
		// int i_arr2[][] = { {(0, 1, 2}, {10, 11, 12}}; ==> 배열선언과 초기화 동시에 할수 있다.
		int i_arr2[][] = { {0, 1, 2}, {10, 11, 12} };
		
//		i_arr2[0][0] = 0;
//		i_arr2[0][1] = 1;
//		i_arr2[0][2] = 2;
//		i_arr2[1][0] = 10;
//		i_arr2[1][1] = 11;
//		i_arr2[1][2] = 12;
		
		System.out.println("i_arr2[0][0] = " + i_arr2[0][0]);
		System.out.println("i_arr2[0][1] = " + i_arr2[0][1]);
		System.out.println("i_arr2[0][2] = " + i_arr2[0][2]);
		System.out.println("i_arr2[1][0] = " + i_arr2[1][0]);
		System.out.println("i_arr2[1][1] = " + i_arr2[1][1]);
		System.out.println("i_arr2[1][2] = " + i_arr2[1][2]);
	}
}