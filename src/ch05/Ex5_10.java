package ch05;
import java.util.Scanner;

class Ex5_10{
	
	/*
	 * 배열의 비교와 출력 - equals(), toString()
	 * : toString()은 일차원 배열에만 사용할 수 있고, 
	 * 	  다차원 배열에는 deepToString()을 사용해야 한다.
	 * 
	 * 배열의 복사 - copyOf(), copyOfRange()
	 * : copyOf()는 배열전체를 뜻하고,
	 *   copyOfRange()는 배열의 일부를 복사해서 새로운 배열을 만들어 반환한다.
	 * 
	 * 배열의 정렬 - sort()
	 * : 배열을 정렬할 떄는 sort()를 사용한다.  
	 * 
	 */
	
	public static void main(String[] args) {
		String[][] words = {
			{"chair","의자"},      	// words[0][0], words[0][1]
			{"computer","컴퓨터"}, 	// words[1][0], words[1][1]
			{"integer","정수"}     	// words[2][0], words[2][1]
		};

		Scanner scanner = new Scanner(System.in);

		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

			String tmp = scanner.nextLine();

			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			} else {
			   System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
			}
		} // for
	} // main end
}