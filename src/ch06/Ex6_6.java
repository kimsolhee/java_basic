package ch06;
class Data { int x; }

class Ex6_6 {
	public static void main(String[] args) {
		
		/*
		 * 기본형 매개변수
		 * - 기본형(8개) 매개변수 - 변수의 값을 읽기만 할 수 있다.(read only)
		 * - 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다.(read & write)
		 * 
		 * 플래시 동영상 flash폴더
		 * - 기본형 매개변수 예제 : PrimitveParam.exe
		 * - 참조형 매개변수 예제 : ReferenceParam.exe
		 * 
		 */
		
		Data d = new Data(); 
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
	}

	static void change(int x) {  // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}