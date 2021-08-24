package ch03;
class Ex3_7 {
	public static void main(String[] args) {
		
		/* 
		 * 산술 변환
		 * : 연산 전에 피연산자의 타입의 일치를 위해 자동 형변환되는 것
		 * 
		 */
		
		// 5 나누기 2의 결과가 2.5가 아닌 2이다.
		// 2.5 라는 실수를 결과로 얻으려면, 피연산자 중 어느 한쪽을 float와 같은 실수형으로 형변환해야 한다.
		System.out.println(5/2);
		System.out.println(5/(float)2);  //  (float)5/2의 결과도 동일
	}
}