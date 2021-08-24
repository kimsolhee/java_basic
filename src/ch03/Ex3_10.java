package ch03;
class Ex3_10 {
	public static void main(String args[]) {
		
		//		    int    *    int     =     int
		long a = 1_000_000 * 1_000_000;		// 1백만
		
		//			int    *    long    =     long
		long b = 1_000_000 * 1_000_000L;	// 2백만

		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}