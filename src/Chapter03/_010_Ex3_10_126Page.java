package Chapter03;

public class _010_Ex3_10_126Page {
	
	public static void main(String[] args) {
		_006_Week_117Page nowWeek = _006_Week_117Page.FRI;
		
		switch (nowWeek) {
		case MON:
			System.out.println("������ �������Դϴ�.");
			break;
		case TUE:
			System.out.println("������ ȭ�����Դϴ�.");
			break;
		case WED:
			System.out.println("������ �������Դϴ�.");
			break;
		case THU:
			System.out.println("������ ������Դϴ�.");
			break;
		case FRI:
			System.out.println("������ �ݿ����Դϴ�.");
			break;
		case SAT:
			System.out.println("������ ������Դϴ�.");
			break;
		default :
			System.out.println("������ �Ͽ����Դϴ�.");
		} // switch�� ��.
	
	} // main ��.
}
