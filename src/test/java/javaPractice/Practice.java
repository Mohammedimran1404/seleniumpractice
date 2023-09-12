package javaPractice;



public class Practice {
	public void m1() {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				return;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Practice p = new Practice();
		p.m1();
	}
}
