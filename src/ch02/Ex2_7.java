package ch02;
class Ex2_7 {
	public static void main(String[] args) {
		
		/*
		 * 변수 (variable) : 하나의 값을 저장하기 위한 공간
		 * 상수 (constant) : 값을 한번만 저장할 수 있는 공간
		 * 리터럴 (literal) : 그 자체로 값을 의미하는 것
		 * 
		 * ex ) int year = 2014;
		 * 		final int MAX_VALUE = 100;
		 * 
		 * year = 변수, MAX_VALUE = 상수, 2014, 100 = 리터럴
		 * 
		 * 문자 리터럴 : 'A'와 같이 작은 따옴표로 문자 하나를 감싼 것
		 * 		   	'' 안에는 하나의 문자가 있어야 한다.
		 * 문자열 리터럴 : 두 문자 이상 큰 따옴표로 감싼 것
		 * 			"" 안에는 빈 값을 허용한다.
		 * 
		 * 빈 문자열 (empty string) : ""안에 아무런 문자도 넣지 않는 것
		 * 
		 */

		String name = "Ja" + "va"; 		// char ch = 'Java'; 이렇게 할 수 없다.
		String str  = name + 8.0;

		// 피연산자 중 어느 한 쪽이 String이면 나머지 한쪽을 먼저 String으로 변환한 다음 두  String을 결합한다.
		// 어떤 타입의 변수도 문자열과 덧셈 연산을 수행하면 그 결과가 문자열이 된다.
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
}