package test20;

public class Exec {

	public static void start(Driv[] ds) {
		for (Driv d : ds) {
			d.start();
		}
	}

	public static void attack(Driv[] ds) {
		for (Driv d : ds) {
			System.out.println(d.attack(30));
		}
	}

	public static void stop(Driv[] ds) {
		for (Driv d : ds) {
			d.stop();
		}
	}

	public static void main(String[] args) {
		Driv[] d = new Driv[2];
		d[0] = new D1("루루", 100, 100, 50);
		d[1] = new D2("솔리드", 100, 80, 40);
		start(d);
		attack(d);
		stop(d);
	}

}
