package ch03;
class Ex3_1 {
	public static void main(String[] args) {
		
		/*
		 * 연산자  : '연산을 수행하는 기호'
		 * 피연산자(operand) : 연산을 수행할 때  연산의 대상
		 * 
		 * 식을 평가(evaluation) : 식을 계산하여 결과를 얻는 것 
		 * 
		 * 연산자의 종류
		 * 산술 연산자  : + - * / % << >>  		[사칙연산]
		 * 비교 연산자  : > < >= <= == !=  		[크고 작음과 같고 다름을 비교]
		 * 논리 연산자  : && || ! & | ^ ~  		[AND 또는 OR 으로 조건을 연결]
		 * 대입 연산자  : =						[우변의 값을 좌변에 저장]
		 * 기         타  : (type) ?: instanceof	[형변환 연산자, 삼항 연산자, instanceof연산자]
		 * 
		 * 연산자의 결합 규칙
		 * 1.산술 > 비교  > 논리 > 대입 (대입은 제일 마지막에 수행)
		 * 2.단항(1) > 이항(2) > 삼항(3) (단항 연산자의 우선순위가 이항 연산자보다 높다.)
		 * 3.단항 연산자와 대입 연산자를 제외한 모든 연산의 진행방향은 왼쪽에서 오른쪽이다.
		 *
		 */
		int x, y;

		x = y = 3; // y에 3이 저장된 후애, x에 3이 저장된다.
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}