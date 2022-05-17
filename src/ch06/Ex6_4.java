package ch06;
class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();	// MyMath 객체 생성 (인스턴스 생성)
		
		// MyMath 객체 사용(객체의 메서드 호출)
		long result1 = mm.add(5L, 3L);	 	// add 메서드 호출
		long result2 = mm.subtract(5L, 3L); // subtract 메서드 호출
		long result3 = mm.multiply(5L, 3L); // multiply 메서드 호출
		double result4 = mm.divide(5L, 3L); // divide 메서드 호출

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		
	}
 }

 class MyMath {
	 
	 /*
	  * 매개변수(parameter, 복사본)
	  * : 메서드를 호출하는 부분에서 중간 역할을 한다.
	  * 
	  * 메서드 
	  * : 작업을 마치면 호출한 곳으로 돌아온다.
	  * : 메서드는 클래스 영역에만 정의 가능하다.
	  * 
	  * return 문
	  * : 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
	  * : 반환타입이 void가 아닌 경우, 반드시 return문이 필요하다.
	  * 
	  */
	long add(long a, long b) { // long a, long b <= 입력 값(메개변수), long 출력 값
		long result = a + b;
		return result;
	//	return a + b;	// 위의 두줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
