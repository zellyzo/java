package test13;

public class Exec {

	public static void main(String[] args) {
		Car[] arrCar = new Car[10];
		
		Car c = new Car("name",0);
		c.name = "¼Ò³ªÅ¸";
		c.speed = 100;
		arrCar[0] = c;
		
		
		
		
		
		System.out.println(arrCar[0].name);
	}

}
