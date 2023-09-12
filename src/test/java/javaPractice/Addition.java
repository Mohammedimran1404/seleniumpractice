package javaPractice;

public class Addition {
	
	public int num1() {
		int a=10;
		return a;
	}
	public int num2() {
		int b=20;
		return b;
	}
	public void result(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Addition ad= new Addition();
	int a=	ad.num1();
	int b=	ad.num2();
		ad.result(a, b);
			
		}
	}


