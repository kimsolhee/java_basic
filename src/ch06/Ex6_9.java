package ch06;
class MyMath2 {
	
	/*
	 * 인스턴스 메서드
	 * - 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출한다.
	 * - 인스턴스 멤버(iv, im)와 관련된 작업을 하는 메서드
	 * - 메서드 내에서 인스턴스 변수(iv) 사용가능
	 * 
	 * static 메서드(클래스 메서드)
	 * - 객체생성없이 '클래스이름.메서드이름()'으로 호출
	 * - 인스턴스 멤버(iv, im)와 관련없는 작업을 하는 메서드
	 * - 메서드 내에서 인스턴스 변수(iv)사용 불가
	 * 
	 * iv = 인스턴스 변수
	 * lv = 지역 변수
	 * cv = 클래스 변수
	 * 
	 * 객체 = iv 묶음  
	 * 
	 * static 메서드를 만드는 이유
	 * : 인스턴스 변수(iv)를 사용하지 않을 때.
	 * 
	 * 속성(멤버 변수) 중에서 공통 속성에 static을 붙힌다.
	 */
	
	long a, b;

	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add()		{ return a + b; }  // a, b는 인스턴스 변수
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }

	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long   add(long a, long b)		 { return a + b; }  // a, b는 지역변수
	static long   subtract(long a, long b)   { return a - b; }
	static long   multiply(long a, long b)   { return a * b; }
	static double divide(long a, long b) { return a / (double)b; }
	
}


class Ex6_9 {
	public static void main(String args[]) {
		// 클래스 메서드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));

		MyMath2 mm = new MyMath2(); // 인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		// 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
   }
}

