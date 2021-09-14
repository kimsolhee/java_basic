package ch04;
import java.util.Scanner;

class Ex4_6 {
	public static void main(String[] args) { 
		System.out.print("현재 월을 입력하세요. => ");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();  // 화면을 통해 입력받은 숫자를 month에 저장한다.
		
		/*
		 * switch문
		 * if문과 달리 switch문은 단하나의 조건식으로 많은 경우의 수를 처리할 수 있고,
		 * 표현도 간결하여서 알아보기 쉽다.
		 * 
		 * 처리할 경우의 수가 많은 경우 if문보다 switch문으로 작성하는게 좋다.
		 * 
		 * 1. 조건식을 계산한다.
		 * 2. 조건식의 결과와 일치하는 case문으로 이동한다.
		 * 3. 이후의 문장들을 수행한다.
		 * 4. break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다.
		 * 
		 * switch문의 제약조건
		 * 1. 조건식의 결과는 정수 또는 문자열이여야 한다.
		 * 2. case문의 값은 정수 상수(문자포함), 문자열만 가능하며, 중복되지 않아야한다.
		 * 
		 */
		switch(month) {
			case 3: 
			case 4: 
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default:
	//		case 12:	case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
		}
	} // main End
}