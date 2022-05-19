package ch06;
class Data_1 {
	
	// 생성자가 하나도 없으면 컴파일러가 기본생성자를 만들어 준다.
	int value;
}

class Data_2 {
	int value;
	
	Data_2(){} // 기본 생성자
	Data_2(int x) {   // 매개변수가 있는 생성자
		value = x;
	}
}

class Ex6_11 {
	
	/*
	 * 생성자(constructor) = iv 초기화 메서드
	 * - 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드(iv 초기화)'
	 * 
	 * 규칙
	 * - 이름이 클래스 이름과 같아야 한다.
	 * - 리턴 값이 없다.(void 안붙임)
	 * - 모든 클래스는 반드시 생성자를 가져야 한다.
	 * 
	 * ex) 인스턴스 초기화
	 * Time t = new Time(); 1.객체 생성
	 * 
	 * t.hour = 12;   2.iv 초기화
	 * t.minute = 34; 2.iv 초기화
	 * t.second = 56; 2.iv 초기화
	 * 
	 * 한줄로도 가능
	 * Time t = new Time(12, 34, 56);
	 * 
	 * 
	 * 기본 생성자(default constructor)
	 * - 매개변수가 없는 생성자
	 * - 생성자가 하나도 없을 때만, 컴파일러가 자동 추가
	 * 
	 */
	
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생
	}
}