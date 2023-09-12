package javaPractice;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=27;
		int avinash=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				avinash++;
			}
		}
		if(avinash==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
		
	}

}
