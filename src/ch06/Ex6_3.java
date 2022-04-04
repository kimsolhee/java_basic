package ch06;
class Ex6_3 {
	public static void main(String args[]) {
		
		/*
		 * 변수 : 하나의 데이터를 저장할 수 있는 공간.
		 * 배열 : 같은 종류의 여러 데이터를 하나의 집합으로 저장할 수 있는 공간.
		 * 구조체 : 서로 관련된 여러 데이터를 종류에 관계없이 하나의 집합으로 저장할 수 있는 공간.
		 * 클래스 : 데이터와 함수의 결합(구조체 + 함수)[설계도/데이터+함수/사용자정의 타입]
		 * 
		 * 사용자 정의 타입(user-defined type)
		 * - 기본 자료형(primitive type) 외에 프로그래머가 서로 관련된 변수들을
		 *   묶어서 하나의 타입으로 새로 추가하는 것.
		 * 
		 * 변수의 종류
		 * - 클래스 변수, 인스턴스 변수, 지역변수
		 * 
		 * 1. 인스턴스 변수(instance variable) 
		 * - 클래스 영역에 선언되며, 인스턴스를 생성할 때 만들어진다.
		 * ex) int iv; 
		 * 
		 * 2. 클래스 변수(class variable)
		 * - 클래스 변수를 선언하는 방법은 인스턴스 변수 앞에 static을 붙이기만 하면된다.
		 * - 인스턴스마다 독립적인 저장공간을 갖는 인스턴스 변수와 달리, 
		 *   클래스 변수는 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다. 
		 * ex) static int cv;
		 * 
		 * 3. 지역변수(local varible)
		 * - 메서드 내에 선언되어 메서드 내에서만 사용가능하다.
		 * - 메서드가 종료되면 소멸되어 사용할 수 없게 된다.
		 * 
		 * 인스턴스 변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만,
		 * 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다.
		 * 
		 */
		
//		클래스 변수(static 변수)는 객체생성 없이 '클래스이름.클래스 변수'로 직접 사용 가능
//		변수는 하나의 값만 저장 가능
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
//		인스턴스의 변수의 값을 변경
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
//		클래스 변수의 값을 변경
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는  (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1은 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c1.height = 80;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는  (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는  (" + c2.width + ", " + c2.height + ")");
	}
}

class Card {
	
//	인스턴스 변수
	String kind;
	int number;
	
//	 클래스 변수
	static int width = 100;
	static int height = 250;
}