package ch05;
import java.util.Arrays;  // Arrays.toString()을 사용하기 위해 추가

class Ex5_1 {
	public static void main(String[] args) {
		
		/*
		 * 배열(array)
		 * 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		 * 
		 * 중요 : 같은 타입!이여야 하는 것
		 * 
		 * 배열을 선언하는 방법
		 * 1번째 방법 => 타입[] 변수이름; 	ex) int[] score;
		 * 2번째 방법 => 타입 변수이름[]; 	ex) int score[];
		 * 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 대괄호[]를 붙힌다.
		 * 
		 * 배열을 선언한 것 => 단지 생성된 배열을 다루기 위한 참조 변수를 위한 공간을 만든 것.
		 * 배열을 생성한 것 => 값을 저장할 수 있는 공간이 만들어지는 것.
		 * 
		 * 연산자 'new'와 함께 배열의 타입과 길이를 지정해 주어야 한다.
		 * 
		 * 타입[] 변수이름; 			// 배열을 선언(배열을 다루기 위한 참조변수 선언)
		 * 변수이름 = new 타입[길이]; 	// 배열을 생성(실제 저장공간을 생성)
		 * 
		 *	ex)
		 *	int[] score;			// int타입의 배열을 다루기 위한 참조변수 score선언
		 *	score = new int[5];		// int타입의 값 5개를 저장할 수 있는 배열 생성
		 *
		 *	+ 배열의 선언과 생성을 동시에 
		 *	타입[] 변수이름 = new 타입[길이]; // ex) int[] score = new int[5];
		 *	
		 *	
		 *	'배열의 요소(element)'
		 *	생성된 배열의 각 저장 공간
		 *	'배열이름[인덱스]'의 형식으로 배열의 요소에 접근한다.
		 *	인덱스(index)는 배열의 요소마다 붙여진 일련번호로 각 요소를 구별하는데 사용된다.
		 *
		 *	! 인덱스(index의 범위는 0부터 '배열 길이 -1'까지 !
		 *	
		 *	배열의 길이(배열이름.length)
		 *	자바에서는 자바 가상 머신(JVM)이 모든 배열의 길이를 별도로 관리하며,
		 *	'배열이름.length'를 통해서 배열의 길이에 대한 정보를 얻을 있다.
		 *	
		 *	* 배열은 한번 생성하면 길이를 변경할 수 없다. *
		 *	
		 *	배열은 생성과 동시에 자동적으로 기본값(0)으로 초기화되므로 
		 *	배열을 사용하기 전에 따로 초기화를 해주지 않아도 되지만,
		 *	원하는 값을 저장하려면 각 요소마다 값을 지정해줘야한다.
		 *
		 */
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};

		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
		}

		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i] = (int)(Math.random()*10) + 1; // 1~10�� ���� �迭�� ����
		}

		// 배열에 저장된 값들을 출력한다.
		for(int i=0; i < iArr1.length;i++) {
			System.out.print(iArr1[i]+",");	
		}
		System.out.println();

		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}
}