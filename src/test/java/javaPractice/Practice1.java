package javaPractice;

public class Practice1 {
	public static void main(String[] args) {
		
		String mangoes[]= {"mangoes","mangoes","mangoes"};
		
		for(int i=0;i<mangoes.length;i++) {
			String a=mangoes[i];
			if(a.equals("mangoes")) {
				System.out.println(a);
				break;
			}
		}
	}
}
