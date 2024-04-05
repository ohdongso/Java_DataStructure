package Chapter04;

class StudentScore extends StudentInfo {
	private int kor, eng, math, sum;
	private double ave;
	
	public StudentScore(String dept, String stdNo, String name, int kor, int eng, int math) {
		super(dept, stdNo, name); // 부모클래스의 데이터 멤버에 대한 초기화
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = 0;
		this.ave = 0.0;
	}
	
	public int getSum() {
		sum = kor + eng + math;
		return sum;
	}
	
	public double getAve() {
		ave = sum/3.0;
		return ave;
	}
	
	public void getStdInfo() {
		super.getStdInfo();
	}
	
	public void getStdScore() {
		System.out.println("** 학생 점수 출력 **");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + getSum());
		System.out.println("평균 : " + getAve());
	}
}

public class _005_StudentScore_161Page {
	
	public static void main(String[] args) {
		
	}
}