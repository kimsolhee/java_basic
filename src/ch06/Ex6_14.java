package ch06;
class Ex6_14 {
	
	// 클래스 초기화 블럭 : 처음 메모리에 로딩될 때 한번만 수행.
	static {
		System.out.println("static { }");
	}
	
	// 인스턴스 초기화 블럭
	{
		System.out.println("{ }");
	}

	public Ex6_14() {
		System.out.println("생성자");
	}

	public static void main(String args[]) {
		
		/*
		 * 지역변수는 수동 초기화 해야함
		 * 멤버변수는 자동 초기화 된다.
		 * 
		 * 멤버변수의 초기화
		 * 1. 명시적 초기화(=) 대입연산자
		 * ex) int door = 4;  -> 기본형 변수의 초기화
		 * ex) Engine e = new Engine(); -> 참조형 변수의 초기화
		 * 
		 * 2. 초기화 블럭(여러문장이 필요할 때 복잡한 cv초기화)
		 * - 인스턴스 초기화 블럭 : {}
		 * - 클래스 초기화 블럭 : static{}
		 * 
		 * 3. 생성자(iv초기화)
		 * 
		 * 
		 * 
		 */
		
		System.out.println("Ex6_14 bt = new Ex6_14(); ");
		Ex6_14 bt = new Ex6_14();

		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
		Ex6_14 bt2 = new Ex6_14();
	}
}