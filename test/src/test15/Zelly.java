package test15;

public class Zelly extends Person {
	public void checkMyLuckyNum(int luckyNum) {
		System.out.print("행운의번호 : " + luckyNum);
		if (this.luckyNum == luckyNum) {
			System.out.println("굿");

		}
	}
}
