package Chapter03;

public class _016_Ex3_16_134Page {
	
	public static void main(String[] args) {
		System.out.println("- main�޼ҵ� ����!");
		
		printCh('*', 10);
		
		System.out.println("- main�޼ҵ� ��!");
	}
	
	static void printCh(char ch, int num) {
		System.out.println("- printCh�޼ҵ� ����!");
		for(int i = 0; i < num; i++)
			System.out.print(ch);
		System.out.println();
		System.out.println("- printCh�޼ҵ� ��!");
	}	
}