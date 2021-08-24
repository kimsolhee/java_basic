package ch02;
class Ex2_12 {
	public static void main(String args[]) {
		
		String str = "3";
		
		// 문자열을 문자로 변환
		System.out.println(str.charAt(0) - '0');
		
		// 문자를 숫자로 변환
		System.out.println('3' - '0' + 1);
		
		// 문자열을 숫자로 변환
		System.out.println(Integer.parseInt("3") + 1);
		
		// 숫자를 문자로 변환 
		System.out.println(3 + '0');  
		
	}
}