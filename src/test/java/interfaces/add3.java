package interfaces;

public class add3 implements Add2{

	@Override
	public void add() {
		System.out.println("m");
		
	}

	@Override
	public void add2() {
		System.out.println("n");
	}
	public static void main(String[] args) {
		add3 a = new add3();
		a.add();
		a.add2();
	}


}
