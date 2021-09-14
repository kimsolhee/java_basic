package ch04;
import java.util.*;

class Ex4_15 {
	public static void main(String[] args) { 
		int input  = 0, answer = 0;

		answer = (int)(Math.random() * 100) + 1; // 1~100 사이의 임의의 수를 저장한다.
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * do-while문
		 * while문의  변형으로 기본적인 구조는 while문과 같으나 조건식과
		 * 블럭{}의 순서를 바꿔놓은것이다.
		 * 
		 * while문과 반대로 블럭{}을 먼저 수행한 후에 조건식을 평가한다.
		 */
		do {
			System.out.print("1과 100사이의 정수를 입력하세요. =>");
			input = scanner.nextInt();

			if(input > answer) {
				System.out.println("더 작은 수로 다시 해보세요.");	
			} else if(input < answer) {
				System.out.println("더 큰수로 다시 해보세요.");			
			}
		} while(input!=answer);

		System.out.println("정답입니다아.");
	}
}