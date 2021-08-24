package ch03;
class Ex3_8 {
	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 자료형의 변수를 큰 자료형의 변수에 저장할 때는 자동으로 형변환 (type conversion, casting) 되지만,
		 * 반대로 큰 자료형의 값을 작은 자료형의 변수에 저장하려면 명시적으로 형변환 연산자를 사용해서 변환 해주어야 한다.
		 * 
		 */
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b); 	// 명시적 형변환
		System.out.println(c);
	}
}