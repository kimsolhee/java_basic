package ch04;
class Ex4_16 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;
		
		/*
		 * break문
		 * 반복문에서도 break문을 사용할수 있다.
		 * break문은 자신이 포함된 가장 가까운 반복문을 벗어난다.
		 * 
		 */
		while(true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}