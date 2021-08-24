package ch02;
class Ex2_9 {
	public static void main(String[] args) {
		
		/*
		 * printf() : '지시자(specifier)'를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력한다.
		 * 지시자(specifier) : 값을 어떻게 출력할 것인지를 지시해주는 역할
		 * 
		 * %d : 10진(decimal) 정수의 형식으로 출력
		 * %x : 16진(hexa-decimal) 정수의 형식으로 출력
		 * %f : 부동 소수점(floation-point)의 형식으로 출력
		 * %c : 문자(character)로 출력
		 * %s : 문자열(string)로 출력
		 * 
		 */
		String url = "www.codechobo.com";
		float f1 = .10f;   // 0.10, 1.0e-1
		float f2 = 1e1f;   // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); 
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); 
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
		System.out.printf("[%.8s]%n", url);  // 왼쪽에서 8글자만 출력
	}
}