package ch02;
class Ex2_6 {
   public static void main(String args[]) {
	   
	   /*
	    * 변수타입
	    * : 변수를 선언할 때, 변수에 저장할 값의 종류에 따라 변수의 타입을 선택해야 한다.
	    * 
	    * 변수 타입은 기본형 8개와 참조형이 있다.
	    * 
	    * 변수타입  [숫자]
	    * int, long : 정수(integer)를 저장하기 위한 타입(20억이 넘을 땐 long)
	    * float, double : 실수(floating-point number)를 저장하기위한 타임
	    * 				: (float는 오차없이 7자리, double은 15자리)
	    * 
	    * 변수타입  [문자]
	    * char : 문자(character)를 저장하기 위한 타입
	    * String : 여러 문자(문자열, string)를 저장하기 위한 타입
	    * 
	    */

		int 	 x = 100;	// 정수 (integer)를 저장할 변수의 타입은 int로 한다.
		double pi = 3.14;	// 실수를 저장할 변수의 타입은 double로 한다.
		char 	 ch = 'a';	// 문자(1개)를 저장할 변수의 타입은 char로 한다.
		String str = "abc";	// 여러 문자(0~n)개를 저장할 변수의 타입은 String로 한다.

		System.out.println(x); 
		System.out.println(pi); 
		System.out.println(ch);
		System.out.println(str);
	}
}