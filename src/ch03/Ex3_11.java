package ch03;
class Ex3_11 {
	public static void main(String args[]) { 
		
		/*
		 * Math.round() : 반올림 메서드
		 * 
		 */
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
	}
}