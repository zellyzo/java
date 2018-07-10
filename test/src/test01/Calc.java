package test01;

public class Calc {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		num1 = 30;
		
		System.out.println(num1+num2);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println(num1 == 30);
		System.out.println(num1 != 30);
		System.out.println(num1 >= 30);
		System.out.println(num1 <= 30);
		
		
		System.out.println("num1 - num2 = " + (num1-num2));
		System.out.println("num1 / num2 = " + num1/num2);
		System.out.println("num1 * num2 = " + num1*num2);
		
		System.out.println("3 % 2 = " + 3%2);
		
	}
}
