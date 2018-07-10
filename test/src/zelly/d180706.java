package zelly;	
	
public class d180706 { // public ... 외엔 변수와 메소드의 선언만 가능 !
	// int num = 3; // 정수 선언 - 정수명 - 정수의 값
	// int[] numArr; //인트형 배열 []안 값은 인트임
	// int[] numArr2 = new int[3];
	// num = numArr // 같지 않다.
	int num = 3;
	boolean bl = true;

	void test() {
		System.out.println("난 Obj의 테스트  함수!");
	}

	// 위에 선언문은 static에서 사용 불가 하다.
	public static void main(String[] args) {
		d180706 z = new d180706();
		//클래스명 it = new InitTest();

		/*
		 * 대신 위에처럼 클래스명 변수명 = new 클래명(); 을 사용할경우 위에 변수와 메소드를 사용할 수 있다. void는 불가 / 넘기지 않는다. 리턴하지 못함
		 *  객체지향 This
		 *  접근지원 default public private protected
		 */

	}
}
