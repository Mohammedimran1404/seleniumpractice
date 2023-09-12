package javaPractice;

public class Factorial {
	public static void main(String[] args) {
		int num=5;
		int factorail=1;
		for(int i=num;i>=1;i--) {
			factorail=factorail*i;
		}
		System.out.println(factorail);
	}

}
