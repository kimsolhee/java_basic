package ch07;
class Tv {
	
	/* 
	 * 클래스의 관계 : 1.상속, 2.포함
	 * 
	 * 상속(Inheritance) : ~은 ~이다.(is-a)
	 * - 기존의 클래스로 새로운 클래스를 작성하는 것.(코드의 재사용)
	 * - 두 클래스를 부모와 자식으로 관계를 맺어주는 것.
	 * - 자손은 조상(부모의 부모)의 모든 멤버를 상속받는다.(생성자, 초기화 블럭 제외)
	 * - 자손의 변경은 조상에 영향을 미치지 않는다.
	 * 
	 * 포함(composite) : ~은 ~을 가지고 있다.(has-a)
	 * - 클래스의 멤버로 참조변수를 선언하는 것.
	 * - 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다.
	 * ex) class Circle{    ->  Circle이 Point를 포함하고 있다.
	 * 	   	   Point c = new Point();
	 * 	       int r;
	 *    }
	 * 
	 */
	
	boolean power; // 전원상태(on/off)
	int channel;	// 채널

	void power()       {   power = !power; }
	void channelUp()   {   ++channel;      }
	void channelDown() {   --channel;      }
}

//class 자식클래스 extends(키워드) 부모클래스{
class SmartTv extends Tv {  // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;     // 캡션상태(on/off)
	void displayCaption(String text) {
		if (caption) {   // 캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

class Ex7_1 {
	public static void main(String args[]) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();			// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;	// 캡션(자막) 기능을 켠다.	       
		stv.displayCaption("Hello, World");
	}
}