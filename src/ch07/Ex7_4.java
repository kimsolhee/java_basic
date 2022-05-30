package ch07;
public class Ex7_4 {
	
	/*
	 * 조상의 생성자
	 * - 조상의 생성자를 호출할 때 사용
	 * - 조상의 멤버는 조상의 생성자를 호출해서 초기화
	 * 
	 */
	
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y); // Point(int x, int y)호출
		this.z = z;	 // 자손은 본인이 멤버만 초기화 해주는게 좋다.
	}
}