package Chapter04;

public class _006_Ex_Student_164Page {

	public static void main(String[] args) {
		StudentInfo s_i = new StudentInfo("��ǻ�Ͱ��а�", "20072135", "ȫ�浿");
		StudentScore s_s = new StudentScore("��ǻ�Ͱ��а�", "20072140", "ȫ���", 91, 80, 95);
		
		s_i.getStdInfo();
		System.out.println();
		s_s.getStdInfo();
		s_s.getStdScore();
	}
}