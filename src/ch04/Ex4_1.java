package ch04;
class Ex4_1 {
	public static void main(String args[]) {
		
		/*
		 * 제어문(control statement)
		 * : 조건에 땨라 문장을 건너뛰고 , 같은 문장을 반복해서 수행해야할 경우 사용
		 * : 프로그램의 흐름(flow)를 바꾸는 역할을 하는 문장
		 * 
		 * 제어문에는 '조건문'과 '반복문'이있다.
		 * 
		 * 조건문
		 * : 조건에 따라 다른 문장이 수행되도록 하고, 반복문은 특정 문장들을 반복해서 수행
		 * 
		 * if문
		 * : 가장 기본적인 조건문
		 * '만일 (if) 조건식이 참(true)이면 괄호 {} 안의 문장들을 수행하라는 의미'
		 * 
		 * 
		 */
		int score = 80;

		if (score > 60) {						// 조건식
			System.out.println("합격입니다.");		// 조건식이 true이면 수행
		}
	}
}