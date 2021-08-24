package ch02;
class Ex2_2 {
	public static void main(String args[]) {
		
		/*
		 * 괄호() 안에 숫자를 넣으면 계산된 결과가 출력되지만,
		 * 큰따옴표 "" 안에 넣은 내용은 글자로 간주되어 계산되지 않고 그대로 출력한다.
		 * 
		 */
		
		System.out.println("Hello, world");   // 화면에 Hello, world가 출력된다.
		System.out.print("3+5=");             // 화면에 3+5=를 출력하고 줄바꿈 안한다.
		System.out.println(3+5);              // 화면에 8이 출력된다.
	}
}