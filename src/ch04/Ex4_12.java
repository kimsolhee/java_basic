package ch04;
class Ex4_12 {
	public static void main(String[] args) { 
		int i= 5;
		
		/*
		 * while문
		 * for문에 비해 while문은 구조가 간단하다.
		 * 
		 * if문 처럼 조건식과 블럭{}만으로 이루어져 있다.
		 * if과 달리 조건식이 참인 동안 {}내의 문장을 반복한다.
		 */
		while(i--!=0) {
			System.out.println(i + " - I can do it.");
		}
	} // main End
}