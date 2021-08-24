package ch02;
class Ex2_5 {
   public static void main(String args[]) {
	   
	   /*
	    * 변수를 이용하면 각 변수에 다른 값만 저장하고 
	    * 나머지 부분은 바꾸지 않아도 된다.
	    */

	   	// 변수에 다른 값을 저장하기만 하면 된다.
		int x = 10;	
		int y = 5;

		// x, y의 값이 바뀌어도 변경하지 않아도 된다.
		System.out.println(x+y); 
		System.out.println(x-y);        
		System.out.println(x*y);        
		System.out.println(x/y);          
	}
}