package test14;

public class ExecCom extends Pc {

		public String toString() {
			return super.toString();
		}
		
		public static void main(String[] args) {
			ExecCom e = new ExecCom();
			System.out.println(e);
	
			Lap l = new Lap();
			((Lap)l).printinfo();
			
		}

}
