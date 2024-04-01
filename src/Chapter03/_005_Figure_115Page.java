package Chapter03;

public class _005_Figure_115Page {
	
	static class Triangle implements _004_Shape_114Page {
		int x, y;
		double area;
		
		public Triangle(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void setArea() {
			this.area = this.x * this.y * 0.5;
		}
		
		public double getArea() {
			return this.area;
		}
		
	} // Triangle 클래스 끝.
	
	static class Rectangle implements _004_Shape_114Page {
		int x, y;
		double area;
		
		public Rectangle(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void setArea() {
			this.area = this.x * this.y;
		}
		
		public double getArea() {
			return this.area;
		}
	} // Rectangle 끝래스 끝.
	
	public static void main(String[] args) {
		_004_Shape_114Page Figure1 = new Triangle(5, 10);
		Figure1.setArea();
		
		_004_Shape_114Page Figure2 = new Rectangle(5, 10);
		Figure2.setArea();
		
		System.out.println("Figure1 : " + Figure1.getArea());
		System.out.println("Figure2 : " + Figure2.getArea());
	}
}