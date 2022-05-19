package ch06;
class Car2 {
	
	/*
	 * 생성자 this()
	 * - 생성자에서 다른 생성자 호출할 때 사용
	 * - 다른 생성자 호출시 첫 줄에서만 사용가능
	 * - 생성자의 이름으로 클래스 이름 대신 this를 사용
	 * 
	 * 
	 * 참조변수 this()
	 * - 인스턴스 자신을 가리키는 참조변수
	 * - 인스턴스 메서드(생성자 포함)에서 사용가능
	 * - 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용
	 * 
	 * 
	 * 참조변수 this와 생성자 this()
	 * 
	 * this = 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
	 *        모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.
	 *        
	 * this(), this(매개변수) = 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.
	 * 
	 * @ this와 this()는 비슷하게 생겼을 뿐 완전히 다른 것이다. @       
	 * 
	 */
	
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car2() {
		//Car2(String color, String gearType, int door)  호출
		//Car2 대신 this로 호출
		this("white", "auto", 4); 
	}

	Car2(String color) {
		//Car2(String color, String gearType, int door)  호출
		//Car2 대신 this로 호출
		this(color, "auto", 4); 
	}

	Car2(String color, String gearType, int door) {
		
		//인스턴스 변수 = 참조변수
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
class Ex6_13 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();	
		Car2 c2 = new Car2("blue");

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}