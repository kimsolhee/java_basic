package ch03;
class Ex3_2 {
	public static void main(String args[]) {
		
		/*
		 * 증가 연산자(++) : 피연산자의 값을 1 증가
		 * 감소 연산자(--) : 피연산자의 값을 1 감소
		 * 
		 * 전위형(prefix) : 피연산자의 왼쪽에 위치  
		 * 	ex) j = ++i;
		 * 
		 * 후위형(postfix): 피연산자의 오른쪽에 위치
		 * ex) j = i++;
		 * 
		 */
		
		int i=5, j=0;

		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);

		i=5;        // 결과 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;

		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
	}
}