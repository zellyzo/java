package test03;

public class DataType {
	
	public static void main(String[] args) {
		boolean bl =true;
		System.out.println(bl);
		System.out.println(1==1);
		bl=1==1;
		System.out.println(bl);
		
		int a= 3;
		int b= 4;
		
		bl= a!=b;
		
		if(a!=b) {
			System.out.println("a와b의 값은 다르네요!");
		}else {
			System.out.println("a와b의 값은 같네요!");
			
		if(bl) {
			System.out.println("a와b의 값은 다르네요!");
		}else {
			System.out.println("a와b의 값은 같네요!");
		}
		}
	}

}
	
