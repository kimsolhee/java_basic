package ch04;
import java.util.*;

class Ex4_11 {
	public static void main(String[] args) { 
		
		/*
		 * 중첩 for문
		 * for문 안에 또 다른 for문을 포함시키는 것이 가능하며, 중첩 for문이라고 한다.
		 * 
		 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} // main End
}