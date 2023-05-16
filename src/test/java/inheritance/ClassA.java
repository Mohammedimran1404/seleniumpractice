package inheritance;

public class ClassA {
	
	protected void add() {
		int a=10,b=20,c=a+b;
		System.out.println(c);
	}
	
public static void main(String[] args) {
	ClassA a = new ClassA();
	a.add();
}
}
