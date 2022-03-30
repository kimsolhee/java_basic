package ch06;
class Ex6_2 {
	public static void main(String args[]) {
		
		/*
		 * Q.클래스(설계도)가 왜 필요한가?
		 * 	A.객체(제품)를 생성하기 위해서 필요.
		 * 
		 * Q.객체(제품)가 왜 필요한가?
		 * 	A.객체(제품)를 사용하기 위해서 필요. 
		 * 
		 * Q.객체(제품)를 사용한다는 것은?
		 * 	A.객체(제품)가 가진 속성(변수)과 기능(메서드)을 사용하기 위해.
		 * 
		 * 
		 */
		
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한문장으로 간으
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은  " + t2.channel + "입니다.");

		t1.channel = 7;    // channel 값을 7으로 한다.
		System.out.println("t1의 channel 값을 7로 면경하였습니다.");

		System.out.println("t1의 channel값은  " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은  " + t2.channel + "입니다.");
	}
}