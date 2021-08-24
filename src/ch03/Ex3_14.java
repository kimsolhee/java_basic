package ch03;
class Ex3_14 {
	public static void main(String[] args) {
		
		/*
		 * 두 문자열을 비교할 때는 비교 연산자 '==' 대신 equals()라는 메서드를 사용해야 한다.
		 * 
		 * 비교 연산자는 두 문자열이 완전히 같은 것인지 비교할 뿐이므로,
		 * 문자열의 내용이 같은지 비교하기 위해서는 equals()를 사용해야 한다.
		 * 
		 * equals()는 객체가 달라도 내용이 같으면 true를 반환
		 * 
		 * 대소문자를 구별하지 않고 비교하고 싶으면,
		 * equals() 대신 equalsIgnoreCase() 사용
		 * 
		 */
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); 
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}
}