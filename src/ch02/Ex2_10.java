package ch02;
import java.util.Scanner;    // Scanner�� ����ϱ� ���� �߰�

class Ex2_10 { 
	public static void main(String[] args) { 
		
		// Scanner 클래스의 객체를 생성
				Scanner scanner = new Scanner(System.in);

				System.out.print("두자리 정수를 하나 입력해주세요.>");
				String input = scanner.nextLine();	// 입력받은 내용을 input에 저장

				/*
				 * Integer.parseInt()라는 메서드를 이용해서 입력 받은 문자열을 숫자로 변환
				 */
				int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

				System.out.println("입력내용 :"+input);
				System.out.printf("num=%d%n", num);
	} 
}