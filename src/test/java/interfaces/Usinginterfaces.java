package interfaces;

public class Usinginterfaces implements Addition,Multilplication{
static int z=10;
	@Override
	public void mul() {
		int e=c*d;
		System.out.println(e);
		System.out.println(Usinginterfaces.c);
		System.out.println(Multilplication.d);
		
		
	}

	@Override
	public void add() {
		int c=a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		Usinginterfaces u =new Usinginterfaces();
		System.out.println(Usinginterfaces.z);
		u.mul();
		u.add();
	}

}
