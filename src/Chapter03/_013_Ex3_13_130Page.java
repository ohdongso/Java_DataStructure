package Chapter03;

public class _013_Ex3_13_130Page {
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i * 10;
		}
		
		for(int value : arr)
			System.out.println(value);
		
	}
}
