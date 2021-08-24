package ch03;
class Ex3_6 {
	public static void main(String args[]) { 
		
		/*
		 * 사칙 연산자
		 * : 덧셈(+), 뺄셈(-), 곱하기(*), 나누기(/) 
		 * 
		 * 프로그래밍에서 가장 많이 사용되는 연산자
		 * 
		 */
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d%n",  a, b, a + b);
		System.out.printf("%d - %d = %d%n",  a, b, a - b);
		System.out.printf("%d * %d = %d%n",  a, b, a * b);
		System.out.printf("%d / %d = %d%n",  a, b, a / b);
		System.out.printf("%d / %f = %f%n",  a, (float)b, a / (float)b);
	}
}