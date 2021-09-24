package ch05;
class Ex5_8 {
	public static void main(String[] args) {
		
		/*
		 * 다차원(multi-dimensional)
		 * 
		 * 	2차원 배열
		 * 	행(row)과 열(column)로 구성되어 있다.
		 * 	
		 * 	행index 범위 : 0 ~ 행의 길이-1
		 * 	열index 범위 : 0 ~ 열의 길이 -1
		 * 
		 */
		
		// 2차원 배열 score의 모든 요소의 합을 구하고, 출력하는 예제
		int[][] score = {
				  { 100, 100, 100 }
				, { 20, 20, 20 }
				, { 30, 30, 30 }
				, { 40, 40, 40 }
		};
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

				sum += score[i][j];
			}
		}

		System.out.println("sum=" + sum);
	}
}