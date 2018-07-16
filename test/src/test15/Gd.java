package test15;

public class Gd extends Person {
	public void checkMyLuckyNum(int luckyNum) {
		System.out.println("내 행운의 번호 : " + luckyNum);
		if(this.luckyNum==luckyNum) {
			System.out.println("운수좋은날");
		}
	}
}
