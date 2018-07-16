package test18;

public class Rabbit {
	public String name;
	public int rank;

	public Rabbit(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}

	public static void main(String[] args) {
		Rabbit[] r = new Rabbit[10];
		for (int i = 0; i < r.length; i++) {
			int rank = (int) (Math.random() * 10) + 1;
			r[i] = new Rabbit(i + "¹øÂ° Åä³¢", rank);
			for (int j = i + 1; j < r.length; j++) {
				if (r[i].rank > r[j].rank) {
					Rabbit tmb = r[j];
					r[i] = r[j];
					r[j] = tmb;
				}
			}
		}
	}

	static void printArr(Rabbit[] r) {
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
	}
	
}
