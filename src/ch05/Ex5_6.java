package ch05;
class Ex5_6 {
	public static void main(String[] args) {
		
		/*
		 * 자바에서 char배열이 아닌 String클래스를 이용해서 문자열을 처리하는 이유
		 * : String클래스가 char배열에 여러 가지 기능을 추가하여 확장한 것
		 */
		String[] names = {"Kim", "Park", "Yi"};

		for(int i=0; i < names.length;i++)
			System.out.println("names["+i+"]:"+names[i]);

		String tmp = names[2]; 
		System.out.println("tmp:"+tmp);
		names[0] = "Yu"; 

		for(int i=0; i < names.length;i++)
			System.out.println(names[i]);
	} // main
}