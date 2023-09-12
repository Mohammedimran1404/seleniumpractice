package javaPractice;

public class StringImmutablity {
	public static void main(String[] args) {
		String s1="mohammed";
		System.out.println(s1.hashCode());
		 s1="mohammed"+"imran";
		System.out.println(s1.hashCode());
		
		StringBuffer sb = new StringBuffer("mohammed");
		System.out.println(sb.hashCode());
		sb.append("imran");
		System.out.println(sb.hashCode());
	}

}
