package Chapter05;

public class _003_3차원배열_181Page {
	
	public static void main(String[] args) {
		int sale[][][] = new int[][][] 
				{ 
				  { {63, 84, 140, 130}, {157, 209, 251, 312} }, 
			      { {59, 80, 130, 135}, {149, 187, 239, 310} }  
				};
		
		for(int i = 0; i < 2; i++) { // 높이를 출력
			System.out.printf("<< %d 팀 >> %n", i + 1);
			for(int j = 0; j < 2; j++) { // 행을 출력
				for(int k = 0; k < 4; k++) { // 열을 출력
					System.out.printf("%d/4분기 : sale[%d][%d][%d]= %d %n", k+1, i, j, k, sale[i][j][k]);
				}
				System.out.println();
			}
		}
	}
} // main메서드 끝