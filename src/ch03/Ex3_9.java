package ch03;
class Ex3_9 {
	public static void main(String args[]) { 
		
		int a = 1_000_000;    // 1,000,000   1백만
		int b = 2_000_000;    // 2,000,000   2백만 

		long c = a * b;       // a * b = 2,000,000,000,000 ?
		
		/*
		 * c의 자료형이  long타입(8type) 이여서 저장하기에 충분해서 정상적으로 출력될 것 같지만,
		 * int타입과 int타입의 연산결과는 int타입이기 때문에 'a * b'의 결과가 이미 int타입의 값이므로,
		 * long형으로 자동 형변환되어도 값은 변하지 않는다.
		 * 
		 */
		System.out.println(c);
	}
}