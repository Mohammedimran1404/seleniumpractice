package inheritance2;

import inheritance.ClassA;

public class ClassB extends ClassA{
	public void sub() {
		int a=10,b=20,c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.add();
		b.sub();

	}

}
