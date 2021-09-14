package ch04;
import java.util.Scanner;

class Ex4_5 {
	public static void main(String[] args) { 
		int  score = 0;
		char grade = ' ', opt = '0';

		System.out.print("점수를 입력하세요. => ");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장

		System.out.printf("����� ������ %d�Դϴ�.%n", score);
		/*
		 * 중첨 if문
		 * if문의 블럭 내에 또 다른 if문을 포함시키는 것
		 * 
		 * 내부의 if문은 외부의 if문보다 안쪽으로 들여쓰기를 해서 
		 * 두 if문의 범위가 명확히 구분될 수 있도록 작성해야 한다.
		 */
		if (score >= 90) {           // score가 90점 보다 같거나 크면 A학점(grade)
			grade = 'A';
			if (score >= 98) {        // 90점 이상 중에서 98점 이상은 A+
				opt = '+';	
			} else if (score < 94) {  // 90점 이상 94점 미만은 A-
				opt = '-';
			}
		} else if (score >= 80){     // score가 80점 보다 같거나 크면 B학점(grade)
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84)	{
				opt = '-';
			}
		} else {                     // 나머지는 C학점(grade)
			grade = 'C';
		}	
		System.out.printf("당신의 학점은  %c%c입니다.%n", grade, opt);
	}
}