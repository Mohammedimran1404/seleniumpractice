package javaPractice;

public class AddingTwoValues {

	public static void main(String[] args) {
	AddingTwoValues a= new AddingTwoValues();
	int value1=a.sum1();
	int value2=a.sum2();
	int value3=	a.sum(value1,value2);
	a.result(value3);
		

	}
	
	public int sum1() {
		int a=10;
		return a;
		
	}
	public int sum2() {
		int b=20;
		return b;
	}
	
	public int sum(int a,int b) {
		
		int c=a+b;
		return c;
		
	}
	
	public void result(int c) {
		
	System.out.println(c);
		
	}

}
