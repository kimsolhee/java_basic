package ch07;
class Ex7_2 {
	
	/*
	 * 참조변수 super, this
	 * - 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에만 존재(static 메서드에서 사용불가)
	 * - 조상의 멤버를 자신의 멤버와 구별할 때 사용한다.
	 * 
	 * super : 조상멤버, 자식멤버 구별에 사용
	 * this : lv와 iv구별에 사용
	 */
	
	public static void main(String args[]) {
		Child c = new Child();
		c.method();
	}
}

class Parent { int x=10; /* super.x */}

class Child extends Parent {
	int x=20; 	/* thsi.x */

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}