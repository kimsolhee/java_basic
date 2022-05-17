package ch06;
class Ex6_5 {
	
	/*
	 * 호출 스택(call stack)
	 * 스택(stack) : 위에 차곡차곡 쌓인다.(밑이 막힌 상자)
	 * 
	 * 메서드 수행에 필요한 메모리가 제공되는 공간
	 * 메서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제
	 * 
	 */
	
	// JVM에 의해서 main메서드 호출
	public static void main(String[] args) {
		System.out.println("Hello");		
	}
}