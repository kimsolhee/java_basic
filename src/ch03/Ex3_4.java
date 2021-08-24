package ch03;
class Ex3_4 {
	public static void main(String[] args) {
		
		/*
		 * 부호연산자 
		 * : 피연산자의 부호를 반대로 변경한 결과를 반환
		 * : 피연산자가 음수면 양수로, 양수면 음수로
		 * 
		 * 부호 연산자는 덧셈, 뺄셈 연산자와 같은 기호를 쓰지만 다른 연산자이다.
		 */
		int i = -10;
		i = +i;
		System.out.println(i);

		i = -10;
		i = -i;
		System.out.println(i);
	}
}