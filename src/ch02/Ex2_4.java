package ch02;
class Ex2_4 {
   public static void main(String args[]) {
	   
	   /*
	    * 변수 : 하나의 값을 저장할 수 있는 저장공간
	    * 변수 선언 : 변수타입 변수이름;
	    * 변수이름이 필요한 이유 : 변수의 이름은 저장공간이 서로 구별될 수 있어야 하기 때문에 필요하다.
	    */

 		int x = 5;                // int x;와 x =5;를 이처럼 한 줄로 합칠 수 있다.
		System.out.println(x);    // 화면에 x의 값인 5가 출력된다.

		x = 10;                   // 변수 x에 10을 저장. 기존에 저장되어 있던 5는 지워짐. 
		System.out.println(x);    // 화면에 x의 값인 10이 출력된다.
	}
}