package test15;

public class LuckyNum {
	private int luckyNum;
	
	LuckyNum() {
		luckyNum = ((int)Math.random()*10)+1;
		
	}
	public void checkMyLuckyGuy(Person p) {
		System.out.println(p instanceof Gd);
		if(p instanceof Gd) {
			Gd gd = (Gd)p;
			gd.checkMyLuckyNum(luckyNum);
			
					
		}
	}
}
